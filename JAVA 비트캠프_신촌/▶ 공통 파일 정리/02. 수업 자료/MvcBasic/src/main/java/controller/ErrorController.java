package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import utility.Utility;

@Controller
public class ErrorController {
	@RequestMapping(value = "/error01.he", method = RequestMethod.POST)
	public String home(
			@RequestParam(value = "su1", required = false) int su1,
			@RequestParam(value = "su2", required = false) int su2,
			Model model) {

		// su2가 0이면 ArithmeticException이 발생합니다.
		int result = su1 / su2 ;

		model.addAttribute("result", result) ;
		
		String str = null ; //"hihihi";
		//NumberFormatException이 발생합니다.
//		result = Integer.parseInt(str) ;
		System.out.println(str.length());
		
		return "hihihi";
	}
	
	//  ArithmeticException : 0으로 나누기 예외 발생
	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView error(Exception ex) {
		System.out.println("해당 클래스에 대한 예외 처리기");
		return Utility.getMav("ErrResult", ex, this.getClass().toString());
	}	
}