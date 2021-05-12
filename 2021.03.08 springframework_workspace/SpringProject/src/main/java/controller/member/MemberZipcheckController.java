package controller.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.Postcode;
import controller.common.SuperClass;
import dao.CompositeDao;

@Controller // 우편 번호 검색을 위한 컨트롤러 
public class MemberZipcheckController extends SuperClass{
	private final String command = "/zipcheck.me"; // 요청 커맨드(변경 요망)
	private final String redirect = "redirect:/xxx.me"; // 리다이렉션
	
	private ModelAndView mav = null; // 뷰에 넘겨 줄 ModelAndView 객체
	
	@Autowired
	@Qualifier("cdao")//(변경 요망)
	private CompositeDao cdao ;
	
	public MemberZipcheckController() {
		//(변경 요망)
		super("zipCheck", null); // super(getpage, postpage)
		this.mav = new ModelAndView();
	}
	
	@GetMapping(command)
	public ModelAndView doGet(
			@RequestParam(value = "dong", required = false) String dong) {
			// dong 파라미터는 검색하고자 하는 키워드를 의미합니다. 
		
		List<Postcode> lists = null;
		
		if (dong != null) {
			lists = this.cdao.SelectDataZipcode(dong);
			System.out.println("검색된 동네 갯수 : " + lists.size());
		}
		this.mav.addObject("lists", lists); // 동네 목록 컬렉션
		this.mav.addObject("dong", dong); // 동네 이름 
		
		this.mav.setViewName(super.getpage);
		return this.mav;
	}
	
//	@PostMapping(command)
//	public ModelAndView doPost() {
//		this.mav.setViewName(super.postpage);
//		return this.mav;
//	}

}
