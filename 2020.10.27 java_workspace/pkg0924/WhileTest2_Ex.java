package pkg0924;

import java.util.Scanner;

public class WhileTest2_Ex {

	public static void main(String[] args) {
		// 10 , 30 , 30 , -10
		// 결과 ) 총 시험 횟수 : 3
		// 총점 : 60
		// 평균 : 20.0
		Scanner scan = new Scanner(System.in);

		int cnt = 0;
		int sum = 0;
		double avg = 0;

		while (true) {
			System.out.println("점수를 입력하세요.");
			int jum = scan.nextInt();

			if (jum < 0) {
				System.out.println("음수는 입력 불가 합니다.");
				break; // 반복문 전체를 다 빠져 나올때 씀 
			}
			cnt += 1; // jum 이 양수일때 , 음수일때도 cnt  증가 
			sum += jum; // jum 이 양수일때 , 음수일때도 sum 증가

		}

		avg = (double) sum / cnt; // 평균은 마지막 값으로 구하는게 맞음 , 따라서 반복문을 빠져나오고 계산해야함

		System.out.println("-------결과--------");
		System.out.println("총 시험 횟수 : " + cnt);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
