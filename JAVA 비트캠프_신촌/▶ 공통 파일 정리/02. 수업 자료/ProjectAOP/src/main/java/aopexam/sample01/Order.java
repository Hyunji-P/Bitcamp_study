package aopexam.sample01;
public class Order {
	public void order() {
		//로그인 수행, 상품 주문, DB에 저장, 로그 아웃
		String msg = "상품 주문" ;		
		
		System.out.println( msg + "을 위한 로그인을 수행합니다." ); // 공통 기능(Aspect)
		
		System.out.println( msg + "하기" ); // 핵심 기능
		
		System.out.println( msg + " 내역을 데이터 베이스에 저장합니다." ); // 공통 기능(Aspect)
		System.out.println( msg + "을 위한 로그 아웃을 수행합니다." ); // 공통 기능(Aspect)
	}
}