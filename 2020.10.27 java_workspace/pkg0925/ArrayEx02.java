package pkg0925;

public class ArrayEx02 {
	// �迭
	public static void main(String[] args) {
		int[] arr = new int[5];

//		arr[0] = 5;
//		arr[1] = 4;
//		arr[2] = 3;
//		arr[3] = 2;
//		arr[4] = 1;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i; // ���� �İ� ����
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]=" + arr[i]);
		}

		// arr2 : 2 4 6 8
		System.out.println("��� : ");
		int[] arr2 = new int[4]; 

		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 2*i + 2;// +=�� ǥ���ϸ� ������ �� ���� , ������ ���� 
							  // �迭 ���� 0���� �� ���õǾ� �־� ���� ������ �ƴ� 
							  // total ���� ��� ���� ���õ��� �ʾұ� ������ ���������� �� 
			System.out.println("arr[" + i + "]=" + arr2[i]);

		}

	}

}
