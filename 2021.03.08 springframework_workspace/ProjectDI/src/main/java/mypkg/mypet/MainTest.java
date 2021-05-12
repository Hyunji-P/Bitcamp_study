package mypkg.mypet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		String xmlfile = "mypkg/mypet/animal.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(xmlfile);

		Saram hong = (Saram) context.getBean("saram");
		System.out.println(hong.toString());

	}

}
