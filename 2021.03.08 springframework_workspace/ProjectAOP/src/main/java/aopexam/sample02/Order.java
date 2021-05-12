package aopexam.sample02;

public class Order {

	public void order() {
		String msg = "상품 주문";
		
		Login.login(msg);
		System.out.println(msg + "하기");
		DataBase.save(msg);
		Logout.logout(msg);

	}

}
