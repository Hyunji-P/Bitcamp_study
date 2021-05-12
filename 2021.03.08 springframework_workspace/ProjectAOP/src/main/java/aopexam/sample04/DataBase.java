package aopexam.sample04;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component(value = "mydao")
@Aspect
@Order(1)
public class DataBase {
	@After("execution(public void aopexam.sample04.Board*.*()) || execution(public void aopexam.sample04.Order*.*())")
	public void dao() {// 공통 기능(aspect)
		System.out.println("데이터 베이스 작업을 수행합니다.");
	}
}
