package pkg1007;

public class RectangleMain {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(15, 15);
		int area01 = rect1.area();
		System.out.println("면적 : " + area01);
		rect1.perimiter();// 둘레
		rect1.result();// 중형
		double diagonal01 = rect1.diagonal();
		System.out.printf("대각선 길이 : %.3f \n", diagonal01);
		System.out.println();

		Rectangle rect2 = new Rectangle(25, 20);
		int area02 = rect2.area();
		System.out.println("면적 : " + area02);
		rect2.perimiter();// 둘레
		rect2.result();// 중형
		double diagonal02 = rect2.diagonal();
		System.out.printf("대각선 길이 : %.3f \n", diagonal02);

	}

}
