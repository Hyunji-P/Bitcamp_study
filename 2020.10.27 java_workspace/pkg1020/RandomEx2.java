package pkg1020;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		Random rand = new Random();

		// ������ �迭 5���� �����ϰ� , ���Ǵ� ������ �����Ѵ�.
		boolean[] bool = new boolean[5];
		for (int i = 0; i < bool.length; i++) {
			bool[i] = rand.nextBoolean();
			System.out.print(bool[i] + "\t");
		}
		System.out.println();

		boolean res = rand.nextBoolean();
		System.out.println(res);

		// 0.0 �̻� ~ 1.0 �̸��� �Ǽ� ���� ��ȯ�Ѵ�.
		double dbl = rand.nextDouble();
		System.out.println(dbl);

		// nextInt(n) : 0���� (n-1)������ ������ ���� 1���� �����Ѵ�.
		// 1���� 5������ ���� 1�� ����
		int jungsu = rand.nextInt(6) + 1;
		System.out.println(jungsu);
		System.out.println();

		// ����) �ֻ����� 3�� ������ ������ ������ ���ϴ� ���α׷� �ۼ��ϼ���.
		int[] jusawee = new int[3];
		int total = 0;

		System.out.println("�ֻ��� " + jusawee.length + "�� ������");
		for (int i = 0; i < jusawee.length; i++) {
			// 7������ ������ 0���� 6������ ����
			// 0�� ���ԵǸ� �ȵǴϱ� �ֻ���������� 6���� ���� + 1 �ؾ���
			jusawee[i] = rand.nextInt(6) + 1;
			if (i == jusawee.length - 1) {
				System.out.print(jusawee[i]);
			} else {
				System.out.print(jusawee[i] + " + ");
			}

			total += jusawee[i];
		}
		System.out.println(" =  " + total);
		
		//���� �� �õ� �����ϱ�
		//�õ� �� : ���� �޼ҵ忡 �־� �ִ� ������ ������ �ǹ��Ѵ�.
		//�õ� ���� �־��ִ� ������ �õ� �����̶�� �Ѵ�.(���� �� �����ϰ� ������)
		//�Ϲ������� �õ� ������ ���� ������ , �׻� ������ �������� ���� ���� ó���Ϸ��� �õ������
		//������Ѵ�(ex, �ӽŷ��׿��� ������ ������ �׽�Ʈ�� �ϰ� ������)
		//������ 1234�� ���� �õ� ���� ���� ���� ���� �ش�.
		System.out.println("�õ� ���� ����");
		long seed = 1234;
		Random rand2 = new Random(seed);
		for (int i = 0; i < 10; i++) {
			int rnd = rand2.nextInt(6) + 1;
			System.out.println(rnd);
		}
		
		
	}

}
