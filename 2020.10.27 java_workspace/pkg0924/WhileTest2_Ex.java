package pkg0924;

import java.util.Scanner;

public class WhileTest2_Ex {

	public static void main(String[] args) {
		// 10 , 30 , 30 , -10
		// ��� ) �� ���� Ƚ�� : 3
		// ���� : 60
		// ��� : 20.0
		Scanner scan = new Scanner(System.in);

		int cnt = 0;
		int sum = 0;
		double avg = 0;

		while (true) {
			System.out.println("������ �Է��ϼ���.");
			int jum = scan.nextInt();

			if (jum < 0) {
				System.out.println("������ �Է� �Ұ� �մϴ�.");
				break; // �ݺ��� ��ü�� �� ���� ���ö� �� 
			}
			cnt += 1; // jum �� ����϶� , �����϶��� cnt  ���� 
			sum += jum; // jum �� ����϶� , �����϶��� sum ����

		}

		avg = (double) sum / cnt; // ����� ������ ������ ���ϴ°� ���� , ���� �ݺ����� ���������� ����ؾ���

		System.out.println("-------���--------");
		System.out.println("�� ���� Ƚ�� : " + cnt);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);

	}

}
