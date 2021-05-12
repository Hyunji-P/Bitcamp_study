package controller.member;

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

@Controller // 회원 탈퇴 
public class MemberDeleteController extends SuperClass{
	private final String command = "/delete.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/xxx.me"; // 리다이렉션
	
	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체
	
	@Autowired
	@Qualifier("mdao")//(변경 요망)
	private MemberDao mdao ;
	
	public MemberDeleteController() {
		//(변경 요망)
		super("meLoginForm", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(
			@RequestParam(value = "id",required = true)String id, HttpSession session) {
		
		Member bean = this.mdao.SelectDataByPk(id);
		// id 파라미터가 필수 사항이며 그 파라미터를 가지고 bean 객체를 구했기 때문에 null 체크는 안해도 무방함.
		
		int cnt = -1;
		cnt = this.mdao.DeleteData(bean);
		
		// 탈퇴하는 사람에 대한 세션 정보를 완전히 비웁니다. 
		session.invalidate();
		
		
		this.mav.setViewName(super.getpage);
		return this.mav;
	}
	
//	@PostMapping(command)
//	public ModelAndView doPost() {
//		this.mav.setViewName(super.postpage);
//		return this.mav;
//	}

}
