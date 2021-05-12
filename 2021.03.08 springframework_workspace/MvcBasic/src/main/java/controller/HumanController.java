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

import model.Hobby;
import model.Human;
import model.Job;

@Controller
public class HumanController {
	@ModelAttribute("human")
	public Human some(){
		return new Human();
	}
	
	
	@ModelAttribute("speciallist")
	public String[] speciallist() {
		String[] array = {"마라톤", "중국어", "아랍어"};
	
		return array;
	}
	
	@ModelAttribute("hobbies")
	public List<Hobby> hobby_list(){
		List<Hobby> lists = new ArrayList<Hobby>();
		lists.add(new Hobby("reading", "독서"));
		lists.add(new Hobby("movie", "영화감상"));
		lists.add(new Hobby("baseball", "야구"));
		lists.add(new Hobby("football", "축구"));
		return lists;
	}
	
	@ModelAttribute("joblists")
	public List<Job> ddd(){
		List<Job> lists = new ArrayList<Job>();
		
		lists.add(new Job(0, "---선택해 주세요."));
		lists.add(new Job(1, "학생"));
		lists.add(new Job(2, "강사"));
		lists.add(new Job(3, "직원"));
		lists.add(new Job(4, "프로그래머"));
		
		return lists;
	}

	
	@RequestMapping(value="/mycaller1.hm", method = RequestMethod.GET)
	protected ModelAndView form() {
		ModelAndView mav = new ModelAndView(); //소괄호 안에 갈곳을 적지 않는 대신
		mav.setViewName("humanStart"); //humanStart파일은 접두사, 접미사 부분에 작성
		return mav;
	}
	
	//GetMapping, PostMapping 등을 사용할 수 있음
	@RequestMapping(value="/caller3.hm", method = RequestMethod.POST)
	protected ModelAndView doPost(
			@ModelAttribute("human") @Valid Human human,
			BindingResult errors) {
		
		ModelAndView mav = new ModelAndView();
		System.out.println(human.toString());
		System.out.println(errors.toString());

		
		if(errors.hasErrors()) {
			//오류가 생기면 더이상 진행해선 안됨 -> 처음 화면으로.
			mav.setViewName("humanStart");
			System.out.println("no");

		} else {
			mav.setViewName("humanEnd");
			System.out.println("yes");
		}
		return mav;
	}
	
}
	
	

