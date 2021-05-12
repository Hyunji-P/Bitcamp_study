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
	@ExceptionHandler(ArithmeticException.class)
	public ModelAndView error(Exception ex) {
		System.out.println("해당 클래스에 대한 예외 처리기");
		return Utility.getMav("ErrResult", ex, this.getClass().toGenericString());
	}
	
	
	@RequestMapping(value = "/error01.he", method = RequestMethod.POST)
	public String home(
			@RequestParam(value = "num1", required = false) int num1,
			@RequestParam(value = "num2", required = false) int num2,
			Model model) {
		
			int result = num1 / num2;
			// 이부분에서 문제가 발생하면 상단 @ExceptionHandler 어노테이션에서 예외 캐치  
			
			model.addAttribute("num1", num1);
			model.addAttribute("num2", num2);
			model.addAttribute("result", result);
			
			//String str = null;
			//System.out.println(str.length());
			
		return "hihihi";
	}
}
