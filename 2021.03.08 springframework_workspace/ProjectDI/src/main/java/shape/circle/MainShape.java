package shape.circle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainShape {

	public static void main(String[] args) {
		// 스프링으로 풀어보기
		String xmlfile = "shape/circle/shape.xml";// . (점) 은 / 로 적어줘야함
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlfile);
		//System.out.println(context.toString());
		
		Circle cir = (Circle)context.getBean("circle");
		System.out.println(cir.toString());
	}

}
