package pkg0923;

public class For01 {

	public static void main(String[] args) {
		// 초기식 : int i = i ;
		// 조건식 : i <= 10 ; , i < 11;
		// 증감식 : i++
		int total = 0;// 반드시 초기화를 해야한다.
		for (int i = 1; i < 11; i++) {
			total += i;
		}
		System.out.println("총합 : " + total);

		// 1+3+5+7+9 =25
		total = 0;// 반드시 초기화를 해야한다.
		for (int i = 1; i < 10; i += 2) {
			total += i;
		}
		System.out.println("총합 : " + total);

		// 문제) 1+4+7+...+100 = 1717
		int sum = 0;
		for (int i = 1; i < 101; i += 3) {
			sum += i;
		}
		System.out.println(sum);

		// 문제) 97 + 92 + 87 + ... + 7 + 2 = 990
		sum = 0;
		for (int i = 97; i > 1; i -= 5) {
			sum += i;
		}
		System.out.println(sum);

		// 문제) 1*1 + 6*6 + 11*11 + ... + 96*96 = 63670
		sum = 0;
		for (int i = 1; i < 97; i += 5) {
			sum += i * i;
		}
		System.out.println(sum);

	}

}
