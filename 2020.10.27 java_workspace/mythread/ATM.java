package mythread;

public class ATM implements Runnable {
	private int balance;

	public ATM(int balance) {
		this.balance = balance;
		System.out.println("최초 금액 " + this.balance);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				int money = (int) (200 * Math.random());

				if (this.balance >= money && money != 0) {
					withdraw(money); // 인출
				} else {
					String imsi = Thread.currentThread().getName();
					imsi += money + "원 인출 불가";
					System.out.println(imsi);
					System.out.println("잔액부족!!");
					System.out.println("현재 잔액 : " + this.balance);
					System.out.println("인출 요구액 : " + money);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private synchronized void withdraw(int money) {
		// 인출을 수행하는 메소드
		// currentThread() : 현재 활성화 된 쓰레드(호출되어서 구동되고 있는 메소드)
		this.balance -= money;
		String imsi = Thread.currentThread().getName() + "이 ";
		imsi += money + "원을 인출하여 ";
		System.out.println(imsi);
		System.out.println("통장 잔액이 " + this.balance + "원 남았습니다.");

	}
	
	//synchronized를 기재를 안하면 철수가 100원을 인출하면 잔액이 900원 ,
	//영희가 100원을 인출하면 잔액이 800원이 남아야하는데 같은 잔액인 800원으로 보일 것임 
	//쓰레드가 동시 작동 할때 계속 다른 쓰레드가 간섭을 하며 이것을 막기 위해 메소드를 바리게이트 쳐야함 
	//그것이 → synchronized(동기화) 키워드를 작성하여 임계영역을 막음 
	
	//임계영역이란? 
	//동시에 여러 개의 쓰레드가 특정 소스 코드 및 메소드를 동시에 접근 하려고 할 경우,
	//해당 메소드를 서로 이용하려고 함 
	//여기서 여러개의 쓰레드가 동시에 접근할 수 있는 코드 영역 또는 메소드를 임계영역이라고 한다.
	//임계영역이 존재하면 심각한 오류가 발생할 수도 있음
	//(ex,잔액 인출 시 동시 접근 하면 a라는 사람이 돈을 인출하고 인출된 다음 잔액이 새로 갱신되어야하는데
	// 그 사이에 b가 돈을 인출하러 접근할 수 없게 해야함 , 이때 사용하는 키워드가 synchronized !

}
