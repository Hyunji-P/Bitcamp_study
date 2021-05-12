package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import dao.AlbumDao;

@Controller // 앨범 상세 보기 기능입니다.
public class AlbumDetailController {
	@Autowired
	private AlbumDao albumDao;

	@RequestMapping(value = "/detail.al", method = RequestMethod.GET)
	public ModelAndView handleRequest(@RequestParam(value = "id", required = true) int id) {

		ModelAndView mav = new ModelAndView();

		Album album = this.albumDao.getAlbumById(id);

		String viewName = "alDetail";
		mav.setViewName(viewName);
		mav.addObject("album", album);

		return mav;
	}
}