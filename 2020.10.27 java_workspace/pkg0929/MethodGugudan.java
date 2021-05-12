package pkg0929;

import java.util.Scanner;

//스캐너 클래스를 이용하여 정수 2개 (su1, su2)를 입력 받습니다.
//메소드 구현
//	gugudan(su1)은 해당 su1에 대한 단을 출력하세요.
//  예시) 3*1=3 3*2=6 ....
//  gugudan2(su1,su2)은 해당 su1단 부터 , su2단까지 출력하세요.
//  예시) 3*1=3 3*2=6 ....
// 		 ...
//       5*1=5 5*2=10 ....

public class MethodGugudan {
	static void gugudan(int su1) {
		int num = 0;
		int last = 9;
		for (int i = 1; i <= last; i++) {
			num = su1 * i;
			String imsi = su1 + " * " + i + " = " + num + "  ";
			System.out.print(imsi);

		}
		System.out.println();

	}

	static void gugudan2(int su1, int su2) {
// <printf 출력>
		int num = 0;
		int last = 9;

		for (int i = su1; i <= su2; i++) {
			for (int j = 1; j <= last; j++) {
				String imsi = "%2d*%2d=%2d\t";
				System.out.printf(imsi, i, j, (i * j));

			}
			System.out.println();
		}
// <println 출력>	
//		int num = 0;
//		int last = 9;
//
//		for (int i = su1; i <= su2; i++) {
//			for (int j = 1; j <= last; j++) {
//				num = i * j;
//				String imsi = i + " * " + j + " = " + num + "  ";
//				System.out.print(imsi);
//
//			}
//			System.out.println();
//		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int su1 = scan.nextInt();
		gugudan(su1);

		System.out.print("정수2 입력 : ");
		int su2 = scan.nextInt();
		gugudan2(su1, su2);

	}

}
