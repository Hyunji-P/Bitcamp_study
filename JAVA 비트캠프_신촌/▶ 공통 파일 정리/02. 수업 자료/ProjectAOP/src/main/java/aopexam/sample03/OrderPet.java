package aopexam.sample03;

public class OrderPet implements Order {
	public void order() {
		String msg = "PetShop 상품을 주문(핵심 기능)합니다. " ;
		System.out.println( msg ); //
	}
}