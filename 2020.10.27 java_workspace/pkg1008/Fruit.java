package pkg1008;

import java.util.Scanner;

public class Fruit {
	private String itemName;// 품명
	private int amount;// 수량
	private double unitPrice;// 단가
	private double price; // 최종금액
	private double discountRate; // 할인율

	Scanner scan;

	public Fruit() {
		this.scan = new Scanner(System.in);
		this.InputData();
		this.Compute();
	}

	public void InputData() {
		System.out.print("품명 : ");
		this.itemName = scan.next();
		System.out.print("수량 : ");
		this.amount = scan.nextInt();
		System.out.print("단가 : ");
		this.unitPrice = scan.nextDouble();
	}

	// 금액 = 수량 * 단가
	public void Compute() {
		this.price = this.amount * this.unitPrice;

		if (this.price >= 10000) {
			if (this.itemName.equals("바나나")) {
				this.discountRate = 0.08;

			} else if (this.itemName.equals("사과")) {
				this.discountRate = 0.05;
			}

		} else {
			if (this.itemName.equals("바나나")) {
				this.discountRate = 0.03;

			} else if (this.itemName.equals("사과")) {
				this.discountRate = 0.0;
			}

		}
		this.price *= (1.0 - this.discountRate);

	}

	public void Display() {
		System.out.println("품명 : " + this.itemName);
		System.out.println("수량 : " + this.amount + "개");
		System.out.println("금액 : " + this.price + "원");

	}

}
