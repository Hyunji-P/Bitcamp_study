package pkg0923;

public class SayHello {

	public static void main(String[] args) {
		String hello = "안녕하세요.";
		//인사말 100번 출력하기
		for (int i = 1; i < 101; i++) {
			String imsi = hello + " " + i + "번째 방문이시군요." ;
			System.out.println(imsi);

		}
	}

}
