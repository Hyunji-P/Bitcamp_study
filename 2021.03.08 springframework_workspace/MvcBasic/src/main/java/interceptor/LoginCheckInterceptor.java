package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginCheckInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("이 메소드는 지정된 컨트롤러가 동작하기 전에 가로 채는 역할을 합니다.");
		System.out.println(this.getClass() + " preHandle 메소드 호출됨");
		
		HttpSession session = request.getSession();
		session.setAttribute("loginfo", "홍길동");// 바인딩 
		
		
		
		// false이면 컨트롤러는 동작을 멈춘다.
		// 반드시 true 값을 리턴 
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("이 메소드는 지정된 컨트롤러가 동작 마무리가 된 후에 처리됩니다.");
		System.out.println(this.getClass() + " postHandle 메소드 호출됨");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println(this.getClass() + " afterCompletion 메소드 호출됨");
		
	}
}
