package pkg1008;

import java.util.Scanner;

public class Sungjuk {

	private int finalexam;
	private int midexam;
	private int reportexam;
	private int attendance;
	private double sungjuk;
	private String hakjum;
	private String comment;

	Scanner scan;

	public Sungjuk() {// ȣ�� ���� �����ֱ�
		this.scan = new Scanner(System.in);
		this.InputDate();
		this.calcSungjuk();
		this.Hak();
		this.getHakjum();
	}

	public Sungjuk(int finalexam, int midexam, int reportexam, int attendance) {
		this.finalexam = finalexam;
		this.midexam = midexam;
		this.reportexam = reportexam;
		this.attendance = attendance;
		this.calcSungjuk();
		this.Hak();
		this.getHakjum();
	}

	public void InputDate() {// Scanner ������ �Է� �޼ҵ�

		System.out.print("�⸻ ��� ����: ");
		this.finalexam = scan.nextInt();

		System.out.print("�߰� ��� ����: ");
		this.midexam = scan.nextInt();

		System.out.print("����Ʈ ����: ");
		this.reportexam = scan.nextInt();

		System.out.print("�⼮ ����: ");
		this.attendance = scan.nextInt();

		this.calcSungjuk();

	}

	private double calcSungjuk() {// ���� ���ϴ� �޼ҵ�
		this.sungjuk = 0.3 * (this.finalexam + this.midexam) + 0.2 * (this.reportexam + this.attendance);

		return this.sungjuk;
	}

	private String Hak() {// ���� ���ϴ� �޼ҵ�
		if (this.sungjuk >= 90) {
			this.hakjum = "A";

		} else if (this.sungjuk >= 80) {
			this.hakjum = "B";

		} else if (this.sungjuk >= 70) {
			this.hakjum = "C";

		} else if (this.sungjuk >= 60) {
			this.hakjum = "D";

		} else {
			this.hakjum = "F";
		}

		return this.hakjum;

	}

	private String getHakjum() {// ���� �ڸ�Ʈ �޼ҵ�

		if (this.hakjum == "A" || this.hakjum == "B") {
			this.comment = "excellent";
		} else if (this.hakjum == "C" || this.hakjum == "D") {
			this.comment = "good";
		} else if (this.hakjum == "F") {
			this.comment = "poor";
		}

		return this.comment;

	}

	public void Display() { // ��� �޼ҵ�
		System.out.println("============================");
		System.out.printf("����=%.2f\n", this.calcSungjuk());
		System.out.println("����=" + this.Hak());
		System.out.println("��=" + this.getHakjum());
		System.out.println();
	}

}
