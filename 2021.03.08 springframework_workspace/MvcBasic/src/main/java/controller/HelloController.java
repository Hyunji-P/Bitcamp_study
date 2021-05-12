package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// RequestMapping 어노테이션

@Controller
@RequestMapping(value="/first") 
//first는 요청을 접수해주는 어노테이션
//first가 클래스에, caller1가 메소드에 들어있으므로 이둘이 결합하면...

public class HelloController {
	@RequestMapping(value="/caller1.he", method = RequestMethod.GET)
	public String home(Model model) {
		
		//바인딩 : session.addAttribute, session.set/get Attribute 등 
		model.addAttribute("greeting", "안녕하세요");
		model.addAttribute("message", "안녕하세요");
		return "hello";
		//helloWorld.jsp의 response.sendRedirect(gotopage);가 요청하면 이곳까지옴
		//hello가 반환타입
	}
	
	@RequestMapping(value="hohoho.he", method=RequestMethod.GET)
	public ModelAndView hohoho() {
		//ModelAndView클래스
		//ModelAndView의 매개변수 hohoho
		//hohoho로 이동하라는 뜻..
		ModelAndView mav = new ModelAndView("hohoho");
		mav.addObject("hohoho", "안녕하세요hohoho");
		List<String> lists = new ArrayList<String>();
		lists.add("가나");
		lists.add("다라");
		lists.add("마바");
		mav.addObject("lists", lists);
		
		return mav;
	}
	
	@RequestMapping(value="/haha.he", method = RequestMethod.GET)
	public String hoho() {
		return "goooood";
	}

}