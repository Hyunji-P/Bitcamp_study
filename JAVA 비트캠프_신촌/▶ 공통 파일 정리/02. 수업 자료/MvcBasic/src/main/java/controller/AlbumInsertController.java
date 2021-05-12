package controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import bean.CheckBean;
import dao.AlbumDao;

@Controller // 앨범을 추가합니다.
public class AlbumInsertController {
	@Autowired	
	@Qualifier("dao")
	private AlbumDao albumDao ;
	
	@ModelAttribute("album")
	public Album myalbum() {
		return new Album();
	}

	@RequestMapping(value="/insert.al", method=RequestMethod.GET)
	public String doGet(  ){
		return "alInsertForm" ;
	}	
	
	@ModelAttribute("mediatypelist")
	public List<CheckBean> aaa() {	
		List<CheckBean> lists = albumDao.GetList("album", "mediatype");
		return lists ;
	}
	@ModelAttribute("emailagreelist")
	public List<CheckBean> bbb() {	
		List<CheckBean> lists = albumDao.GetList("album", "emailagree");
		return lists ;
	}
	@ModelAttribute("genrelist")
	public List<CheckBean> ccc() {	
		List<CheckBean> lists = albumDao.GetList("album", "genre");
		return lists ;
	}
	
	@RequestMapping(value="/insert.al", method=RequestMethod.POST)
	protected ModelAndView doPost( 
			@ModelAttribute("album") @Valid Album xxx,
			BindingResult asdf,
			HttpServletRequest request){		
		
		ModelAndView mav = new ModelAndView() ;
		
		if ( asdf.hasErrors() ) {
			System.out.println("유효성 검사에 문제 있슴");
			System.out.println( asdf );
			mav.setViewName("alInsertForm") ;
			
		} else {
			System.out.println("유효성 검사에 문제 없슴");
			MultipartFile multi = xxx.getAbcd() ;
			String uploadPath = "/upload" ;
			//realPath :  
			String realPath = request.getRealPath( uploadPath) ;
			System.out.println(realPath);			
			
			try {
				File destination = utility.Utility.getUploadedFileInfo(multi, realPath)  ;
				
				multi.transferTo( destination );
				mav.setViewName("redirect:/list.al") ;				
				
				System.out.println(this.getClass() + " 앨범 추가하기 command 객체 정보");
				System.out.println(xxx.toString());				
				
				xxx.setImage(destination.getName());
				this.albumDao.insert( xxx );
				
			} catch (IllegalStateException e) {				
				e.printStackTrace();
				mav.setViewName("") ;
				
			} catch (Exception e) {				
				e.printStackTrace();
				mav.setViewName("redirect:/insert.al") ;
			}
		}
		return mav;
	}
}