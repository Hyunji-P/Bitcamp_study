package pkg0921;

public class Add {

	public static void main(String[] args) {
		
		
//		int x = 3; ����� �� �Ҵ��� ���� �����ϴ�. 
		
		
		int x; // ������ �������� ���� x�� ����/�����Ѵ�.
		int y;
		int z;

		// = ��ȣ�� ���� �����ڶ�� �Ѵ�.
		x = 3; // x�� ���� 3���� ����/�Ҵ�/�����Ѵ�.
		y = 5;
		z = x + y;

		System.out.println("y = " + y);
		System.out.println("z = " + z);

		x = 6; // ������ �߰� �߰� ���� �ٲ� �� �ִ�.
		y = 2;
		System.out.println("x = " + x);
		z = x * y;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

		//���� 
		x = 1; // ������ �߰� �߰� ���� �ٲ� �� �ִ�.
		y = 2;
		z = 2 * x + 3 * y - 4;

		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);

	}

}
