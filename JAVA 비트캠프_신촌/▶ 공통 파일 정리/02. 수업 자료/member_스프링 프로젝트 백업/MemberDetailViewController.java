package controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.Member;
import controller.common.SuperClass;
import dao.MemberDao;

@Controller
public class MemberDetailViewController extends SuperClass{
	private final String command = "/detailview.me" ; 
	private ModelAndView mav = null ;
	//private String redirect = "redirect:/insert.me" ;
	
	@Autowired
	@Qualifier("mdao")
	private MemberDao mdao ;
	
	public MemberDetailViewController() {
		super("meDetailView", null);
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(
		@RequestParam(value = "id", required = true) String id,
		HttpSession session){
		
		Member bean = mdao.SelectDataByPk(id) ;
		
		this.mav.addObject("bean", bean);		
		this.mav.setViewName(super.getpage);
		return this.mav ;
	}	
}