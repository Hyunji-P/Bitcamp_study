package pkg1006;

public class Account04 {
	static String bankname = "��������";
	String name;// ������
	int no;// ���� ��ȣ

	private int balance;// �ܾ� ����

	public void setBalance(int bal) {
		balance = bal;

	}

	public int getBalance() {
		return balance;
	}

	public void Deposit(int bal) {// �Ա� , ������ ����
		balance += bal;
	}

	public void Withdraw(int bal) {// ���� , ������ ����
		balance -= bal;
	}

	void Display() {
		System.out.println("�ŷ�ó : " + Account04.bankname);
		System.out.println("������ : " + name);
		System.out.println("���� ��ȣ : " + no);
		System.out.println("�ܾ� : " + balance);
	}
}
