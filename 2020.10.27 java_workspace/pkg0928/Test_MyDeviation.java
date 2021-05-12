package pkg0928;

//ǥ������ ���ϱ�(deviation �޼ҵ� �ȿ� ����)
//ǥ�� ���� ���ϴ� ����
//ǥ�� ����(standard deviation)�� ���ϼ���.
//1) ����� ���Ѵ�.
//    ��� = ����(160)/arr.length = 160/4 = 40
//2) (���� - ���)�� ������ ��� ������Ų��.
//    900 + 100 + 0 + 1600 = 2600 
//3) 2)�� ����� ������ ������
//    2600/arr.length = 650
//4) 3)�� ��Ʈ�� �����.
//    ��Ʈ 650 = 25.4950975 
//    ��Ʈ : Math.sqrt( 650 )

public class Test_MyDeviation {
	public static void main(String[] args) {
		int[] arr = { 10, 30, 40, 80 };

		double result = deviation(arr);
		System.out.println("��� : " + result);

	}

	static double deviation(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];// ����

		}

		double average = (double) sum / arr.length; // ���

		double cha = 0;

		for (int i = 0; i < arr.length; i++) {
			cha += Math.pow(arr[i] - average, 2.0); // (���� - ���)^2
												  // (int)arr[i] - (double)avarage �� �Ͻ��� ĳ����
		}

		double cha1 = cha / arr.length;// (���� - ���)^2�� ���� ���� �� , �Ͻ��� ĳ����
		double result = Math.sqrt(cha1); // ǥ������ ��� ��

		return result;

	}

}
