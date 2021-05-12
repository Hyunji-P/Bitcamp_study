package pkg0922;

public class PrintfEx {
	// main 메소드는 program start point
	// 실행하려면 반드시 존재해야한다!
	public static void main(String[] args) {
		
		//자릿수 서식 지정자
		double d = 12.3456789;
		System.out.println("실수 1 : " + d);
		System.out.printf("실수 2 : [%6.2f]\n" , d);
		//[%6.2f] 전체 6자리 , 소수점 2자리까지 표시 
		//자릿수 확보할때는 소수점도 포함한다. 
		//printf : 마지막 자릿수 반올림 
		
		System.out.printf("실수 3 : [%.3f]\n" , d);
		//[%.3f] 소수점 아래 3자리까지 표시 
		
		System.out.printf("실수 4 : [%f]\n" , d);
		
		//[   12.345678]
		System.out.printf("실수 5 : [%11.6f]\n" , d);
		
		int i = 65;
		char ch = 'a';
		
		System.out.printf("정수 : [%d] , 문자  : [%c]\n" , i , ch);
		// i → %d 대입 , ch → %c 대입 
		
		System.out.printf("정수 : [%4d] , 문자  : [%2c]\n" , i , ch);
		//[%4d] 4자리 확보 후 우측 정렬 
		
		System.out.printf("정수 : [%-4d] , 문자  : [%-2c]\n" , i , ch);
		//[%-4d] 4자리 확보 후 왼쪽 정렬 
	
		
		//형 변환 
		System.out.printf("실수 6 : [%f]\n" , (double)i); // i는 정수 , 대입하려는 부분은 실수이기때문에 강제 형변환 
		System.out.printf("정수 : [%d]\n" , (int)d); // d는 실수 , 대입하려는 부분은 정수이기때문에 강제 형변환 
		

	}
}
