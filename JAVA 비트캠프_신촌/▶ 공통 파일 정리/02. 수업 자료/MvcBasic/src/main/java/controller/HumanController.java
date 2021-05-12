package controller ;

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
	
	@ModelAttribute("hobbies") 
	public List<Hobby> hobby_list(){
		// 리스트 컬렉션을 사용하여 목록을 만듭니다.
		// 차후에는 데이터 베이스를 사용하길 권장합니다.
		List<Hobby> lists = new ArrayList<Hobby>() ;
		
		lists.add(new Hobby("reading", "독서")) ;
		lists.add(new Hobby("movie", "영화 감상")) ;
		lists.add(new Hobby("baseball", "야구")) ;
		lists.add(new Hobby("football", "축구")) ;
		
		return lists ;
	}	
	
	
	// @ModelAttribute 어노테이션을 사용하여 셋팅해두면 
	// 뷰(jsp) 파일에 이 내용을 참조할 수 있습니다.
	@ModelAttribute("joblists")
	public List<Job> ddd() {
		// 리스트 컬렉션을 사용하여 목록을 만듭니다.
		// 차후에는 데이터 베이스를 사용하길 권장합니다.
		List<Job> lists = new ArrayList<Job>();
		
		lists.add(new Job(0, "---선택해 주세요"));
		lists.add(new Job(1, "학생"));
		lists.add(new Job(2, "강사"));
		lists.add(new Job(3, "직원"));
		lists.add(new Job(4, "프로그래머"));
		return lists;
	}

	@ModelAttribute("speciallist")
	// 체크 박스에 보여 지는 항목을 배열로 리턴하고 있습니다.
	public String[] specialList(){ 
		String[] array = {"마라톤", "중국어", "아랍어"};
		return  array ;
	}
	
	@RequestMapping(value = "/mycaller.hm", method = RequestMethod.GET)
	protected ModelAndView form2(Human human) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("humanStart");
		return mav;
	}

	@ModelAttribute("human") 
	public Human some(){ 
		return new Human(); 
	}		
	
//	// ① 설명 : @ModelAttribute 어노테이션에 설정된 이름이 "human"이므로
//	// view에 ${human.name}의 형식으로 참조할 수 있다.
//
//	// ② 설명 : http 메소드 중에서 POST 방식만 처리해주는 메소드
	@RequestMapping(value = "/caller3.hm", method = RequestMethod.POST) // ②
	protected ModelAndView handle(
			@ModelAttribute("human") @Valid Human human, // ① 
						BindingResult errors)  {	
		ModelAndView mav = new ModelAndView();
		System.out.println(this.getClass() + " 커맨드 객체 정보 출력");
		System.out.println(human.toString());
		if (errors.hasErrors() ) { // 오류가 존재하면
			mav.setViewName("humanStart");	
			//System.err.println("yes");
		} else {
			mav.setViewName("humanEnd");
			//System.err.println("no");
		}
		return mav;
	}
}