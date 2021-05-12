package mythread;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadEx soo = new ThreadEx("철수");
		soo.start();
		
		new ThreadEx("영희").start();

		RunnableEx mrun = new RunnableEx();// RunnableEx 서브클래스

		Thread th = new Thread(mrun);// 승급
		th.start();

		//쓰레드 개수 : 4
		int cnt = Thread.currentThread().activeCount();
		System.out.println(cnt);
	}

}
