package aopexam.sample02;

public class Order {
	public void order() {
		// 로그인 수행, 상품 주문, DB에 저장, 로그 아웃
		String msg = "상품 주문" ;		
		
		Login.login(msg) ;
		System.out.println( msg + "하기" ); // 핵심 기능
		DataBase.save(msg);
		Logout.logout(msg) ;
	}
}