package controller.member;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.CheckBean;
import bean.Member;
import controller.common.SuperClass;
import dao.MemberDao;

@Controller // 회원 가입하기
public class MemberInsertController extends SuperClass {
	private final String command = "/insert.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/main.co"; // 리다이렉션

	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체

	@Autowired
	@Qualifier("mdao") // (변경 요망)
	private MemberDao mdao;

	public MemberInsertController() {
		// (변경 요망)
		super("meInsertForm", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}

	// 커맨드 객체 이름
	@ModelAttribute("member")
	public Member some() {
		return new Member();
	}

	@GetMapping(command)
	public ModelAndView doGet() {
		this.mav.setViewName(super.getpage);
		return this.mav;
	}

	@PostMapping(command)
	public ModelAndView doPost(
			@ModelAttribute("member") @Valid Member xxx , BindingResult error) {
		
		if (error.hasErrors()) {
			System.out.println("유효성 검사에 문제가 있습니다.");
			this.mav.setViewName(super.getpage);
		}else {
			System.out.println("유효성 검사 통과");
			// 회원 가입을 한다음 , 메인 페이지로 다시 이동합니다. 
			this.mdao.InsertData(xxx);
			this.mav.setViewName(redirect);
		}
		
		return this.mav;
	}
	
	@ModelAttribute("checklist")
	public List<CheckBean> aaa(){
		List<CheckBean> lists = this.mdao.GetList("member", "hobby", "checkbox");
		return lists;
	}
	
	@ModelAttribute("radiolist")
	public List<CheckBean> bbb(){
		List<CheckBean> lists = this.mdao.GetList("member", "gender", "radio");
		return lists;
	}
	
	@ModelAttribute("selectlist")
	public List<CheckBean> ccc(){
		List<CheckBean> lists = this.mdao.GetList("member", "job", "select");
		return lists;
	}

}
