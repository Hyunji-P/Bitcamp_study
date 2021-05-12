package pkg0921;

//문제 ) 밑변과 높이를 이용하여 삼각형의 면적을 구하는 프로그램을 작성해 보세요. 

public class TriangleArea {

	public static void main(String[] args) {
		int width = 4; // 밑변
		int height = 5; // 높이

		double area = (double) width * height / 2;

		System.out.println("밑변 : " + width + " 높이 :  " + height);
		System.out.println("삼각형의 면적은 " + area + " 입니다.");

	}

}
