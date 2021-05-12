package shape.annotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation = "/shape/annotation/applicationContext.xml" ;
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation) ;
		
		//@Component("myCircle")으로 설정된 항목을 찾는다.
		Shape shape1 = context.getBean( "myCircle", Shape.class ) ;
		Object shapeBean1 = shape1.getProductOne() ;		
		System.out.println( "원의 정보 : " + shapeBean1.toString() );		
		List<Object> shapeLists1 = shape1.getAllProducts() ;

		System.out.println( "\n===원 목록 보기===" );		
		for(Object obj : shapeLists1 ){			
			System.out.println( obj );
		}
		
		System.out.println("=============================================");
		Shape shape2 = context.getBean( "myRectangle", Shape.class ) ;
		
		Object shapeBean2 = shape2.getProductOne() ;		
		System.out.println( "사각형의 정보 : " +  shapeBean2.toString() );	
		
		List<Object> shapeLists2 = shape2.getAllProducts() ;
		//System.out.println( productLists.size() );
		System.out.println( "\n===사각형 목록 보기===" );	
		for(Object obj : shapeLists2 ){			
			System.out.println( obj );
		}
	}
}