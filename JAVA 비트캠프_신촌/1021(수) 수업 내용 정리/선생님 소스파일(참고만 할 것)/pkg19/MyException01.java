package pkg19;

import java.util.Scanner;

public class MyException01 {
	public static void main(String[] args) {		
		int x, y ;
		Scanner scan ; //정의
		
		try{ 
			scan = new Scanner(System.in) ;
			x = 3;
			y = 0 ;
			int[] arr = {10, 20, 30 } ;			
			arr[3] = 50 ; //배열 요소 인덱스 문제			
			System.out.println( x / y ); //0으로 나누기 문제			
			
			System.out.println("문제 발생시 저는 실행이 안되요.");
			
		}catch(ArithmeticException ex) {
			System.out.println("0으로 나누면 아니 되옵니다.");
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("배열 인덱스 오류");
			
			System.out.println("메시지 : " + ex.getMessage());
			
			System.out.println("문자열 : " + ex.toString());
			System.out.println();
			ex.printStackTrace();
		
		}catch(Exception ex) {
			System.out.println("나머지 기타 등등");
		}finally {
			
			System.out.println("나는 무조건 실행 됩니다.");
		}
		
		
		
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
		
//		at pkg19.MyException01.main(MyException01.java:7)

//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at pkg19.MyException01.main(MyException01.java:10)

		
	}
}
