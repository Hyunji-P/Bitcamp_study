package pkg1008;

import java.util.Scanner;

public class Fruit {
	private String itemName;// ǰ��
	private int amount;// ����
	private double unitPrice;// �ܰ�
	private double price; // �����ݾ�
	private double discountRate; // ������

	Scanner scan;

	public Fruit() {
		this.scan = new Scanner(System.in);
		this.InputData();
		this.Compute();
	}

	public void InputData() {
		System.out.print("ǰ�� : ");
		this.itemName = scan.next();
		System.out.print("���� : ");
		this.amount = scan.nextInt();
		System.out.print("�ܰ� : ");
		this.unitPrice = scan.nextDouble();
	}

	// �ݾ� = ���� * �ܰ�
	public void Compute() {
		this.price = this.amount * this.unitPrice;

		if (this.price >= 10000) {
			if (this.itemName.equals("�ٳ���")) {
				this.discountRate = 0.08;

			} else if (this.itemName.equals("���")) {
				this.discountRate = 0.05;
			}

		} else {
			if (this.itemName.equals("�ٳ���")) {
				this.discountRate = 0.03;

			} else if (this.itemName.equals("���")) {
				this.discountRate = 0.0;
			}

		}
		this.price *= (1.0 - this.discountRate);

	}

	public void Display() {
		System.out.println("ǰ�� : " + this.itemName);
		System.out.println("���� : " + this.amount + "��");
		System.out.println("�ݾ� : " + this.price + "��");

	}

}
