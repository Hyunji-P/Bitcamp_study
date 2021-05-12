package mythread;

public class ThreadEx01 {

	public static void main(String[] args) {
		RandomCreator rc = null;

		try {
			rc = new RandomCreator();
			rc.start();

			for (int i = 0; i < 20; i++) {
				// 생성자를 1번만 호출하고 버릴것(1회용)
				new UserCalender();
				Thread.sleep(1000);

			}
//			int i = 0;
//			while (true) {
//				i += 1;
//				System.out.println("메인 쓰레드 : " + i);
//				Thread.sleep(1000);
//			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

//Thread.sleep(1000); 를 추가 할때 
//동작에 제한을 걸다보면 다른 쓰레드가 외부에서 간섭할 수 있음
//ex) 우리가 집중해서 일을 하고 있을때 누군가가 간섭을 하면 집중을 못하고 실수 할 가능성이 있음
//위와 같은 예로 인하여 쓰레드도 똑같이 다른 쓰레드가 간섭할때 기존 실행되던 쓰레드가 문제가 될수 있으니 
//반드시 try catch 절로 예외처리를 해라라는 뜻임 
//간섭에 대한 exception을 상위스택으로 InterruptedException 간섭에 대한 예외를 throws한거라고 봐야함(어제 했던거랑 연관)
