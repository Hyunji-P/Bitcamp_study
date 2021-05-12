package shape.circle;

public class Point {
	private double xpos; // x좌표
	private double ypos; // y좌표

	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	public void setYpos(double ypos) {
		this.ypos = ypos;
	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += "x좌표 : " + this.xpos + "\n";
		imsi += "y좌표 : " + this.ypos + "\n";
		
		return imsi;
	}

}
