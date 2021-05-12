package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import dao.AlbumDao;

@Controller
public class AlbumDetailController {// 앨범 상세 보기 
	private final String requesturl = "/detail.al";
	@Autowired
	@Qualifier("dao")
	AlbumDao albumDao;
	
	@RequestMapping(value = requesturl, method = RequestMethod.GET)
	public ModelAndView  doGet(
			@RequestParam(value = "id",required = true)int id) {
		
		Album album = this.albumDao.getAlbumById(id);
		
		// 데이터가 넘어오는 지 확인하기 위해 
		System.out.println("커맨드 정보 출력");
		System.out.println(album.toString());
		
		String viewName = "alDetail";
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(viewName);
		mav.addObject("album",album);
		
		return mav;
	}
	
//	@RequestMapping(value = requesturl, method = RequestMethod.POST)
//	public ModelAndView doPost() {
//		ModelAndView mav = new ModelAndView();
//		
//		
//		return mav;
//	}
}
