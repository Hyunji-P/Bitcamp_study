package controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import utility.Utility;

@ControllerAdvice(value="controller")
public class EveryoneExceptionController {
	@ExceptionHandler(Exception.class)
	public ModelAndView error(Exception ex) {
		return Utility.getMav("ErrResult", ex, this.getClass().toString());
	}	
}