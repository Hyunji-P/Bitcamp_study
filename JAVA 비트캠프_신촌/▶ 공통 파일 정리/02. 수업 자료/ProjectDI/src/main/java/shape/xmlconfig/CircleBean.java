package shape.xmlconfig;

public class CircleBean {
	private double xpos ;
	private double ypos ;	
	private double radius ;	
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
	public CircleBean() { }
}