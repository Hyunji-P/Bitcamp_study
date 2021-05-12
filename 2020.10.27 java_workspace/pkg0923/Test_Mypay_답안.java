package pkg0923;

public class Test_Mypay_답안 {

	public static void main(String[] args) {
		double RATE = 5000; // 기본 시급
		double pay; // 임금
		double hours; // 근무 시간

		// 임금 = 5000 * 5 = 25000
		// 임금 = 5000 * 8 + 5000 * 1.5 * 7 = 92500
		hours = 15;

		double FIRST = 8.0; // 분기 시간

		if (hours > FIRST) {
			pay = RATE * FIRST + (int) (1.5 * RATE * (hours - FIRST));
		} else {
			pay = RATE * hours;
		}

		System.out.println("임금은 " + pay + "입니다.");

		hours = 25.0;

		FIRST = 10.0; // 분기 시간
		double SECOND = 20.0;
		pay = 0.0;

		if (hours < FIRST) {
			pay = RATE * hours;

		} else if (hours < SECOND) {
			pay = RATE * FIRST;// 5000*10
			pay += 1.5 * RATE * (hours - FIRST);

		} else {
			pay = RATE * FIRST; // 5000 * 10
			System.out.println(pay);

			pay += 1.5 * RATE * (SECOND - FIRST); // 1.5*5000*(20-10)
			System.out.println(pay);

			pay += 2.0 * RATE * (hours - SECOND);// 2.0*5000*(25-20)
			System.out.println(pay);
		}

		System.out.println("임금은 " + pay + "입니다.");

	}

}
