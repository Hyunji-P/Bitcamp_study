package shape.circle;

public class Circle {
	private double radius; // 반지름
	private Point point; // 점 객체

	public Circle(double radius, Point point) {
		this.radius = radius;
		this.point = point;
	}

	@Override
	public String toString() {
		double area = 3.14 * Math.pow(radius, 2.0);
		String imsi = "";
		imsi += "반지름 : " + this.radius + "\n";
		imsi += this.point.toString();
		imsi += "면적 : " + area + "\n";

		return imsi;
	}


}
