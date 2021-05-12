package pkg0924;

public class PrintStar {

	public static void main(String[] args) {
		// 별 출력하기
		int star = 28;

		String str = "*";

		for (int i = 1; i <= star; i++) {

			System.out.print(str);
			if (i % 5 == 0) {
				System.out.println();
			}

		}

		// 위 문제에서 5의 배수마다 출력했습니다.(다시풀어보기)
		// 1줄에 n개씩 출력이 가능하도록 변형해 보세요.
		// ex) n = 4 이면 한줄에 4개씩 출력합니다.
		System.out.print("\n-----------\n");
		int n = 6;
		for (int i = 1; i <= star; i++) {
			System.out.print(str);
			if (i % n == 0) {
				System.out.println();
			}
		}

	}

}
