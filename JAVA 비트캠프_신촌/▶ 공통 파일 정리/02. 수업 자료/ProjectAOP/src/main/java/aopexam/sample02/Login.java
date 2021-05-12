package aopexam.sample02;

public class Login {
	public static void login( String msg ){
		// 공통 기능을 별도의 클래스로 만들었습니다.
		System.out.println( msg + "을 위한 로그인을 수행합니다." );
	}
}