package pkg1007;

public class AccountMain07 {

	public static void main(String[] args) {
		Account07 soo = new Account07("��ö��", 1234, 1000);// ������ �����ε�
		soo.Display();
		
//		Account07 hee = new Account07();// ������ �����ε�
//		hee.Display();

		Account07 hee = new Account07("�ڿ���", 5678, 2000);// ������ �����ε�
		hee.Display();
		
		
		//���� : ���¹�ȣ�� ������ 9999�� �ʱ�ȭ�� �� 
		Account07 kim = new Account07("������" , 10000);// ������ �����ε�
		kim.Display();

	}
}
