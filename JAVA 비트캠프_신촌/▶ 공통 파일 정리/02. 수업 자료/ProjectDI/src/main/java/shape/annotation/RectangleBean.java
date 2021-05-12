package shape.annotation;

public class RectangleBean {		
	private double width ;//밑변
	private double height ;//높이
	
	//Constructor Injection을 받기 위한 생성자
	public RectangleBean(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += "밑변 : " + this.width + ", 높이 : " + this.height  + "\n" ;
		imsi += "면적 : " + ( this.width * this.height) +  "\n" ; 
		return imsi ;
	}
	public RectangleBean() {  }	 /* 기본 생성자 */	
}