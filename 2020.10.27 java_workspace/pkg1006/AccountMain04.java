package pkg1006;

public class AccountMain04 {

	public static void main(String[] args) {
		Account04 soo = new Account04();

		soo.name = "김철수";
		soo.no = 123456789;
//		soo.balance = 1000;
//  	만약 잔고가 변동이 있으면 입금, 인출이라는 메소드로 값을 간접접근 해야한다.

		int money = 10000;

		soo.Deposit(money);// 입금하는 동작
		soo.Deposit(5000);

		money = 3000;
		soo.Withdraw(money);
		soo.Display();
		
		System.out.println();
		System.out.println("잔액 얼마 ? " + soo.getBalance());
		
		money = 12345;
		soo.setBalance(money);
		soo.Display();
		
		


	}

}
