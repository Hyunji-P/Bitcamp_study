package pkg0921;

/*���� ) �������� �߽������� �̿��Ͽ� ������ ���� ��µǴ� ���α׷��� �ۼ� 
        ��, �������� 3.14���� ����ϵ��� �մϴ�. 
 */

public class Circle {

	public static void main(String[] args) {
		double xpos = 3.0, ypos = 4.0;
		double radius = 10.0;
		double Pi = 3.14;
		double area = Pi * radius * radius; // ���� : Math.pow()

		System.out.println("���� �߽��� (" + xpos + "," + ypos + ") �Դϴ�.");
		System.out.println("���� �������� " + radius + " �Դϴ�.");
		System.out.println("���� ������ " + area + " �Դϴ�.");

	}

}
