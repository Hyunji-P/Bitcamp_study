package mypkg.mypet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SaramMain {
	public static void main(String[] args) {
		String configLocation = "/mypkg/mypet/applicationContext.xml" ;
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation) ;
		
		Saram hong = (Saram)context.getBean( "hong" ) ;
		
		System.out.println( hong.toString() );		
	}
}