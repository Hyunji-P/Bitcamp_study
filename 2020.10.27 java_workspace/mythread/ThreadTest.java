package mythread;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadEx soo = new ThreadEx("ö��");
		soo.start();
		
		new ThreadEx("����").start();

		RunnableEx mrun = new RunnableEx();// RunnableEx ����Ŭ����

		Thread th = new Thread(mrun);// �±�
		th.start();

		//������ ���� : 4
		int cnt = Thread.currentThread().activeCount();
		System.out.println(cnt);
	}

}
