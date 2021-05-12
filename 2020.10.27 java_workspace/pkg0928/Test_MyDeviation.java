package pkg0928;

//표준편차 구하기(deviation 메소드 안에 서술)
//표준 편차 구하는 공식
//표준 편차(standard deviation)를 구하세요.
//1) 평균을 구한다.
//    평균 = 총합(160)/arr.length = 160/4 = 40
//2) (점수 - 평균)을 제곱을 모두 누적시킨다.
//    900 + 100 + 0 + 1600 = 2600 
//3) 2)의 결과에 돗수를 나눈다
//    2600/arr.length = 650
//4) 3)에 루트를 씌운다.
//    루트 650 = 25.4950975 
//    힌트 : Math.sqrt( 650 )

public class Test_MyDeviation {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 40, 80 };

		double result = deviation(arr);
		System.out.println("결과 : " + result);

	}

	static double deviation(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];// 총합

		}

		double average = (double) sum / arr.length; // 평균

		double cha = 0;

		for (int i = 0; i < arr.length; i++) {
			cha += Math.pow(arr[i] - average, 2.0); // (점수 - 평균)^2
												  // (int)arr[i] - (double)avarage → 암시적 캐스팅
		}

		double cha1 = cha / arr.length;// (점수 - 평균)^2에 돗수 나눈 값 , 암시적 캐스팅
		double result = Math.sqrt(cha1); // 표준편차 결과 값

		return result;

	}

}
