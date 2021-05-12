package shape.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeMain {
	public static void main(String[] args) {
		String configLocation = "/shape/xmlconfig/applicationContext.xml" ;
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation) ;
		
		Circle circle1 = context.getBean( Circle.class ) ;
		Object circleBean = circle1.getProductOne() ;
		System.out.println( circleBean.toString() );
		
		List<Object> circleLists = circle1.getAllProducts() ;
		//System.out.println( productLists.size() );
		System.out.println( "\n===도형 리스트===" );		
		for(Object circle : circleLists ){			
			System.out.println( circle );
		}
		
		//추가 문제 : 사각형의 밑변과 높이와 면적을 구해주는 Rectangle 클래스를 구현해 보세요.
		System.out.println("=============================================");
		Rectangle shape2 = (Rectangle)context.getBean( "rectangle" ) ;
		
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