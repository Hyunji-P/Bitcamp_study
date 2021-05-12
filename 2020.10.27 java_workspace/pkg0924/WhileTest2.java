package pkg0924;
//무한 while 루프 , 반드시 빠져나가기 위한 break 가 있어야함 
import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // System.in (키보드) 값이 들어오기 위해 scanner를 만들어 준다.
//
//		System.out.println("정수1 입력");
//		int su = scan.nextInt(); // 키보드로 입력 받은 값
//
//		System.out.println("정수2 입력");
//		int su2 = scan.nextInt(); // 키보드로 입력 받은 값
//
//		System.out.println("입력된 정수 : " + (su+ su2));

		int total = 0;

		while (true) {
			System.out.println("현재 까지의 합 : " + total);
			System.out.println("시험 점수 입력 :");
			int su = scan.nextInt();

			if (su < 0) {
				System.out.println("음수는 입력 X");
				break;
			}

			total += su;

		}
		System.out.println("총합 : " + total);

	}
}
