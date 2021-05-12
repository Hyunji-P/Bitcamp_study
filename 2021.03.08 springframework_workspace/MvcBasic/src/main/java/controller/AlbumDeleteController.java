package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.AlbumDao;

@Controller
public class AlbumDeleteController {// 앨범 삭제하기
	private final String requesturl = "/delete.al";
	private final String redirect = "redirect:/list.al";
	@Autowired
	@Qualifier("dao")
	AlbumDao albumDao;
	
	@RequestMapping(value = requesturl, method = RequestMethod.GET)
	public ModelAndView doGet(
		@RequestParam(value = "", required = true)int id) {
		this.albumDao.delete(id);
		return new ModelAndView(redirect);
	}
	
//	/*
//	 * @RequestMapping(value = requesturl, method = RequestMethod.POST) public
//	 * ModelAndView doPost() { ModelAndView mav = new ModelAndView();
//	 * 
//	 * 
//	 * return mav; }
//	 */
}
