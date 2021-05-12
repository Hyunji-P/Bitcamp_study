package controller.member;

import java.util.List;

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
import utility.FlowParameters;
import utility.Paging;

@Controller // 관리자가 회원들의 목록을 조회하는 컨트롤러 입니다. 
public class MemberListController extends SuperClass{
	private final String command = "/list.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/xxx.me"; // 리다이렉션
	
	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체
	
	@Autowired
	@Qualifier("mdao")//(변경 요망)
	private MemberDao mdao ;
	
	public MemberListController() {
		//(변경 요망)
		super("meList", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(// 페이징 관련 파라미터들
			FlowParameters param) {
//			@RequestParam(value = "pageNumber" ,required = false)String pageNumber,
//			@RequestParam(value = "pageSize" ,required = false)String pageSize,
//			@RequestParam(value = "mode" ,required = false)String mode,
//			@RequestParam(value = "keyword" ,required = false)String keyword
		
		System.out.println("파라미터 정보를 위한 출력");
		System.out.println(param.toString());
		int totalCount = this.mdao.SelectTotalCount(param.getMode(), param.getKeyword());
		System.out.println("totalCount : " + totalCount);
		
		Paging pageInfo 
				= new Paging(
						param.getPageNumber(), 
						param.getPageSize(),
						totalCount, 
						null, 
						param.getMode(), 
						param.getKeyword());
		
		List<Member> lists =  this.mdao.SelectDataList(
								pageInfo.getOffset(), 
								pageInfo.getLimit(),
								param.getMode(), 
								param.getKeyword());
		
		
		// 스프링은 기본값으로 , request 영역에 바인딩 합니다. 
		this.mav.addObject("lists",lists);
		this.mav.addObject("pageInfo",pageInfo);
		
		// jsp 파일에서 방금 넣었던 모드와 키워드의 상태를 보여 주기 위하여 바인딩 합니다. 
		this.mav.addObject("mode", param.getMode());
		this.mav.addObject("keyword", param.getKeyword());
		
		this.mav.setViewName(super.getpage);
		return this.mav;
	}
	
//	@PostMapping(command)
//	public ModelAndView doPost() {
//		this.mav.setViewName(super.postpage);
//		return this.mav;
//	}

}
