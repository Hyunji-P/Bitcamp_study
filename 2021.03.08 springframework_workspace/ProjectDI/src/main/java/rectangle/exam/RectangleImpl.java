package rectangle.exam;

public class RectangleImpl implements Rectangle {
	private double base; // 밑변
	private double height; // 높이

	public RectangleImpl(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void Print() {
		double result = this.base * this.height;
		System.out.println("사각형의 넓이 : " + result);
	}

	@Override
	public void Diagonal() {
		double result = Math.sqrt(base * base + height * height);
		System.out.println("사각형의 대각선 길이 : " + result);
	}

}
