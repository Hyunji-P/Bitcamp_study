package pkg1021;

import java.util.Scanner;

public class JumsuMain {

	public static void main(String[] args) {
		Scanner scan = null;
		String name = null;
		int kor = 0, eng = 0, math = 0, total = 0;
		double average = 0.0;

		try {
			scan = new Scanner(System.in);
			System.out.print("응시자 입력 : ");
			name = scan.next();
			System.out.print("국어 입력 : ");
			kor = scan.nextInt();
			System.out.print("영어 입력 : ");
			eng = scan.nextInt();
			System.out.print("수학 입력 : ");
			math = scan.nextInt();

			total = kor + eng + math;
			average = (double) total / 3.0;

			//무엇때문에 과락인지 코딩해보기
			if (kor <= 40 || eng <= 40 || math <= 40) {
				String result01 = "과락";
				MinJumsuException message = new MinJumsuException(result01);
				throw message;

			} else if (total < 180) {
				String result02 = "평균 이하 점수";
				throw new FailedException(result02);

			}
			System.out.println("총점 : " + total);
			System.out.printf("평균은 %.2f\n", average);

		} catch (MinJumsuException ex) {// 모든 과목이 40점 이하일때
			System.out.println("예외 문자열 : " + ex.toString());
			System.out.println("메세지 : " + ex.getMessage());
			ex.printStackTrace();

		} catch (FailedException ex) {// 과목 총합이 180점 미만일때
			System.out.println("메세지 : " + ex.getMessage());
			System.out.println("예외 문자열 : " + ex.toString());
			ex.printStackTrace();
			
		} catch (Exception ex) {
			System.out.println("나머지 예외~");
		} finally {// 무조건 실행되는 거니까 여기다가 총점 , 평균 적으면 안됨

			scan.close();
		}

	}

}
