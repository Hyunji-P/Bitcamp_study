package rectangle.exam;

public class RectangleImpl implements Rectangle {
	private double base;
	private double height;	
	
	public RectangleImpl( double base, double height ) {
		this.base = base;
		this.height = height;
	}	
	public void Print() {
		double result = base * height ;
		System.out.println( "사각형의 넓이 : " + result );
	}
	public void Diagonal() {
		double result = Math.sqrt( (int)(Math.pow(base, 2)) + (int)(Math.pow(height, 2)) ) ;
		System.out.println( "사각형의 대각선 길이 : " + result );
	}
}