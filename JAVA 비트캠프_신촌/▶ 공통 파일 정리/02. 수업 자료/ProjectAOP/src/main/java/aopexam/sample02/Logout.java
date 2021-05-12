package aopexam.sample02;

public class Logout {
	public static void logout(String msg){
		// 공통 기능을 별도의 클래스로 만들었습니다.
		System.out.println( msg + "을 위한 로그 아웃을 수행합니다." );		
	}
}