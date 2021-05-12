package pkg1026;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Generateor extends Thread {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	// map�̶�� �ٱ��Ͽ� 4�� �ִ��� ����� containsKey() ���
	// ������ put() �޼ҵ�� ���� ����
	// ������ get() �޼ҵ�� ���� ������

	@Override
	public void run() {

		try {
			System.out.println("������ ���� �� �Դϴ�.");
			for (int i = 0; i < 100; i++) {
				Thread.sleep(100);
				int key = new Random().nextInt(10) + 1;
				System.out.println(key);

				if (map.containsKey(key)) {
					int value = map.get(key).intValue();
					map.put(key, value + 1);
				} else {
					map.put(key, 1);
				}
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		PrintResult();

	}

	private void PrintResult() {
		System.out.println("=== ��� ��� ===");
		for (int i = 1; i < 11; i++) {
			int value = map.get(i);
			System.out.println(i + "\t" + value);
		}

		System.out.println("�����մϴ�. �������ϴ�.");

	}

}
