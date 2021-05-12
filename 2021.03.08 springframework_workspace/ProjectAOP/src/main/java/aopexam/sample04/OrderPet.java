package aopexam.sample04;

import org.springframework.stereotype.Component;

@Component("myorder")
public class OrderPet implements Order {

	@Override
	public void order() {
		String msg = "PetShop 상품을 주문합니다.";
		System.out.println(msg);

	}

}
