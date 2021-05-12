package pkg0925;

public class DoubleFor2 {

	public static void main(String[] args) {
		// ÁßÃ¸ for¹®
		int total = 0;

		for (int i = 1; i < 3; i++) {
			for (int j = 5; j < 8; j++) {
				total += i + j;
			}
		}
		System.out.println("ÃÑÇÕ : " + total);

		total = 0;

		for (int i = 1; i < 4; i += 2) {
			for (int j = 2; j < 6; j += 3) {
				total += 2 * i + j;
			}
		}
		System.out.println("ÃÑÇÕ : " + total);

	}

}
