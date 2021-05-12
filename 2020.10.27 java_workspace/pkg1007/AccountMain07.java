package pkg1007;

public class AccountMain07 {

	public static void main(String[] args) {
		Account07 soo = new Account07("김철수", 1234, 1000);// 생성자 오버로딩
		soo.Display();
		
//		Account07 hee = new Account07();// 생성자 오버로딩
//		hee.Display();

		Account07 hee = new Account07("박영희", 5678, 2000);// 생성자 오버로딩
		hee.Display();
		
		
		//문제 : 계좌번호가 없으면 9999로 초기화할 것 
		Account07 kim = new Account07("김유신" , 10000);// 생성자 오버로딩
		kim.Display();

	}
}
