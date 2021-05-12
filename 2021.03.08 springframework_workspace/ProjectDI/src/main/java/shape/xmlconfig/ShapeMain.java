package shape.xmlconfig;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ShapeMain {
	public static void main(String[] args) {
		// 스프링으로 풀어보기
		String configLocation = "shape/xmlconfig/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

		// id 를 토대로 찾음
		// Circle circle1 = (Circle)context.getBean("circle");

		// xml 전체에서 bean 태그를 가져옴
		Circle circle2 = context.getBean(Circle.class);
		
		Object mycircle = circle2.GetShapeOne();
		System.out.println(mycircle);
		System.out.println();
		
		List<Object> mycirclelist = circle2.GetAllShapes();
		System.out.println("<도형 리스트>");
		for (Object circle : mycirclelist) {
			System.out.println(circle.toString());
		}
		
		// 사각형 
		Rectangle rectangle = context.getBean(Rectangle.class);
		
		Object result = rectangle.GetShapeOne();
		System.out.println();
		System.out.println("사각형의 정보 : ");
		System.out.println(result);
		
		
		
		List<Object> lists = rectangle.GetAllShapes();
		System.out.println("=====사각형 목록 보기=====");
		for (Object rec : lists) {
			System.out.println(rec.toString());
		}
		
		
	}

}
