package pkg1007;

import java.util.Random;

public class Dice {
	private String name;// 이름
	private int dicenum;// 주사위 수
	private int[] arr;// 주사위 배열

	public Dice(String name) {// 김철수
		this.name = name;
		this.dicenum = 3;
		this.arr = new int[this.dicenum];
		this.roll();
	}

	public Dice(String name, int dicenum) {// 박영희 , 김유신
		this.name = name;
		this.dicenum = dicenum;
		if (dicenum >= 4) {
			this.dicenum = 3;
		}
		this.arr = new int[this.dicenum];
		this.roll();
	}

	private void roll() {// 주사위를 던지는 메소드
		Random rand = new Random();

		for (int i = 0; i < this.dicenum; i++) {
			arr[i] = rand.nextInt(arr.length) + 1;

		}

	}

	private int total() {// 총합을 구해 주는 메소드
		int total = 0;
		for (int i = 0; i < dicenum; i++) {
			total += arr[i];
		}

		return total;
	}

	public void getInfo() {
		System.out.println("이름 : " + this.name);
		System.out.print("주사위 수 : ");
		for (int i = 0; i < this.dicenum; i++) {
			System.out.print(this.arr[i] + " ");
		}
		System.out.println();
		System.out.println("합계 : " + this.total()); //println 은 반환값이 있어야함

	}

}
