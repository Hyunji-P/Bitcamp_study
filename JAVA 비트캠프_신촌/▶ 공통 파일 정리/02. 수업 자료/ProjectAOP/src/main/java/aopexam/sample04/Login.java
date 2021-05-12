package aopexam.sample04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component(value="mylogin") 
@Aspect
public class Login {
	@Before ("execution(public void aopexam.sample04.Board*.*()) || execution(public void aopexam.sample04.Order*.*())")
	public void login(){ // 공통적인 기능을 별도의 클래스로 만들었습니다.	
		System.out.println("로그인을 수행합니다.");
	}
}