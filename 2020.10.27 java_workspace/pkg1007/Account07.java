package pkg1007;

import java.util.Scanner;

public class Account07 {
	private String name;
	private int no;
	private int balance;

	Scanner scan;// Ŭ���� �ȿ� ��� scan : �ν��Ͻ� ���� , Scanner : Ŭ����

	public Account07(String name, int no, int balance) {
		this();// �Ű������� ���� ������ ȣ���

		// ���� : �������� ���� �����ΰ��� �����ϰ� �� �� �� ���ȴ�.
		this.scan = new Scanner(System.in);// Scanner : ������

		// ���� : �ν��Ͻ� ������ ���� �ʱ�ȭ �� �뵵�� ���ȴ�.
		this.name = name;
		this.no = no;
		this.balance = balance;
//		this.Display();

	}

	public Account07() {// ������
		System.out.println("ȣ��!!");
		// heap �޸𸮿� ��ü�� ������ ������ �����ڰ� �ڵ����� 1���� ȣ��
		// �����ڰ� �����ڸ� ��������Ƿ� �⺻ �����ڴ� ������� �����ڴ� 1���̴�
	}

	// ������ ��� �ּ� ó�� : hee ��ü�� ���� ����
	// why? �Ű������� 0���� ���� �⺻ ������ 1���� �ǹ� �ϱ� ������

	public Account07(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.no = 9999;
	}

	public void Display() {
		System.out.println("������ : " + this.name);
		System.out.println("���� ��ȣ : " + this.no);
		System.out.println("��ġ�� : " + this.balance);
		System.out.println();

	}

}
