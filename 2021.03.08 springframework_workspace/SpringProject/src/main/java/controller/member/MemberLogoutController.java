package controller.member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.Member;
import bean.Product;
import controller.common.SuperClass;
import dao.MemberDao;
import dao.ProductDao;
import shopping.MyCartList;
import shopping.ShoppingInfo;

@Controller
public class MemberLogoutController extends SuperClass{
	private final String command = "logout.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/xxx.me"; // 리다이렉션
	
	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체

	// 회원 관련 
	@Autowired
	@Qualifier("mdao")//(변경 요망)
	private MemberDao mdao ;

	// 상품 관련
	@Autowired
	@Qualifier("pdao")//(변경 요망)
	private ProductDao pdao ;
	
	public MemberLogoutController() {
		//(변경 요망)
		super("meLoginForm", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(HttpSession session) {
		// 세션 공간에 장바구니의 wish list 가 있다면
		// ShoppingInfos 테이블에 저장하는 루틴 코딩 요망 
		
		// 카트 정보 읽어 오기 
		MyCartList mycart = (MyCartList)session.getAttribute("mycart");
		
		if (mycart != null) {
			Map<Integer, Integer> maplists = mycart.GetAllOrderLists();
			
			System.out.println("지금 로그아웃 중이시군요.");
			System.out.println("장바구니 품목 갯수 : " + maplists.size());
			
			Member mem = (Member)session.getAttribute("loginfo");
			
			Set<Integer> keylist = maplists.keySet();
			
			// 반복문을 돌리고 그 내용물을 담을 바구니 
			List<ShoppingInfo> lists = new ArrayList<ShoppingInfo>();
			
			// pnum은 상품 번호(기본 키)
			for(Integer pnum : keylist) {
				// bean은 장바구니 내의 품목 1개 
				Product bean = this.pdao.SelectDataByPk(pnum);  
				
				ShoppingInfo shpInfo = new ShoppingInfo();
				shpInfo.setMid(mem.getId()); // 고객 아이디
				shpInfo.setPnum(pnum); // 상품 번호 
				shpInfo.setPname(mem.getName()); // 상품명
				
				int qty = maplists.get(pnum); // 
				shpInfo.setQty(qty);; // 구매한 수량
				shpInfo.setPrice(bean.getPrice()); // 구매단가
				shpInfo.setImage(bean.getImage()); // 관련 이미지
				shpInfo.setPoint(bean.getPoint()); // 적립시켜 줄 포인트
				
				lists.add(shpInfo);
			}
			
			// 차후 로그인 시 읽어 오기 위하여 ShoppingInfos 테이블에 데이터를 추가한다. 
			mdao.InsertCartData(mem, lists);
		}
		
		
		
		
		
		// 세션 영역의 모든 정보를 휘발 시킨다.
		session.invalidate();
		
		this.mav.setViewName(super.getpage);
		return this.mav;
	}
	
	

}
