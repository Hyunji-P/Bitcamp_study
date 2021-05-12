package pkg1006;
// 다시 풀어보기

public class AccountMain05 {

	public static void main(String[] args) {
		//김철수에 대하여 Account05 클래스의
		//getter , setter를 구현하는 프로그램을 작성하세요.
		Account05 soo = new Account05();
		
		soo.setName("김철수");//쓰기		
		soo.setNo(1234567);//쓰기		
		soo.setBalance(50000);//쓰기	
		
		//쓰기로 값을 넣어준 데이터를 그대로 읽기
		System.out.println("예금주 : " + soo.getName());
		System.out.println("계좌번호 : " + soo.getNo());
		System.out.println("잔액 : " + soo.getBalance());
	}

}
