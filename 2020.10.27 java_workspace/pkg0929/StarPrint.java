package pkg0929;
//�������� Ǫ�� ������� �ٽ� Ǯ�� ���� 

import java.util.Scanner;

//��ĳ�� Ŭ������ �̿��Ͽ� ���� 1���� �Է¹޽��ϴ�.
//���� , ������ �ԷµǸ� ���밪���� �����մϴ�.(Math.abs())
//���� 0�� �ԷµǸ� �� 5���� ����ϵ��� �մϴ�.
//�ش� �� ��ŭ ���� ������ִ� �޼ҵ� ShowStar��� �޼ҵ带 �����ϼ���.

public class StarPrint {

	static void ShowStar(int star) {
		if (star > 0) {
			for (int i = 1; i < star + 1; i++) {
				System.out.print("*");
			}
		} else if (star == 0) {
			for (int i = 1; i < 6; i++) {
				System.out.print("*");
			}
		} else {
			star = Math.abs(star);
			for (int i = 1; i < star + 1; i++) {
				System.out.print("*");
			}

		}
//�������� Ǫ�� ��� 
//		if(star == 0) {
//			star = 5;
//		}else if(star < 0) {
//			star = Math.abs(star);
//		}
//		for(int i = 1 ; i <= star ; i++) {
//			System.out.print("*");
//		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� 1���� �Է� : ");
		int star = scan.nextInt();
		ShowStar(star);

	}
}
