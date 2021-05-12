package aopexam.sample03;

//로그 아웃과 관련된 공통 기능(Aspect)을 구현해 놓은 클래스
public class Logout {
	public void logout() {
		System.out.println("로그 아웃 기능을 수행합니다.");
	}
}
