package aopexam.sample04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value="mydao") 
@Aspect // 공통 관심 사항으로 사용하겠습니다.
// after 어드바이스의 경우 order 속성의 값이 클 숫자일수록 먼저 실행이 됩니다.
@Order (1) // 실행될 순서를 지정합니다.
public class DataBase {
	// @After : 핵심 사항들이 수행되고 나서 이 메소드가 수행이 됩니다.
	// aopexam.sample04 패키지 내의 Board로 시작하거나 Order로 시작하는 모든 메소드에 대하여 처리하겠습니다.
	@After ("execution(public void aopexam.sample04.Board*.*()) || execution(public void aopexam.sample04.Order*.*())")
	public void dao(){
		System.out.println("데이터 베이스 작업을 수행합니다.");
	}
}