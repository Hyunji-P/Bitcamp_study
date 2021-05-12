package pkg09;
public class Calculate {
	private int x ;
	private int y ;
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int add() {		
		return this.x + this.y ;
	}	
	public int sub() {		
		return this.x - this.y ;
	}	
	public int mul() {		
		return this.x * this.y ;
	}	
	public int div() {
		if(this.y == 0) {
			this.y = 5 ;
		} 
		return this.x / this.y ;
	}	
}

