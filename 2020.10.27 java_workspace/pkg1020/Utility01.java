package pkg1020;

import java.util.Random;

//����� ������ 5���� ������ �迭 arr�� �����մϴ�.
//1���� 10������ ���� �߿��� ������ ���� �迭 ��ҿ� �����մϴ�.
//�� ����� ������ ���غ�����.
//����) 4 6 7 3 9 --> 29
public class Utility01 {

	public static void main(String[] args) {
		int[] arr = new int[5];

		Random rand = new Random();

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
			total += arr[i];

			if (i == arr.length - 1) {
				System.out.print(arr[i] + " = ");
			} else {
				System.out.print(arr[i] + " + ");
			}

		}
		System.out.println(total);

	}

}
