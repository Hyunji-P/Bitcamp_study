package mythread;

public class SynchronizedEx1 {

	public static void main(String[] args) {
		int inputmoney = 1000;

		ATM atm = new ATM(inputmoney);

		Thread soo = new Thread(atm, "±èÃ¶¼ö");
		Thread hee = new Thread(atm, "¹Ú¿µÈñ");

		soo.start();
		hee.start();

	}

}
