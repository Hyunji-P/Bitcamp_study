package pkg19 ;

import java.util.Scanner;


public class JumsuMain {
	public static void main(String[] args) {
		Scanner scan = null ;
		try {
			scan = new Scanner( System.in ) ;	
			System.out.print("응시자 입력 : "); 
			String name = scan.next() ;
			
			System.out.print("국어 입력 : "); 
			int kor = scan.nextInt() ;
			
			System.out.print("영어 입력 : "); 
			int eng = scan.nextInt() ;
			
			System.out.print("수학 입력 : "); 
			int math = scan.nextInt() ;
			
			int total = kor + eng + math ;

			if( kor <= 40) {
				throw new MinJumsuException("국어", kor) ;
			};
			if( eng <= 40) {
				throw new MinJumsuException("영어", eng) ;
			};			
			if( math <= 40) {
				throw new MinJumsuException("수학", math) ;
			};	
			if( total < 180 ){
				throw new FailedException(total) ;
			}
			//여기서 평균과 총점을 출력하면 된다.
			double average = (double)total / 3.0 ;
			System.out.println("총점 : " +  total );
			System.out.printf("평균 : %.2f\n ", average );
			
		} catch (MinJumsuException e) {
			System.out.println( e.toString() );
			System.out.println( e.getMessage() );
			//e.printStackTrace();		
			
		} catch (FailedException e) {
			System.out.println( e.toString() );
			System.out.println( e.getMessage() );
			//e.printStackTrace();
			
		} catch(Exception e){
			System.out.println("나머지 예외 발생");
		}finally{
			scan.close() ;
		}			
	}
}