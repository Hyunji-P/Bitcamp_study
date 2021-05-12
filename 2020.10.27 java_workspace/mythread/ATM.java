package mythread;

public class ATM implements Runnable {
	private int balance;

	public ATM(int balance) {
		this.balance = balance;
		System.out.println("���� �ݾ� " + this.balance);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				int money = (int) (200 * Math.random());

				if (this.balance >= money && money != 0) {
					withdraw(money); // ����
				} else {
					String imsi = Thread.currentThread().getName();
					imsi += money + "�� ���� �Ұ�";
					System.out.println(imsi);
					System.out.println("�ܾ׺���!!");
					System.out.println("���� �ܾ� : " + this.balance);
					System.out.println("���� �䱸�� : " + money);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	private synchronized void withdraw(int money) {
		// ������ �����ϴ� �޼ҵ�
		// currentThread() : ���� Ȱ��ȭ �� ������(ȣ��Ǿ �����ǰ� �ִ� �޼ҵ�)
		this.balance -= money;
		String imsi = Thread.currentThread().getName() + "�� ";
		imsi += money + "���� �����Ͽ� ";
		System.out.println(imsi);
		System.out.println("���� �ܾ��� " + this.balance + "�� ���ҽ��ϴ�.");

	}
	
	//synchronized�� ���縦 ���ϸ� ö���� 100���� �����ϸ� �ܾ��� 900�� ,
	//���� 100���� �����ϸ� �ܾ��� 800���� ���ƾ��ϴµ� ���� �ܾ��� 800������ ���� ���� 
	//�����尡 ���� �۵� �Ҷ� ��� �ٸ� �����尡 ������ �ϸ� �̰��� ���� ���� �޼ҵ带 �ٸ�����Ʈ �ľ��� 
	//�װ��� �� synchronized(����ȭ) Ű���带 �ۼ��Ͽ� �Ӱ迵���� ���� 
	
	//�Ӱ迵���̶�? 
	//���ÿ� ���� ���� �����尡 Ư�� �ҽ� �ڵ� �� �޼ҵ带 ���ÿ� ���� �Ϸ��� �� ���,
	//�ش� �޼ҵ带 ���� �̿��Ϸ��� �� 
	//���⼭ �������� �����尡 ���ÿ� ������ �� �ִ� �ڵ� ���� �Ǵ� �޼ҵ带 �Ӱ迵���̶�� �Ѵ�.
	//�Ӱ迵���� �����ϸ� �ɰ��� ������ �߻��� ���� ����
	//(ex,�ܾ� ���� �� ���� ���� �ϸ� a��� ����� ���� �����ϰ� ����� ���� �ܾ��� ���� ���ŵǾ���ϴµ�
	// �� ���̿� b�� ���� �����Ϸ� ������ �� ���� �ؾ��� , �̶� ����ϴ� Ű���尡 synchronized !

}
