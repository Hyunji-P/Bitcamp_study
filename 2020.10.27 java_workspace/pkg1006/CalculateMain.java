package pkg1006;

import java.util.Scanner;

public class CalculateMain {
	public static void main(String[] args) {

		Calculate calc = new Calculate();

		Scanner scan = new Scanner(System.in);
		System.out.println("x값을 입력하세요.");
		int x = scan.nextInt();
		System.out.println("y값을 입력하세요.");
		int y = scan.nextInt();

		calc.setAdd(x, y);
		calc.setSub(x, y);
		calc.setMul(x, y);
		calc.setDiv(x, y);

		ShowData(calc);

	}

	private static void ShowData(Calculate calc) {
		System.out.println("========결과=========");
		System.out.println("더하기 : " + calc.getAdd());
		System.out.println("빼기 : " + calc.getSub());
		System.out.println("곱하기 : " + calc.getMul());
		System.out.println("나누기(단,0일때 5로 나누기) : " + calc.getDiv());

	}
}
