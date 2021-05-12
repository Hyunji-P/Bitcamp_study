package aopexam.sample03;

// 로그인과 관련된 공통 기능(Aspect)을 구현해 놓은 클래스
public class Login {
	public void login() {
		System.out.println("로그인 기능을 수행합니다.");
	}
	
	public void welcome() {
		System.out.println("어서 오세요...로그인 페이지입니다.");
	}
}
