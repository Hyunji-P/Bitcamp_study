package pkg19;
public class MyException03 {
	public static void main(String[] args) {		
		try {
			String xx = "aa" ;
			first( xx );	
			
			try {
				
			} catch (Exception e) {
			
			}
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ��������");
			
			try {
				
			} catch (Exception e2) {

			}
			
		}catch (NumberFormatException e) {
					System.out.println("�߸��� ���� �����̾�");
					
		} catch (Exception e) {
			System.out.println("������ ����");
		}
	}
	private static void first(String xx) 
			throws ArithmeticException, NumberFormatException{
		second();
		int x = Integer.parseInt( xx ) ;		
		
	}
	private static void second() throws ArithmeticException{
		third();		
	}
	private static void third() throws ArithmeticException{
		int i=1, j=0 ;
		System.out.println( i / j ); 
	}
}