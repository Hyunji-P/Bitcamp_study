package mycomputer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComputerMain {

	// 스프링을 이용한 DI 실습
	public static void main(String[] args) {
		// mycomputer 패키지 안에 computer.xml 이라는 파일이 존재해야한다.
		// xml 파일을 스프링 설정 파일이라고 부르겠다.
		// 교안 95 ~ 97쪽
		String configLocation = "mycomputer/computer.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		// ApplicationContext : 인터페이스, ClassPathXmlApplicationContext : 클래스
		// 간단하게 : ~에 있는 xml 파일을 불러올 때 사용한다고 생각할 것
		// context 는 xml 파일을 지칭한다고 봐도 무방함.
		// System.out.println(context.toString());
		
		// xml 파일에서 bean(객체)을 가져옴 
		Computer com =  (Computer)context.getBean("computer");
		System.out.println(com.toString());
		System.out.println();
		Programmer soo =  (Programmer)context.getBean("programmer");
		System.out.println(soo.toString());
		

	}

}
