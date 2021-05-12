package controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Baseball;
import model.Tool;
import model.Member;

@Controller
public class RegisterController {

	private final String requestUrl = "/register.me";
	private final String startPage = "/meRegisterForm";
	private final String gotoPage = "/meRegisterProc";

	@ModelAttribute("member")
	public Member some() {
		return new Member();
	}

	@RequestMapping(value = requestUrl, method = RequestMethod.GET)
	protected String handle() {
		return startPage;
	}

	@RequestMapping(value = requestUrl, method = RequestMethod.POST)
	// Member는 유효성 검사에 쓰임
	protected ModelAndView handle(
			// member는 jsp 참조, xxx는 메소드.
			@ModelAttribute("member") @Valid Member xxx, BindingResult errors) {

		System.out.println(xxx.toString());
		ModelAndView mav = new ModelAndView();

		if (errors.hasErrors()) {
			// 오류가 있으면 이동
			mav.setViewName(startPage);
		} else {
			mav.setViewName(gotoPage);
		}
		return mav;
	}

	@ModelAttribute("sportsTeams")
	public List<Baseball> sportsTeamsList() {
		List<Baseball> lists = new ArrayList<Baseball>();
		// 추후에 from DB
		// public Baseball(String name, String mascot)
		lists.add(new Baseball("--- 야구팀을 선택해 주세요. ---", "-"));
		lists.add(new Baseball("삼성 라이온즈", "lions"));
		lists.add(new Baseball("기어 타이거즈", "tigers"));
		lists.add(new Baseball("넥센 히어로즈", "heroes"));
		return lists;
	}

	@ModelAttribute("favorites")
	public String[] osArray() {
		String[] array = { "윈도우10", "비스타", "윈도우7", "맥", "우분투" };
		return array;
	}

	@ModelAttribute("joblists")
	public List<String> job_list() {
		List<String> lists = new ArrayList<String>();
		lists.add("---직업을 선택해 주세요.---");
		lists.add("강사");
		lists.add("직원");
		lists.add("학생");
		lists.add("주부");
		lists.add("기타");

		return lists;
	}

	@ModelAttribute("tools")
	public List<Tool> tool_list() {
		List<Tool> lists = new ArrayList<Tool>();
		// 한글이름(사용자) , 영문이름 (파라미터) 
		lists.add(new Tool("netbeans", "넷빈즈"));
		lists.add(new Tool("Eclipse", "이클립스"));
		lists.add(new Tool("SpringToolSuite", "스프링툴슈트"));

		return lists;
	}

}
