package pkg0928;

public class SwapExam {

	public static void main(String[] args) {

		int x = 3, y = 4;
		int temp;

		temp = x;
		x = y;
		y = temp;

		System.out.println("x : " + x);
		System.out.println("y : " + y);

		// �ٽ� Ǯ���
		x = 3;
		y = 4;
		int z = 5;

		// ���⿡ �ڵ�
		temp = z; // 5
		z = y; // 4
		y = x; // 3
		x = temp; // 5

		System.out.println("x : " + x);// 5
		System.out.println("y : " + y);// 3
		System.out.println("z : " + z);// 4

		int[] arr = { 1, 2, 3, 4 };

		// ����) �迭 ��ҵ��� ���� �Ųٷ� ����� ����Ͻÿ�.
		// �迭 ��ҵ��� swap ����� �̿��� ������ ���� �� �ٲٸ� �ȴ�.

		int cnt = arr.length / 2; // swap Ƚ��
		System.out.println("�迭 ��� ������");

		for (int i = 0; i < cnt; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i]; 
			arr[arr.length - 1 - i] = temp;

		}

		System.out.println("�迭 ��� ����ϱ�");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
