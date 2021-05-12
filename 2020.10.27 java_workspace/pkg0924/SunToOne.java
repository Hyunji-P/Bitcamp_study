package pkg0924;

public class SunToOne {

	public static void main(String[] args) {
		// 1부터 n까지의 합 구하기

		int su = 10;
		int total = 0;

		for (int i = 1; i <= su; i++) {
			total += i;
		}
		System.out.println("총합 : " + total);

		int su1 = 1;
		int su2 = 10;

		total = 0;
		// su1부터 su2까지의 총합 구하기

		for (int i = su1; i <= su2; i++) {
			total += i; // total = total + i ;

		}
		System.out.println("총합 : " + total);

		su1 = 6;
		su2 = 3;
		// su1부터 su2까지의 총합 구하기

		total = 0;

//		for (int i = su1; i >= su2; i--) {
//			total += i;
//		}
//		System.out.println("총합 : " + total);

		// 알고리즘 swap 으로 문제 풀기
		int temp;
		temp = su2;
		su2 = su1;
		su1 = temp;

		for (int i = su1; i <= su2; i++) {
			total += i; // total = total + i ;

		}
		System.out.println("총합 : " + total);

		// 문제
		// 1의 제곱은 1
		// 2의 제곱은 4
		// ...
		// 10의 제곱은 100

		total = 0;
		for (int i = 1; i < 11; i++) {
			total = i * i;
			System.out.println(i + "의 제곱은 " + total);
		}
		
		//서식으로 문제풀기 → printf() 메소드를 사용 
		for (int i = 1; i < 11; i++) {
			String imsi = "%2d의 제곱은 %3d입니다.\n";
			System.out.printf(imsi, i, i * i);
		}

	}

}
