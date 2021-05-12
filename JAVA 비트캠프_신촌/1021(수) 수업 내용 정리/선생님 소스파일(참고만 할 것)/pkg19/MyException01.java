package pkg19;

import java.util.Scanner;

public class MyException01 {
	public static void main(String[] args) {		
		int x, y ;
		Scanner scan ; //����
		
		try{ 
			scan = new Scanner(System.in) ;
			x = 3;
			y = 0 ;
			int[] arr = {10, 20, 30 } ;			
			arr[3] = 50 ; //�迭 ��� �ε��� ����			
			System.out.println( x / y ); //0���� ������ ����			
			
			System.out.println("���� �߻��� ���� ������ �ȵǿ�.");
			
		}catch(ArithmeticException ex) {
			System.out.println("0���� ������ �ƴ� �ǿɴϴ�.");
			
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("�迭 �ε��� ����");
			
			System.out.println("�޽��� : " + ex.getMessage());
			
			System.out.println("���ڿ� : " + ex.toString());
			System.out.println();
			ex.printStackTrace();
		
		}catch(Exception ex) {
			System.out.println("������ ��Ÿ ���");
		}finally {
			
			System.out.println("���� ������ ���� �˴ϴ�.");
		}
		
		
		
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
		
//		at pkg19.MyException01.main(MyException01.java:7)

//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
//		at pkg19.MyException01.main(MyException01.java:10)

		
	}
}
