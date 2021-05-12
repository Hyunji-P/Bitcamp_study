package pkg1019;

public class MyRectMain {

	public static void main(String[] args) {
		Rect recA = new Rect(2, 3);
		Rect recB = new Rect(3, 2);
		Rect recC = new Rect(3, 4);

		System.out.println(recA == recB);
		// recA�� recB�� �ٶ󺸰� �ִ°�(����) ��

		// Ŭ�������� ��ü���� �񱳸� ���Ͽ� equals ��� �޼ҵ带 �����Ѵ�.
		// Ư�� , String Ŭ������ object Ŭ������ equals �޼ҵ带
		// �� �񱳸� �ϱ� ���Ͽ� �̸� �������̵� �صξ���.

		// equals �� object ���� �޼ҵ� �̰�
		// Object obj = Rect(2, 3); Rect(2, 3) �� recB �� Object obj
		// Object ���� Ŭ����(�޼ҵ� O) , Rect ���� Ŭ���� ((�޼ҵ� X)
		// � �޼ҵ尡 ����Ŭ�������� �����ϴ� ��� , ����� �ް� �����Ƿ� ����Ŭ���� �޼ҵ� ����

		if (recA.equals(recB)) {//�±�
			System.out.println("���� yes");
		} else {
			System.out.println("���� no");
		}

		if (recA.equals(recC)) {
			System.out.println("���� yes");
		} else {
			System.out.println("���� no");
		}

		if (recB.equals(recC)) {
			System.out.println("���� yes");
		} else {
			System.out.println("���� no");

		}

	}
}
