package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import bean.Member;
import dao.MemberDao;

@Component
public class AfterMemberInsert implements HandlerInterceptor {
	@Autowired
	@Qualifier("mdao")
	MemberDao mdao;

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String id = request.getParameter("id");
		System.out.println(this.getClass() + " preHandle 메소드");
		System.out.println("아이디 : " + id);
		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// 회원 가입이 이루어지고 나면, 이 메소드에서 session 공간에 데이터를 바인딩하도록 합니다.
		String id = request.getParameter("id");
		System.out.println(this.getClass() + " postHandle 메소드");
		System.out.println("아이디 : " + id);

		if (id != null) { // 누군가 회원 가입을 성공적으로 했습니다.
			// MemberDao mdao = new MemberDao();
			Member member = mdao.SelectDataByPk(id);

			// 세션 영역에 바인딩.
			HttpSession session = request.getSession();
			session.setAttribute("loginfo", member);
		}
	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("ccc");
	}
}