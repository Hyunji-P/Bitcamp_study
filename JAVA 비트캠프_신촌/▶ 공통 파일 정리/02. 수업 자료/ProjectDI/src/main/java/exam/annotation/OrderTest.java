package exam.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {
	public static void main(String[] args) {
		String configLocation = "/exam/annotation/xmlbeanbind.xml" ;
		ApplicationContext context 
			= new ClassPathXmlApplicationContext( configLocation ) ;
		
		Service service = (Service)context.getBean( "hohoho" ) ;
		
		System.out.println("주문합니다");
		service.order(); 
		
		System.out.println();
		
		System.out.println("주문 취소합니다");
		service.cancel(); 		
	}
}