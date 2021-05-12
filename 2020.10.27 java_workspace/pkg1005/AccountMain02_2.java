package pkg1005;

public class AccountMain02_2 {

	public static void main(String[] args) {
		// 배열을 사용하여 다시 풀기
		// 배열 선언
		Account02[] account = new Account02[2];

		// 객체 생성
		for (int i = 0; i < account.length; i++) {
			account[i] = new Account02();

		}
		account[0].name = "김철수";
		account[0].no = 1234;
		account[0].deposit = 1000;
		
		account[1].name = "박영희";
		account[1].no = 5678;
		account[1].deposit = 2000;

		// 데이터 출력하기
		for (int i = 0; i < account.length; i++) {
			account[i].Display();
		}
	}

}
