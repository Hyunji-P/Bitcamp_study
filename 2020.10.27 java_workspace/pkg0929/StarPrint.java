package pkg0929;
//선생님이 푸신 방법으로 다시 풀어 볼것 

import java.util.Scanner;

//스캐너 클래스를 이용하여 정수 1개를 입력받습니다.
//만약 , 음수가 입력되면 절대값으로 변경합니다.(Math.abs())
//숫자 0이 입력되면 별 5개를 출력하도록 합니다.
//해당 수 만큼 별을 출력해주는 메소드 ShowStar라는 메소드를 구현하세요.

public class StarPrint {

	static void ShowStar(int star) {
		if (star > 0) {
			for (int i = 1; i < star + 1; i++) {
				System.out.print("*");
			}
		} else if (star == 0) {
			for (int i = 1; i < 6; i++) {
				System.out.print("*");
			}
		} else {
			star = Math.abs(star);
			for (int i = 1; i < star + 1; i++) {
				System.out.print("*");
			}

		}
//선생님이 푸신 방법 
//		if(star == 0) {
//			star = 5;
//		}else if(star < 0) {
//			star = Math.abs(star);
//		}
//		for(int i = 1 ; i <= star ; i++) {
//			System.out.print("*");
//		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 1개를 입력 : ");
		int star = scan.nextInt();
		ShowStar(star);

	}
}
