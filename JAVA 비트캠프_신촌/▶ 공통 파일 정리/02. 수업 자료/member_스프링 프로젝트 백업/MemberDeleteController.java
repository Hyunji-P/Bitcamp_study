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
public class MemberDeleteController extends SuperClass{
	private final String command = "/delete.me" ; 
	private ModelAndView mav = null ;
	private String redirect = "redirect:/insert.me" ;
	
	@Autowired
	@Qualifier("mdao")
	private MemberDao mdao ;
	
	public MemberDeleteController() {
		super("meLoginForm", "boList");
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(
		@RequestParam(value = "id", required = true) String id,
		HttpSession session){
		
		Member bean = mdao.SelectDataByPk(id) ;
		
		int cnt  = -99999 ;
		// 해당 id가 작성한 행의 remark 컬럼을 수정하도록 합니다.
		// 해당 회원을 삭제합니다.
		cnt =  mdao.DeleteData(bean);		
		
		session.invalidate(); // 세션 정보 클리어
		
		this.mav.setViewName(this.redirect);
		return this.mav ;
	}
	
	@PostMapping(command)
	public ModelAndView doPost(){
		this.mav.setViewName(super.postpage);
		return this.mav ;
	}
}