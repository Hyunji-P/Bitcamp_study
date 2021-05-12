package mypkg.config;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigTestMain {

	public static void main(String[] args) {
		// @Configuration 어노테이션을 읽어 들이려면
		// AnnotationConfigApplicationContext 를 사용하면된다.
		// 매개변수는 클래스명
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyJavaConfig.class);
		System.out.println(ac.toString());
		System.out.println("=============================");

		Member hong = ac.getBean("myuser", Member.class);
		System.out.println(hong.toString());
		System.out.println("=============================");

		Member park = ac.getBean("myuser1", Member.class);
		System.out.println(park.toString());
		System.out.println("=============================");

		Member choi = ac.getBean("renamechoi", Member.class);
		System.out.println(choi.toString());
		System.out.println("=============================");

		List<Member> lists = ac.getBean("allList", List.class);
		for (Member mem : lists) {
			System.out.println(mem.toString());
			System.out.println();
		}

	}

}
