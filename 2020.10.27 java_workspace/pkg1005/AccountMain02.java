package pkg1005;

public class AccountMain02 {

	public static void main(String[] args) {// 객체 생성
		// 클래스 이름으로 static 변수를 접근해서 static 변수 = 클래스 변수라고 한다.
		System.out.println(Account02.bankname);//초기값 출력

		Account02 soo;
		soo = new Account02();

		Account02 hee = new Account02();

		//철수가 static 변수의 값을 변경
		soo.bankname = "KB";// soo : 인스턴스 , bankname : static 변수 -> 경고
		soo.name = "김철수";
		soo.no = 1234;
		soo.deposit = 1000;

		hee.bankname = "KB";
		hee.name = "박영희";
		hee.no = 5678;
		hee.deposit = 2000;
		
		//영희가 출력하니 철수가 바뀐 값이 보임
		System.out.println(hee.bankname);//철수가 bankname을 KB로 바꿨음

		soo.Display();// 메소드 호출
		System.out.println();
		hee.Display();// 메소드 호출

//		System.out.println(soo.name + "님의 통장 정보");
//		System.out.println("거래처 : " + soo.bankname);
//		System.out.println("예금주 : " + soo.name);
//		System.out.println("계좌번호 : " + soo.no);
//		System.out.println("예치금 " + soo.deposit);
//
//		System.out.println(hee.name + "님의 통장 정보");
//		System.out.println("거래처 : " + hee.bankname);
//		System.out.println("예금주 : " + hee.name);
//		System.out.println("계좌번호 : " + hee.no);
//		System.out.println("예치금 " + hee.deposit);
	}

}
