package pkg0924;

public class For04 {

	public static void main(String[] args) {
		/*
		 * 1부터 10까지의 정수 중에서 
		 * sum0 = 3+6+9=18 
		 * sum1 = 1+4+7+10=22 
		 * sum2 = 2+5+8=15
		 * 
		 * for 구문과 switch case 구문을 이용하여 다음 문제를 풀어 보세요.
		 */
		int sum0 = 0, sum1 = 0, sum2 = 0;

		for (int i = 1; i < 11; i++) {
			switch (i % 3) {
			case 0: // 나머지 식 
				sum0 += i;
				break;
			case 1:
				sum1 += i;
				break;
			case 2:
				sum2 += i;
				break;
			}
		}
		
		System.out.println("sum0 : " + sum0);
		System.out.println("sum1 : " + sum1);
		System.out.println("sum2 : " + sum2);
		
	}
}
