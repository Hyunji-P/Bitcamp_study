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

import model.Baseball;
import model.Member;
import model.Tool;


@Controller
public class RegisterController{
	// 야구 팀과 마스코드 정보를 담고 있는 컬렉션
	// request.setAttribute("sportsTeams", lists) ; 와 등가의 코딩입니다.	
	@ModelAttribute("sportsTeams") 
	public List<Baseball> sportsTeamList(){
		List<Baseball> lists = new ArrayList<Baseball>() ;
		lists.add(new Baseball("삼성 라이온즈", "lions")) ;
		lists.add(new Baseball("기아 타이거스", "tigers")) ;
		lists.add(new Baseball("넥센 히어로즈", "heroes")) ;
		//이 메소드는 직업 선택을 위한 라디오 버튼에 넣기 위한 항목입니다.
		return lists ;
	}
	
	@ModelAttribute("favoritesOsNames") 
	public String[] osArray(){ //체크 박스에 보여 지는 항목을 배열로 리턴하고 있습니다.
		String[] array = {"윈도우XP", "비스타", "윈도우7", "우분투", "맥" };
		return  array ;
	}
	
	@ModelAttribute("tools") 
	public List<Tool> tool_list(){
		List<Tool> lists = new ArrayList<Tool>() ;
		lists.add(new Tool("NetBeans", "넷빈즈")) ;
		lists.add(new Tool("eclipses", "이클립스")) ;
		lists.add(new Tool("STS", "스프링툴슈트")) ;
		//이 메소드는 직업 선택을 위한 라디오 버튼에 넣기 위한 항목입니다.
		return lists ;
	}	

	@ModelAttribute("joblists") 
	public List<String> job_list(){
		List<String> lists = new ArrayList<String>() ;
		lists.add("강사") ;
		lists.add("직원") ;
		lists.add("학생") ;
		lists.add("주부") ;
		lists.add("기타") ;
		
		//이 메소드는 직업 선택을 위한 <select> 태그에 넣기 위한 항목이다.
		//여기서 리턴된 lists는 jsp 파일에서 "joblists"라는 이름으로 접근을 할 수 있습니다.
		return lists ;
	}		
	
	//@ModelAttribute 어노테이션으로 Member 객체를 생성한다.
	//MemberBean member = new MemberBean();
	//그러면, 이 member 객체는 <form:form> 태그에서 사용할 수 있습니다.
	//그리고, @RequestMapping을 사용하는 요청 처리 메소드에서 이 member 객체를 참조할 수 있습니다.
	
	//다음 메시지는 <form:form> 태그에서 나타나는 오류 메시지이다.
	//Neither BindingResult nor plain target object for bean name 'member' available as request attribute
	//at org.springframework.web.servlet.support.BindStatus.<init>(BindStatus.java:141)
	
	@ModelAttribute("member") 
	public Member some(){ 
		return new Member(); 
	}	 
	
	private final String requestUrl = "/register.me" ;  
	private final String startPage = "meRegisterForm" ;
	private String gotoPage = "register/meRegisterProc" ; 

	@RequestMapping(value = requestUrl , method=RequestMethod.GET)
	protected String handle()  {
		return startPage ;
	}

	//사용자가 "/register.do" 요청을 POST 방식으로 요청하게 되면
	@RequestMapping(value = requestUrl, method=RequestMethod.POST)
	protected ModelAndView handle(
			@ModelAttribute("member") @Valid Member xxx,			
			BindingResult bindingResult)  {		
		// Member 빈 클래스에 대한 유효성 검사를 수행한 다음, 이상이 없다면, 
		// "member"이라는 이름으로 커맨드 객체를 저장시켜서 View 파일에서 참조할 수 있습니다.
		
		System.out.println("["  + xxx.isAgreement() + "]" );
		
		ModelAndView mav = new ModelAndView() ;
		
		if (bindingResult.hasErrors() ) {
			mav.setViewName(startPage) ;			
		} else {
			mav.setViewName(gotoPage) ;					
		}
		return mav;
	}
}