package pkg1005;

public class AccountMain02 {

	public static void main(String[] args) {// ��ü ����
		// Ŭ���� �̸����� static ������ �����ؼ� static ���� = Ŭ���� ������� �Ѵ�.
		System.out.println(Account02.bankname);//�ʱⰪ ���

		Account02 soo;
		soo = new Account02();

		Account02 hee = new Account02();

		//ö���� static ������ ���� ����
		soo.bankname = "KB";// soo : �ν��Ͻ� , bankname : static ���� -> ���
		soo.name = "��ö��";
		soo.no = 1234;
		soo.deposit = 1000;

		hee.bankname = "KB";
		hee.name = "�ڿ���";
		hee.no = 5678;
		hee.deposit = 2000;
		
		//���� ����ϴ� ö���� �ٲ� ���� ����
		System.out.println(hee.bankname);//ö���� bankname�� KB�� �ٲ���

		soo.Display();// �޼ҵ� ȣ��
		System.out.println();
		hee.Display();// �޼ҵ� ȣ��

//		System.out.println(soo.name + "���� ���� ����");
//		System.out.println("�ŷ�ó : " + soo.bankname);
//		System.out.println("������ : " + soo.name);
//		System.out.println("���¹�ȣ : " + soo.no);
//		System.out.println("��ġ�� " + soo.deposit);
//
//		System.out.println(hee.name + "���� ���� ����");
//		System.out.println("�ŷ�ó : " + hee.bankname);
//		System.out.println("������ : " + hee.name);
//		System.out.println("���¹�ȣ : " + hee.no);
//		System.out.println("��ġ�� " + hee.deposit);
	}

}
