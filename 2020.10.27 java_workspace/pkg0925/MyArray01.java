package pkg0925;

public class MyArray01 {
	// �迭
	public static void main(String[] args) {
		// main �޼ҵ� ����� ����, ȣȣ�� �Է��ϸ� String[] args��� �迭�� ����
		// new ������ ���

		int z = 0; // ���� ����(�Ϲݺ���)�� �ݵ�� �ʱ�ȭ�� �ʿ��մϴ�.
		System.out.println(z);

		int x = 3;
		int y = 5;
		// ���� 3���� ���� ������ �迭 �����
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); // �迭�� �ʱⰪ�� �������ִ�. 

		}
		System.out.println("�迭 ��� ���� : " + arr.length);

		arr[0] = x - y + 6;
		arr[2] = arr[0] + 3;
		arr[1] = arr[0] + arr[2];

//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			total = arr[i];
		}
		System.out.println("���� 01 : " + total);

		// �ʱ�ȭ ���
		String[] soshi = { "�¿�", "ȿ��", "Ƽ�Ĵ�" };
		for (int i = 0; i < soshi.length; i++) {
			System.out.println(soshi[i]);

		}

	}

}
