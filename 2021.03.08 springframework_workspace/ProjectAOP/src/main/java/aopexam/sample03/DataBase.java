package aopexam.sample03;

//데이터 베이스와 관련된 공통 기능(Aspect)을 구현해 놓은 클래스
public class DataBase {
	public void dao() {
		System.out.println("데이터 베이스 작업을 수행합니다.");
	}
}
