package pkg1006;

public class Account04 {
	static String bankname = "신한은행";
	String name;// 예금주
	int no;// 계좌 번호

	private int balance;// 잔액 숨김

	public void setBalance(int bal) {
		balance = bal;

	}

	public int getBalance() {
		return balance;
	}

	public void Deposit(int bal) {// 입금 , 누구나 공개
		balance += bal;
	}

	public void Withdraw(int bal) {// 인출 , 누구나 공개
		balance -= bal;
	}

	void Display() {
		System.out.println("거래처 : " + Account04.bankname);
		System.out.println("예금주 : " + name);
		System.out.println("계좌 번호 : " + no);
		System.out.println("잔액 : " + balance);
	}
}
