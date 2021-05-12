package pkg19 ;

import java.util.Scanner;


public class JumsuMain {
	public static void main(String[] args) {
		Scanner scan = null ;
		try {
			scan = new Scanner( System.in ) ;	
			System.out.print("������ �Է� : "); 
			String name = scan.next() ;
			
			System.out.print("���� �Է� : "); 
			int kor = scan.nextInt() ;
			
			System.out.print("���� �Է� : "); 
			int eng = scan.nextInt() ;
			
			System.out.print("���� �Է� : "); 
			int math = scan.nextInt() ;
			
			int total = kor + eng + math ;

			if( kor <= 40) {
				throw new MinJumsuException("����", kor) ;
			};
			if( eng <= 40) {
				throw new MinJumsuException("����", eng) ;
			};			
			if( math <= 40) {
				throw new MinJumsuException("����", math) ;
			};	
			if( total < 180 ){
				throw new FailedException(total) ;
			}
			//���⼭ ��հ� ������ ����ϸ� �ȴ�.
			double average = (double)total / 3.0 ;
			System.out.println("���� : " +  total );
			System.out.printf("��� : %.2f\n ", average );
			
		} catch (MinJumsuException e) {
			System.out.println( e.toString() );
			System.out.println( e.getMessage() );
			//e.printStackTrace();		
			
		} catch (FailedException e) {
			System.out.println( e.toString() );
			System.out.println( e.getMessage() );
			//e.printStackTrace();
			
		} catch(Exception e){
			System.out.println("������ ���� �߻�");
		}finally{
			scan.close() ;
		}			
	}
}