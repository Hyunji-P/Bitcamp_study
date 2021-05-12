package pkg09;
public class CalculateMain {
	public static void main(String[] args) {
		Calculate calc = new Calculate() ;
		
		calc.setX(14);
		calc.setY(5);
		
		System.out.println( calc.add() ) ;
		System.out.println( calc.sub() ) ; 
		System.out.println( calc.mul() ) ;
		System.out.println( calc.div() ) ;
	}
}