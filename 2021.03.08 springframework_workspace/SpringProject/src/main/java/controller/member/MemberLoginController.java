package controller.member;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.Member;
import controller.common.SuperClass;
import dao.MemberDao;
import shopping.MyCartList;
import shopping.ShoppingInfo;

@Controller
public class MemberLoginController extends SuperClass {
	private final String command = "/login.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/main.co"; // 리다이렉션

	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체

	@Autowired
	@Qualifier("mdao") // (변경 요망)
	private MemberDao mdao;

	public MemberLoginController() {
		// (변경 요망)
		super("meLoginForm", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}

	@GetMapping(command)
	public ModelAndView doGet() {
		this.mav.setViewName(super.getpage);
		return this.mav;
	}

	@PostMapping(command) // 로그인 페이지에서 "로그인" 버튼을 클릭함
	public ModelAndView doPost(@RequestParam(value = "id", required = false) String id,
			@RequestParam(value = "password", required = false) String password, HttpSession session) {

		// 유효성 검사를 위한 불린 변수로 , true 이면 문제가 없습니다.
		boolean isCheck = true;

		if (id.length() < 4 || id.length() > 10) {
			mav.addObject(super.PREFIX + "id", "아이디는 4자리 이상 10자리 이하로 입력하세요.");
			isCheck = false;
		}

		if (password.length() < 4 || password.length() > 10) {
			mav.addObject(super.PREFIX + "password", "비밀번호는 4자리 이상 10자리 이하로 입력하세요.");
			isCheck = false;
		}

		if (isCheck == true) {// 이상 무
			// bean : 로그인 한 사람의 bean 정보
			Member bean = this.mdao.SelectData(id, password);

			if (bean == null) {// 로그인 실패
				String message = "아이디나 비번이 잘못 되었습니다.";
				this.mav.addObject("errmsg", message);

				this.mav.setViewName(super.getpage);
			} else {// 로그인 성공
					// 로그인에 대한 정보를 세션 영역에 바인딩 합니다.
					// 이 내용은 common.jsp 파일에서 참조하고 있습니다.

				session.setAttribute("loginfo", bean);

				// 장바구니 wish list 목록 보여 주기 기능 구현 바람
				List<ShoppingInfo> lists = this.mdao.GetShoppingInfo(bean.getId());

				if (lists.size() > 0) {// 이전에 담아 둔 목록이 1개 이상이면
					// 반복문을 사용하여 나의 카트에 저장합니다.
					MyCartList mycart = (MyCartList) session.getAttribute("mycart");
					if (mycart == null) {
						mycart = new MyCartList();
					}

					for (ShoppingInfo item : lists) {
						// 각 상품에 대하여 구매 수량을 장바구니에 추가해준다.
						mycart.AddOrder(item.getPnum(), item.getQty());

					}

					// 카트 정보 세션에 바인딩
					session.setAttribute("mycart", mycart);
				}

				this.mav.setViewName(redirect);
			}

		} else {// 이상 있음
			this.mav.addObject("id", id);
			this.mav.addObject("password", password);
			this.mav.setViewName(super.getpage);
		}

		return this.mav;
	}

}
