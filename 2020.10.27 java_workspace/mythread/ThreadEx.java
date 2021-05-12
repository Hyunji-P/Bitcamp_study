package mythread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadEx extends Thread {

	// thread ���۷��� ����
	public ThreadEx(String name) {
		super(name);// thread �����ڿ� �Ű����� String ������

	}

	@Override
	public void run() {

		try {
			for (int i = 0; i < 100; i++) {
				Thread.sleep(3000);
				Date date = new Date();
				String pattern = super.getName() + "�� ������ �ð� : hh�� mm�� ss��";
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);

				String now = sdf.format(date);

				System.out.println(now);

			}

		} catch (InterruptedException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
