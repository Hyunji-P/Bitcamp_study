package aopexam.sample03;

//Login : 이 클래스는 Aspect입니다.
public class Login {	
	public void login(){
		//공통 기능을 별도의 클래스로 만들었습니다.
		System.out.println( "로그인 기능을 수행합니다." );		
	}
	public void welcome(){
		System.out.println( "어서 오세요. 로그인 페이지 입니다." );		
	}
}