package play.instrument;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	public static void main(String[] args) {
		String configLocation = "/play/instrument/collection.xml" ;
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation) ;

	    System.out.println("List 컬렉션 와이어링 예시");
	    Performer gunmo = (Performer)context.getBean("gunmo");
	    gunmo.perform() ;	
	    System.out.println("------------------------------------------------------");
	    System.out.println("Set 컬렉션 와이어링 예시");
	    Performer jinsub = (Performer)context.getBean("jinsub");
	    jinsub.perform() ;	
	    System.out.println("------------------------------------------------------");
	    System.out.println("Map 컬렉션 와이어링 예시");
	    Performer hun = (Performer)context.getBean("hun");
	    hun.perform() ;	
	    System.out.println("------------------------------------------------------");
	    System.out.println("Properties 컬렉션 와이어링 예시");
	    Performer props = (Performer)context.getBean("props");
	    props.perform() ;	
	    System.out.println("------------------------------------------------------");
	    
	}
}