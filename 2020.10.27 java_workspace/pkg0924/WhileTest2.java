package pkg0924;
//���� while ���� , �ݵ�� ���������� ���� break �� �־���� 
import java.util.Scanner;

public class WhileTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // System.in (Ű����) ���� ������ ���� scanner�� ����� �ش�.
//
//		System.out.println("����1 �Է�");
//		int su = scan.nextInt(); // Ű����� �Է� ���� ��
//
//		System.out.println("����2 �Է�");
//		int su2 = scan.nextInt(); // Ű����� �Է� ���� ��
//
//		System.out.println("�Էµ� ���� : " + (su+ su2));

		int total = 0;

		while (true) {
			System.out.println("���� ������ �� : " + total);
			System.out.println("���� ���� �Է� :");
			int su = scan.nextInt();

			if (su < 0) {
				System.out.println("������ �Է� X");
				break;
			}

			total += su;

		}
		System.out.println("���� : " + total);

	}
}
