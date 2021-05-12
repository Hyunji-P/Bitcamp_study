package pkg1007;

public class Rectangle {
	private int width;
	private int height;

	// 메소드는 private 하면 외부 클래스에서 접근을 못하므로 public 으로 해줄 것
	// private 하려면 public한 메소드(getter , setter)로 간접접근 해야함 
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {// 면적
		return this.width * this.height;
	}

	public void perimiter() {// 둘레
		int result = 2 * (this.width + this.height);
		System.out.println("둘레 : " + result);
	}

	public void result() {// 크기
		String imsi = "";
		if (this.area() > 300) {
			imsi = "대형";

		} else if (this.area() > 200) {
			imsi = "중형";
		} else {
			imsi = "소형";
		}

		System.out.println("크기 : " + imsi);
	}

	public double diagonal() {// 대각선 길이
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
