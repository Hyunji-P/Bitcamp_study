package pkg0929;

//main �޼ҵ忡�� ��ĳ�ʸ� ����Ͽ� �̸��� ���̸� �Է� ��������.
//�̸��� ���̸� �Է� �޾Ƽ� ������ִ� namePrint() �޼ҵ带 ������ ������.
//��ĳ�� 
//	nextInt() : ���� �Է�
//  next() : ���ڿ� �Է� 

import java.util.Scanner;

public class Method08 {

	static void namePrint(String a, int b) {
		System.out.println("�̸� : " + a);
		System.out.println("���� : " + b);

		// printf �� ����ϱ�
		// String imsi = "�̸� : %s , ���� : %d";
		// System.out.printf(imsi , a , b);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�̸��� �Է��ϼ���.");
		String name = scan.next();

		System.out.println("���̸� �Է��ϼ���.");
		int age = scan.nextInt();

		namePrint(name, age);// �޼ҵ� ȣ��

	}

}
