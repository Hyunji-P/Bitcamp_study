package pkg0924;

public class SunToOne {

	public static void main(String[] args) {
		// 1���� n������ �� ���ϱ�

		int su = 10;
		int total = 0;

		for (int i = 1; i <= su; i++) {
			total += i;
		}
		System.out.println("���� : " + total);

		int su1 = 1;
		int su2 = 10;

		total = 0;
		// su1���� su2������ ���� ���ϱ�

		for (int i = su1; i <= su2; i++) {
			total += i; // total = total + i ;

		}
		System.out.println("���� : " + total);

		su1 = 6;
		su2 = 3;
		// su1���� su2������ ���� ���ϱ�

		total = 0;

//		for (int i = su1; i >= su2; i--) {
//			total += i;
//		}
//		System.out.println("���� : " + total);

		// �˰��� swap ���� ���� Ǯ��
		int temp;
		temp = su2;
		su2 = su1;
		su1 = temp;

		for (int i = su1; i <= su2; i++) {
			total += i; // total = total + i ;

		}
		System.out.println("���� : " + total);

		// ����
		// 1�� ������ 1
		// 2�� ������ 4
		// ...
		// 10�� ������ 100

		total = 0;
		for (int i = 1; i < 11; i++) {
			total = i * i;
			System.out.println(i + "�� ������ " + total);
		}
		
		//�������� ����Ǯ�� �� printf() �޼ҵ带 ��� 
		for (int i = 1; i < 11; i++) {
			String imsi = "%2d�� ������ %3d�Դϴ�.\n";
			System.out.printf(imsi, i, i * i);
		}

	}

}
