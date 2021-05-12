package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.AlbumDao;

@Controller //앨범 삭제하기
public class AlbumDeleteController {
	@Autowired
	@Qualifier("dao")
	private AlbumDao albumDao ;
	
	@RequestMapping(value="/delete.al", method=RequestMethod.GET)
	public ModelAndView handleRequest(
			@RequestParam(value = "id", required = true) int id){
		//파라미터로 넘어오는 num 값 읽어오기.
		this.albumDao.delete(id);
		
		return new ModelAndView("redirect:/list.al");
	}
}