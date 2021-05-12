package pkg1007;

import java.util.Random;

public class Dice01 {
	private String name;
	private int su;
	private int[] arr;

	public Dice01(String name) {// ±èÃ¶¼ö
		this.name = name;
		this.su = 3;
		this.arr = new int[this.su];
		this.roll();

	}

	public Dice01(String name, int su) {// ¹Ú¿µÈñ , ±èÀ¯½Å
		this.name = name;
		if (su >= 4) {
			this.su = 3;
		} else {
			this.su = su;
		}
		this.arr = new int[this.su];
		this.roll();
	}

	private void roll() {
		Random rand = new Random();

		for (int i = 0; i < su; i++) {
			arr[i] = rand.nextInt(6) + 1;
		}

	}

	private int total() {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	
	public void getInfo() {
		System.out.println("=======================");
		System.out.println("ÀÌ¸§ : " + this.name);
		System.out.print("ÁÖ»çÀ§ °ª : " );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(this.arr[i]+"\t");
		}
		System.out.println();
		System.out.println("ÇÕ°è : " + this.total());
	}

}
