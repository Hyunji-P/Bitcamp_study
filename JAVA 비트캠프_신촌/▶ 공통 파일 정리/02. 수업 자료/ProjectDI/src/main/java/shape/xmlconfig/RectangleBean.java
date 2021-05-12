package shape.xmlconfig;

public class RectangleBean {
	//사각형의 밑변과 높이와 면적을
	private double width ;
	private double height ;
	
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += "밑변 : " + this.width + "\n" ;
		imsi += "높이 : " + this.height + " \n" ;
		imsi += "면적 : " + ( this.width * this.height ) +  "\n" ; 
		return imsi ;
	}
	public RectangleBean() { }
}