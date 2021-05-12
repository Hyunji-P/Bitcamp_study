package pkg1022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Test_LottoTest {

	public static void main(String[] args) {
		Set<Object> lotto = new HashSet<Object>();
		Random rand = new Random();
		int secondsu = 0;

		while (lotto.size() < 7) {
			int su = rand.nextInt(45) + 1;

			// 2�� ��ȣ�� �����ؾ��ϴµ� set ������ ����� ���� �ٱ��Ͽ� ���Ƿ�
			// � ��ȣ�� 2�� ��ȣ ���� �˼��� ����
			// ���� , �׳� �������� ���� ��ȣ�� 2���ȣ��� ����
			if (lotto.size() == 6) {
				secondsu = su;
			}
			lotto.add(su);

		}
		lotto.remove(secondsu);
		// ������ �Ҽ� �ֵ��� toArray() �޼ҵ� ���

		System.out.print("�ζ� ��ȣ : ");
		Object[] obj = lotto.toArray();
		Arrays.sort(obj);

		// ���� �ڷ��� : Ŭ���� , �������̽� , �迭 --> toString() �ϸ� �ּҰ��� ����
		// �ذ� ��� : for������ �ؼ� 1���� ������ ���

		for (Object item : obj) {
			System.out.print(item + "  ");
		}
		System.out.println("/  2�� : " + secondsu);

	}

}
