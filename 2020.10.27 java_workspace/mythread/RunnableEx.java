package mythread;

import java.util.Random;

class Some {
}

public class RunnableEx extends Some implements Runnable {

	@Override
	public void run() {
		String[] arr = { "���缮", "��ȿ��", "����ȭ", "����", "ȭ��" };

		try {
			for (int i = 0; i < 100; i++) {
				// �͸� ��ü new Random().nextInt(arr.length)
				String item = arr[new Random().nextInt(arr.length)];
				System.out.println(item);
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
