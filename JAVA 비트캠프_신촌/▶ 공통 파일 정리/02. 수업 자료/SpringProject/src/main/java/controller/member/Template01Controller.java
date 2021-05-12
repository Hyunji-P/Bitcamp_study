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

@Controller
public class Template01Controller extends SuperClass{
	private final String command = "/aaa.me" ; 
	private ModelAndView mav = null ;
	private String redirect = "redirect:/main.co" ;
	
	@Autowired
	@Qualifier("mdao")
	private MemberDao dao ;
	
	public Template01Controller() {
		// getpage, postpage
		super("meLoginForm", "boList");
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(){		
		this.mav.setViewName(super.getpage);
		return this.mav ;
	}
	
	@PostMapping(command)
	public ModelAndView doPost(
			@RequestParam(value = "id", required = true) String id,
			@RequestParam(value = "password", required = true) String password,
			HttpSession session){
		
		// 만일 유효성 검사에 문제가 있으면, false로 변경합니다.
		boolean isCheck = true ; // 기본 값은 true입니다.
		
		if (id.length() < 4 || id.length() > 10) {
			mav.addObject(super.PREFIX + "id", "아이디는 4자리 이상 10자리 이하이어야 합니다.");
			isCheck = false ;
		}
		
		if (password.length() < 4 || password.length() > 10) {			
			mav.addObject(super.PREFIX + "password", "비밀 번호는 4자리 이상 10자리 이하이어야 합니다.");
			isCheck = false ;
		}		
		if (isCheck == true) { // 유효성 검사에 문제가 없습니다.	
			Member bean = this.dao.SelectData(id, password) ;
			
			if(bean == null) { // 로그인 실패
				String message = "아이디나 비번이 잘못되었습니다.";				
				mav.addObject("errmsg", message);
				mav.setViewName(super.getpage);
			}else{ // 로그인 성공
				// 로그인이 되었으므로 세션 영역에 로그인 정보를 바인딩합니다.
				// 이 바인딩 내용은 common.jsp 파일에서 참조하고 있습니다.
				session.setAttribute("loginfo", bean);
				
				//게시물 목록 보기 페이지
				mav.setViewName(redirect);
			}
		}else {
			mav.addObject("id", id); 
			mav.addObject("password", password);
			this.mav.setViewName(super.getpage);
		}
		
		return this.mav ;
	}
}
