package pkg1006;

import java.util.Scanner;

public class CalculateMain {
	public static void main(String[] args) {

		Calculate calc = new Calculate();

		Scanner scan = new Scanner(System.in);
		System.out.println("x���� �Է��ϼ���.");
		int x = scan.nextInt();
		System.out.println("y���� �Է��ϼ���.");
		int y = scan.nextInt();

		calc.setAdd(x, y);
		calc.setSub(x, y);
		calc.setMul(x, y);
		calc.setDiv(x, y);

		ShowData(calc);

	}

	private static void ShowData(Calculate calc) {
		System.out.println("========���=========");
		System.out.println("���ϱ� : " + calc.getAdd());
		System.out.println("���� : " + calc.getSub());
		System.out.println("���ϱ� : " + calc.getMul());
		System.out.println("������(��,0�϶� 5�� ������) : " + calc.getDiv());

	}
}
