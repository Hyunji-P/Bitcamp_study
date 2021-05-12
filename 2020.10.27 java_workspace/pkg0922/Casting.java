package pkg0922;

public class Casting {

	public static void main(String[] args) {
		// 암시적 캐스팅
		double d = 100;
		System.out.println("d : " + d);

		// 명시적 캐스팅
		int i = (int) 3.14;
		System.out.println("i : " + i);

		System.out.println(14 / 5); // int / int = int
		// (double)14/5--->명시적 캐스팅 14.0 / 5 ---> 실수를 정수로 나눌수 없음 .따라서 ,암시적 캐스팅 14.0 / 5.0
		System.out.println((double) 14 / 5);
		// (double)(14/5) ---> (double)(2) --> 2.0
		System.out.println((double) (14 / 5));

		int kor = 50, eng = 60, math = 80;
		int total = 0;
		double average = 0.0;

		total = kor + eng + math;
		// average = total / 3 ; // 암시적 형변환 63 --> 63.0
		average = (double) total / 3; // 명시적 형변환

		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		//문자와 형변환 
		char ch1 = 'c' ;
		char ch2 = 'a' ;
		
		boolean bool = ch1 > ch2 ; 
		System.out.println(bool);
		
		int result = ch1 - ch2 + 3 ; 
		System.out.println(result);
		
		char ch3 = 'c';
		// 조건 연산자를 사용하여 ch3가 대문자 인지 소문자 인지 판다하는 프로그램 
		
		String str = ch3 >= 'a' && ch3 <= 'z'? "소문자" : "대문자" ; // 위에 이미 result 변수를 선언해주었기에 동일한 변수이름을 사용하면 오류 
		System.out.println(str);
		
		
		
	}

}
