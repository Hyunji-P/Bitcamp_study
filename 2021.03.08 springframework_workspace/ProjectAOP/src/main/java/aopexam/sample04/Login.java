package aopexam.sample04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component(value = "mylogin")
@Aspect
public class Login {
	@Before("execution(public void aopexam.sample04.Board*.*()) || execution(public void aopexam.sample04.Order*.*())")
	public void login() {// 공통 기능(aspect)
		System.out.println("로그인을 수행합니다.");
	}
}
