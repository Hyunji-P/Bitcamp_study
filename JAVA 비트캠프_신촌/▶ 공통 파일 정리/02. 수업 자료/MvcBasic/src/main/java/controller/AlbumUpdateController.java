package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

//import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import bean.Album;
import bean.CheckBean;
import dao.AlbumDao;

@Controller // 앨범 정보를 수정합니다.
public class AlbumUpdateController {
	private final String commandName = "album" ;
	private String redirect = "redirect:/update.al";
	
	private static final String gotoPage = "update.al";
	private static final String getPage = "redirect:/update.al";
	
	@Autowired	
	private AlbumDao albumDao ;
	
	@ModelAttribute(commandName)
	public Album yyy(){
		return new Album() ;
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
	
	
	@RequestMapping(value="/update.al", method=RequestMethod.GET)
	public ModelAndView handleRequest(
			@RequestParam(value = "id", required = true) int id){
		
		System.out.println("UpdateFormController:id = " + id);	

		Album album = this.albumDao.getAlbumById( id );

		System.out.println(this.getClass() + " handleRequest 메소드의 앨범 정보");
		System.out.println(album.toString());	
		
		return new ModelAndView("alUpdateForm", "album", album);
	}	

	@RequestMapping(value="/update.al", method=RequestMethod.POST)
	protected ModelAndView handle( @ModelAttribute( commandName ) @Valid Album xxx, 
			BindingResult asdf, HttpServletRequest request){
		System.out.println( "post method : " + xxx.toString() );
		
		ModelAndView mav = new ModelAndView() ;
		
		if ( asdf.hasErrors() ) {
			System.out.println("유효성 검사에 문제 있슴");
			System.out.println( asdf );			
			mav.setViewName( "alUpdateForm" ) ;			
		} else {
			System.out.println("유효성 검사에 문제 없슴");
			MultipartFile multi = xxx.getAbcd() ;
			String uploadPath = "/upload" ;
			
			//String realPath = this.servletContext.getRealPath( uploadPath ) ;
			
			String realPath = request.getRealPath( uploadPath ) ;
			
			System.out.println( realPath ); 
			
			String myfile = realPath + File.separator + multi.getOriginalFilename() ;
			
			File destination = new File( myfile ) ;
			
			try {
				System.out.println(this.getClass() + " 앨범 수정하기 command 객체 정보");
				System.out.println(xxx.toString());						
				
				multi.transferTo( destination );				
				this.albumDao.update( xxx );
				mav.setViewName( getPage );
				
			} catch (IllegalStateException e) {
				e.printStackTrace();
				mav.setViewName( redirect + "?id=" + xxx.getId() );
				
			} catch (IOException e) {
				e.printStackTrace();
				mav.setViewName( redirect + "?id=" + xxx.getId() );
			}				
		}		
		return mav ;
	}
}