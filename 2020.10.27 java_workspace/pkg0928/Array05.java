package pkg0928;

public class Array05 {

	public static void main(String[] args) {
		// *�˰���*
		// ��Ұ� 5���� �迭���� ���� ���� ū ���� ���ϼ���.
		// 0��° ��Ҹ� �ִ��� �����Ѵ�.
		// �ݺ����� ����Ͽ� ���� �ִ밪�� i��° ��ҵ��� ���� ���Ѵ�.
		// i��° ����� ���� �ִ� ������ ũ�� �ִ� ���� �ٲߴϴ�.

		double[] arr = { 0.5, 0.3, 0.2, 0.8, 0.4 }; // ���ڿ��϶��� ""

		double max = arr[0];
		double min = arr[0];

		for (int i = 1; i < arr.length; i++) { // 0��°�� �ִ밪���� �����߱⶧���� 1��°���� ���Ѵ�.
			if (max < arr[i]) {
				max = arr[i];
			} else if(min > arr[i]){
				min = arr[i];
			}

		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);

	}

}
