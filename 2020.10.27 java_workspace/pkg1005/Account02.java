package pkg1005;

public class Account02 { // Ŭ���� ����(����)
	//������� : Ŭ���� ���� ���ǵ� ���� 
	//�������� �����̸� ��� 
	
	static String bankname = "KB";
	String name;
	int no;
	int deposit;
	
	//��� �޼ҵ� ����� 
	//������������ִ� ���� ����
    void Display() {//�ν��Ͻ� �޼ҵ�
		System.out.println(name + "���� ���� ����");
		System.out.println("�ŷ�ó : " + bankname);
		System.out.println("������ : " + name);
		System.out.println("���¹�ȣ : " + no);
		System.out.println("��ġ�� : " + deposit);
		
	}
}
