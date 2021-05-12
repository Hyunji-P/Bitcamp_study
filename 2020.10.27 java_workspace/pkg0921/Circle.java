package pkg0921;

/*문제 ) 반지름과 중심정보를 이용하여 다음과 같이 출력되는 프로그램을 작성 
        단, 원주율은 3.14으로 계산하도록 합니다. 
 */

public class Circle {

	public static void main(String[] args) {
		double xpos = 3.0, ypos = 4.0;
		double radius = 10.0;
		double Pi = 3.14;
		double area = Pi * radius * radius; // 제곱 : Math.pow()

		System.out.println("원의 중심은 (" + xpos + "," + ypos + ") 입니다.");
		System.out.println("원의 반지름은 " + radius + " 입니다.");
		System.out.println("원의 면적은 " + area + " 입니다.");

	}

}
