package mythread;

public class SynchronizedEx1 {

	public static void main(String[] args) {
		int inputmoney = 1000;

		ATM atm = new ATM(inputmoney);

		Thread soo = new Thread(atm, "��ö��");
		Thread hee = new Thread(atm, "�ڿ���");

		soo.start();
		hee.start();

	}

}
