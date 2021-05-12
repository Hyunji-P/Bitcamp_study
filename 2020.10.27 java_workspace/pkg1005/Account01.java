package pkg1005;
//class 사용하지 않은 코딩 

//같은 은행에서 거래를 하고 있는 김철수와 박영희가 통장을 개설한다.
// 다음과 같은 변수가 필요하다고 가정한다.
// 		은행 이름(문자열) , 예금주(문자열) , 계좌 번호(숫자) , 예치금(숫자)

public class Account01 {

	public static void main(String[] args) {
		String soobank;
		String sooname;
		int soono;
		int soodeposit;

		soobank = "KB";
		sooname = "김철수";
		soono = 1234;
		soodeposit = 1000;

		System.out.println(sooname + "님의 통장 정보");
		System.out.println("거래처 : " + soobank);
		System.out.println("예금주 : " + sooname);
		System.out.println("계좌번호 : " + soono);
		System.out.println("예치금 " + soodeposit);
		System.out.println();

		String heebank;
		String heename;
		int heeno;
		int heedeposit;

		heebank = "KB";
		heename = "박영희";
		heeno = 5678;
		heedeposit = 2000;

		System.out.println(heename + "님의 통장 정보");
		System.out.println("거래처 : " + heebank);
		System.out.println("예금주 : " + heename);
		System.out.println("계좌번호 : " + heeno);
		System.out.println("예치금 " + heedeposit);

	}

}
