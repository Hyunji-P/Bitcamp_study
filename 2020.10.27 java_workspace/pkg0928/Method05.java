package pkg0928;

public class Method05 {

	public static void main(String[] args) {
		// �迭 ��ҵ��� ������ ���� �ִ� ArrSum �޼ҵ� ����
		int[] arr = { 10, 20, 30 };// �迭
		int result = ArrSum(arr);
		System.out.println("��� : " + result);

	}

	static int ArrSum(int[] abcd) {// int arr : ���� , int [] arr : �迭
		int total = 0;
		for (int i = 0; i < abcd.length; i++) {
			total += abcd[i];
		}

		return total;

	}
}
