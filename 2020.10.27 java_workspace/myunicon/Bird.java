package myunicon;

public interface Bird {
	int speed = 300; // 날아 가는 속도
	// public static final int speed = 300; 과 같은 말로 public 과 반대인 private를 사용하면 오류

	// 추상 메소드(불완전한 메소드) 이기 때문에 실행 x 
	void fly();//날아가기

}
