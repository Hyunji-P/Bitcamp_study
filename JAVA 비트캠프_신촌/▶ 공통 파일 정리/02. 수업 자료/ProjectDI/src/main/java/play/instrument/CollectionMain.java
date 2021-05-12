package play.instrument;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
	public static void main(String[] args) {
		String configLocation = "/play/instrument/collection.xml" ;
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation) ;

	    System.out.println("List �÷��� ���̾ ����");
	    Performer gunmo = (Performer)context.getBean("gunmo");
	    gunmo.perform() ;	
	    System.out.println("------------------------------------------------------");
	    System.out.println("Set �÷��� ���̾ ����");
	    Performer jinsub = (Performer)context.getBean("jinsub");
	    jinsub.perform() ;	
	    System.out.println("------------------------------------------------------");
	    System.out.println("Map �÷��� ���̾ ����");
	    Performer hun = (Performer)context.getBean("hun");
	    hun.perform() ;	
	    System.out.println("------------------------------------------------------");
	    System.out.println("Properties �÷��� ���̾ ����");
	    Performer props = (Performer)context.getBean("props");
	    props.perform() ;	
	    System.out.println("------------------------------------------------------");
	    
	}
}