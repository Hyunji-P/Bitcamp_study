package pkg1005;
//class ������� ���� �ڵ� 

//���� ���࿡�� �ŷ��� �ϰ� �ִ� ��ö���� �ڿ��� ������ �����Ѵ�.
// ������ ���� ������ �ʿ��ϴٰ� �����Ѵ�.
// 		���� �̸�(���ڿ�) , ������(���ڿ�) , ���� ��ȣ(����) , ��ġ��(����)

public class Account01 {

	public static void main(String[] args) {
		String soobank;
		String sooname;
		int soono;
		int soodeposit;

		soobank = "KB";
		sooname = "��ö��";
		soono = 1234;
		soodeposit = 1000;

		System.out.println(sooname + "���� ���� ����");
		System.out.println("�ŷ�ó : " + soobank);
		System.out.println("������ : " + sooname);
		System.out.println("���¹�ȣ : " + soono);
		System.out.println("��ġ�� " + soodeposit);
		System.out.println();

		String heebank;
		String heename;
		int heeno;
		int heedeposit;

		heebank = "KB";
		heename = "�ڿ���";
		heeno = 5678;
		heedeposit = 2000;

		System.out.println(heename + "���� ���� ����");
		System.out.println("�ŷ�ó : " + heebank);
		System.out.println("������ : " + heename);
		System.out.println("���¹�ȣ : " + heeno);
		System.out.println("��ġ�� " + heedeposit);

	}

}
