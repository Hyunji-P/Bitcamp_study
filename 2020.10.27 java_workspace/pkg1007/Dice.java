package pkg1007;

import java.util.Random;

public class Dice {
	private String name;// �̸�
	private int dicenum;// �ֻ��� ��
	private int[] arr;// �ֻ��� �迭

	public Dice(String name) {// ��ö��
		this.name = name;
		this.dicenum = 3;
		this.arr = new int[this.dicenum];
		this.roll();
	}

	public Dice(String name, int dicenum) {// �ڿ��� , ������
		this.name = name;
		this.dicenum = dicenum;
		if (dicenum >= 4) {
			this.dicenum = 3;
		}
		this.arr = new int[this.dicenum];
		this.roll();
	}

	private void roll() {// �ֻ����� ������ �޼ҵ�
		Random rand = new Random();

		for (int i = 0; i < this.dicenum; i++) {
			arr[i] = rand.nextInt(arr.length) + 1;

		}

	}

	private int total() {// ������ ���� �ִ� �޼ҵ�
		int total = 0;
		for (int i = 0; i < dicenum; i++) {
			total += arr[i];
		}

		return total;
	}

	public void getInfo() {
		System.out.println("�̸� : " + this.name);
		System.out.print("�ֻ��� �� : ");
		for (int i = 0; i < this.dicenum; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
		System.out.println("�հ� : " + this.total()); //println �� ��ȯ���� �־����

	}

}
