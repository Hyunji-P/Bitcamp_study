package shape.annotation;

public class CircleBean { //원의 정보		
	private double xpos ; //x 좌표
	private double ypos ; //y 좌표
	
	private double radius ; //반지름
	
	//Constructor Injection을 받기 위한 생성자
	public CircleBean(double xpos, double ypos, double radius) {
		this.xpos = xpos;
		this.ypos = ypos;
		this.radius = radius;
	}	
	@Override
	public String toString() {
		String imsi = "" ;
		imsi += "원의 중심 : (" + this.xpos + ", " + this.ypos + ") \n" ;
		imsi += "반지름 : " + this.radius + " \n" ;
		imsi += "면적 : " + ( 3.14 * Math.pow(this.radius, 2.0 )) +  "\n" ; 
		return imsi ;
	}
	public CircleBean() {  } /* 기본 생성자 */	
}