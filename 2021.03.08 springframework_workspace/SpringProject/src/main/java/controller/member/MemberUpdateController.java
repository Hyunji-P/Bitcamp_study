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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.CheckBean;
import bean.Member;
import controller.common.SuperClass;
import dao.MemberDao;

@Controller
public class MemberUpdateController extends SuperClass {
	private final String command = "/update.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/main.co"; // 리다이렉션

	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체

	@Autowired
	@Qualifier("mdao") // (변경 요망)
	private MemberDao mdao;

	public MemberUpdateController() {
		// (변경 요망)
		super("meUpdateForm", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}

	// 커맨드 객체 이름
	@ModelAttribute("member")
	public Member some() {
		return new Member();
	}

	@ModelAttribute("checklist")
	public List<CheckBean> aaa() {
		List<CheckBean> lists = this.mdao.GetList("member", "hobby", "checkbox");
		return lists;
	}

	@ModelAttribute("radiolist")
	public List<CheckBean> bbb() {
		List<CheckBean> lists = this.mdao.GetList("member", "gender", "radio");
		return lists;
	}

	@ModelAttribute("selectlist")
	public List<CheckBean> ccc() {
		List<CheckBean> lists = this.mdao.GetList("member", "job", "select");
		return lists;
	}

	/* 회원 가입과는 달리 수정은 이전에 가입했던 정보를 읽어 들이는 부분이 필요합니다. */
	@GetMapping(command)
	public ModelAndView doGet(@RequestParam(value = "id", required = true) String id) {

		Member member = this.mdao.SelectDataByPk(id);
		System.out.println(member.toString());
		

		this.mav.addObject("member", member);

		this.mav.setViewName(super.getpage);
		return this.mav;
	}

	@PostMapping(command)
	public ModelAndView doPost(
			@ModelAttribute("member") @Valid Member xxx, BindingResult error) {

		if (error.hasErrors()) {
			System.out.println("유효성 검사에 문제가 있습니다.");
			System.out.println("유효성 검사 내용");
			System.out.println(error.toString());
			
			this.mav.setViewName(super.getpage);
		} else {
			System.out.println("유효성 검사 통과");

			// 회원 정보를 수정하고 , 메인 페이지로 이동합니다. 
			this.mdao.UpdateData(xxx);
			
			this.mav.setViewName(redirect);
		}

		return this.mav;
	}

}
