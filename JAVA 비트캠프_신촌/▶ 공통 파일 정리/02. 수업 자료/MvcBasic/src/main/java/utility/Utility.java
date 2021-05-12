package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

public class Utility {
	public static File getUploadedFileInfo(MultipartFile multi, String realPath) {
		String pattern = "yyyyMMddhhmmss" ;
		SimpleDateFormat sdf = new SimpleDateFormat(pattern) ;
		String now = sdf.format( new Date() ) ;
		
		String somefile = multi.getOriginalFilename() ;
		int dot = somefile.indexOf(".") ;
		String filename = somefile.substring(0, dot) ;
		String fileext = somefile.substring(dot) ;
		String newfile = filename + now + fileext ; 
		
		String myfile = realPath + File.separator 
				+ newfile  ;
		
		return new File( myfile ); 
	}

	public static ModelAndView getMav(String jsp, Exception ex, String classname) {
		// 예외 발생시, 예외 정보를 ModelAndView에 저장하여 반환해주는 메소드입니다.
		ModelAndView mav = new ModelAndView(jsp) ;
		mav.addObject("errlocation", classname + "클래스") ;
		mav.addObject("errstring", ex.toString()) ;
		mav.addObject("errmessage", ex.getMessage()) ;
		return mav;
	}
}