package pkg1008;

public class Shape {
	private String name;
	private double xpos;
	private double ypos;
	private double radius;// 반지름
	private double width;// 밑변
	private double height;// 높이
	private double area; // 면적
	private double perimeter; // 원둘레
	private double diagonal;// 대각선

	// pi라는 Math 클래스 메소드 존재함
	final double pi = 3.14;

	public Shape(String name, double xpos, double ypos, double radius) {// 원
		this.name = name;
		this.xpos = xpos;
		this.ypos = ypos;
		this.radius = radius;
		this.circle();

	}

	public Shape(String name, double width, double height) {// 삼각형, 사각형
		this.name = name;
		this.width = width;
		this.height = height;

		if (this.name.equals("t")) {
			this.triangle();
		} else {
			this.rectangle();
		}
	}

	private void circle() {// 원
		this.perimeter = 2 * this.pi * this.radius; // pi라는 Math 클래스 메소드 존재함
		this.area = this.pi * Math.pow(this.radius, 2);
		this.Display();

	}

	private void triangle() {// 삼각형
		this.area = (this.width * this.height) / 2.0;
		this.Display();

	}

	private void rectangle() {// 사각형
		this.area = this.width * this.height;
		this.diagonal = Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2));
		this.Display();

	}

	// 중복 되지 않게 다시 풀어 볼 것
	public void Display() {
		if (this.name.equals("c")) {
			this.name = "원";
			System.out.println("유형 : " + this.name);
			System.out.println("반지름 : " + this.radius);
			System.out.printf("원둘레 : %.2f\n", this.perimeter);
			System.out.printf("면적 : %.2f\n", this.area);
			System.out.println("중심 : (" + this.xpos + "," + this.ypos + ")");
			System.out.println();
		} else if (this.name.equals("t")) {
			this.name = "삼각형";
			System.out.println("유형 : " + this.name);
			System.out.println("밑변 : " + this.width);
			System.out.println("높이 : " + this.height);
			System.out.printf("면적 : %.2f\n", this.area);
			System.out.println();
		} else if (this.name.equals("r")) {
			this.name = "사각형";
			System.out.println("유형 : " + this.name);
			System.out.println("밑변 : " + this.width);
			System.out.println("높이 : " + this.height);
			System.out.printf("면적 : %.2f\n", this.area);
			System.out.printf("대각선 길이 : %.2f\n", this.diagonal);
			System.out.println();
		}

	}

}
