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
	private final String command = "/logout.me" ; 
	private ModelAndView mav = null ;
	// private String redirect = "redirect:/main.co" ;
	
	@Autowired
	@Qualifier("mdao")
	private MemberDao mdao ;
	
	@Autowired
	@Qualifier("pdao")
	private ProductDao pdao ;
	
	public MemberLogoutController() {
		super("meLoginForm", "boList");
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(
			HttpSession session){
		
		// 만약 세션 공간에 장바구니 정보가 있다면
		// 이 정보를 장바구니 임시 테이블에 저장합니다.
		MyCartList mycart= (MyCartList)session.getAttribute("mycart") ;
		
		if (mycart != null) {			
			Map<Integer, Integer> maplists = mycart.GetAllOrderLists() ;
			
			// 카트에 내용물이 없더라도, 기존 잔여 데이터가 있을 수 있으므로 
			// 다오는 무조건 호출합니다.
			Member mem = (Member)session.getAttribute("loginfo") ;
			
			System.out.println("로그 아웃 중이군요.");
			System.out.println("장바구니 품목 사이즈 : " + maplists.size());
			System.out.println(mdao == null);
			
			Set<Integer> keylist = maplists.keySet() ;
			System.out.println("상품 개수 : " + keylist.size()); 
			
			List<ShoppingInfo> lists = new ArrayList<ShoppingInfo>() ;
			for(Integer pnum : keylist){				
				Product bean = pdao.SelectDataByPk(pnum) ;
				ShoppingInfo shpInfo = new ShoppingInfo() ;
				
				shpInfo.setMid(mem.getId());
				shpInfo.setPnum(pnum);
				shpInfo.setPname(bean.getName());
				int qty = maplists.get(pnum) ;
				shpInfo.setQty(qty);
				shpInfo.setPrice(bean.getPrice());
				shpInfo.setImage(bean.getImage());
				shpInfo.setPoint(bean.getPoint());
				lists.add(shpInfo) ;
			}			
			mdao.InsertCartData(mem, lists) ;			
		}
		
		// 로그인 정보를 세션 영역에서 지우기
		session.invalidate();  
		
		this.mav.setViewName(super.getpage);
		return this.mav ;
	}
}
