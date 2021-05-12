package pkg1005;

public class Account02 { // 클래스 정의(선언)
	//멤버변수 : 클래스 내에 정의된 변수 
	//보편적인 변수이름 사용 
	
	static String bankname = "KB";
	String name;
	int no;
	int deposit;
	
	//멤버 메소드 만들기 
	//정보를출력해주는 동작 수행
    void Display() {//인스턴스 메소드
		System.out.println(name + "님의 통장 정보");
		System.out.println("거래처 : " + bankname);
		System.out.println("예금주 : " + name);
		System.out.println("계좌번호 : " + no);
		System.out.println("예치금 : " + deposit);
		
	}
}
