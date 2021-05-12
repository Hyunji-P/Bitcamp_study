package controller.member;

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


@Controller // 아이디 중복 체크
public class MemberIdcheckController extends SuperClass{
	private final String command = "/idcheck.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/xxx.me"; // 리다이렉션
	
	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체
	
	@Autowired
	@Qualifier("mdao")//(변경 요망)
	private MemberDao mdao ;
	
	public MemberIdcheckController() {
		//(변경 요망)
		super("idCheck", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command) // 파라미터 id 를 이용하여 테이블에 존재하는지 파악합니다. 
	public ModelAndView doGet(
			@RequestParam(value = "id", required = true)String id) {
		System.out.println("idcheck");
		
		Member bean = this.mdao.SelectDataByPk(id);
		
		// "isCheck"의 값이 true 이면 사용 가능한 아이디 
		if (bean != null) { // 이미 id 가 존재 
			if (bean.getId().equalsIgnoreCase("admin")) { // 관리자인 경우 
				this.mav.addObject("message", "admin은(는) <font color='red'><b>사용 불가능</b></font>한 아이디 입니다.<br> <font color='red'><b>관리자</b></font>를 위한 아이디 입니다.");
				this.mav.addObject("isCheck", false);
			}else {
				this.mav.addObject("message", id +"은(는) 이미 <font color='red'><b>사용중</b></font>인 아이디입니다.");
				this.mav.addObject("isCheck", false);
			}
		}else { // 새로운 id 
			this.mav.addObject("message", id +"은(는) <font color='blue'><b>사용 가능</b></font>한 아이디 입니다.");
			this.mav.addObject("isCheck", true);
					
		}
		this.mav.setViewName(super.getpage);	
		return this.mav;
	}
	
	@PostMapping(command)
	public ModelAndView doPost() {
		this.mav.setViewName(super.postpage);
		return this.mav;
	}

}
