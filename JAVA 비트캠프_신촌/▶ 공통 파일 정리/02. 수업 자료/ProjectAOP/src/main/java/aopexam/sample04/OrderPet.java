package aopexam.sample04;

import org.springframework.stereotype.Component;

@Component(value="myorder")
public class OrderPet implements Order {
	public void order() {
		String msg = "PetShop 상품을 주문(핵심 기능)합니다. " ;
		System.out.println( msg ); //
	}
}