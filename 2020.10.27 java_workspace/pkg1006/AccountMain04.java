package pkg1006;

public class AccountMain04 {

	public static void main(String[] args) {
		Account04 soo = new Account04();

		soo.name = "��ö��";
		soo.no = 123456789;
//		soo.balance = 1000;
//  	���� �ܰ� ������ ������ �Ա�, �����̶�� �޼ҵ�� ���� �������� �ؾ��Ѵ�.

		int money = 10000;

		soo.Deposit(money);// �Ա��ϴ� ����
		soo.Deposit(5000);

		money = 3000;
		soo.Withdraw(money);
		soo.Display();
		
		System.out.println();
		System.out.println("�ܾ� �� ? " + soo.getBalance());
		
		money = 12345;
		soo.setBalance(money);
		soo.Display();
		
		


	}

}
