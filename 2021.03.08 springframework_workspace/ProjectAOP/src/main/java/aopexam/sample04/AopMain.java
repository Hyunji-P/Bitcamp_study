package aopexam.sample04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		String configLocation = "aopexam/sample04/aopExam.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);
		System.out.println(context.toString());

		System.out.println("--- 상품 주문하기 ---");
		Order myorder = (Order) context.getBean("myorder");
		myorder.order();

		System.out.println();
		System.out.println("--- 게시물 주문하기 ---");
		Board myboard = (Board) context.getBean("myboard");
		myboard.board();

	}

}
