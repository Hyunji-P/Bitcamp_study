package pkg1019;

public class MathEx {

	public static void main(String[] args) {
		double d1 = -12.3456;
		double d2 = 34.56;

		System.out.println("절대값 : " + Math.abs(d1));

		double result = Math.abs(-11.22);
		System.out.println(result);

		System.out.println("파이 : " + Math.PI);
		System.out.println("오일러 상수 : " + Math.E);

		// cb : 큐빅(면체)
		System.out.println("2의 3승근 : " + Math.cbrt(8));
		System.out.println("올림 : " + Math.ceil(d1));
		System.out.println("버림 : " + Math.floor(d1));
		System.out.println("큰수 : " + Math.max(12, 15));
		System.out.println("작은수 : " + Math.min(10, 20));
		System.out.println("2의 10승 : " + Math.pow(2, 10));

		System.out.println("난수 : " + Math.random());
		System.out.println("반올림 : " + Math.round(12.59));
		System.out.println("부호 값 : " + Math.signum(-12.3));
		System.out.println("루트 : " + Math.sqrt(16));

		// 문제) 삼각형 두변이 각각 3 , 4 라고 할 때 가장 긴변의 길이? 5.0
		// 가장 긴 변이 13.0이고 , 짧은 변이 5.0이라고 할때 나머지 변의 길이?
		result = 0.0;
		result = Math.sqrt(Math.pow(3, 2.0) + Math.pow(4, 2.0));

		System.out.println("가장 긴 변의 길이 : " + result);
		
		result = 0.0;
		//레퍼런스 사이트 들어가서 Math.클래스 내 pow 메소드 형식이랑 같이 볼 것 !! 
		result = Math.sqrt(Math.pow(13.0, 2.0) - Math.pow(5.0, 2.0));
		
		System.out.println("나머지 변의 길이 : " + result);

		

	}

}