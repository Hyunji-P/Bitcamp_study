package pkg1015;

public class SportTest {

	public static void main(String[] args) {
		// 이름 , 엔트리 , 타율
		Baseball baseball = new Baseball("야구", 9, 0.235);
		baseball.Play();
		baseball.Display();

		// 이름 , 엔트리 , 골수
		Football football = new Football("축구", 11, 5);
		football.show();

		// 다음 문장을 실행하면 "축구는 재밌어" 라는 문장이 출력 된다고 한다.
		// toString 오버라이딩 
		// football은 toString 메소드가 없고 타고 올라가서 object클래스에 주소 출력
		System.out.println(football);
	}

}
