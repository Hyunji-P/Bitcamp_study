package shape.xmlconfig;

public class RectangleBean {
	private double width; // 밑변
	private double height; // 높이

	public RectangleBean(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += "밑변 : " + this.width + "\n";
		imsi += "높이 : " + this.height + "\n";
		imsi += "면적 : " + (this.width * this.height) + "\n";
		return imsi;
	}

}
