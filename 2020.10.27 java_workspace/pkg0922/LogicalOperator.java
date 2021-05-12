package pkg0922;

public class LogicalOperator {

	public static void main(String[] args) {

		// 관계연산자
		int x = 3, y = 2;
		/*
		 * System.out.println(x > y); 
		 * System.out.println(x >= y); 
		 * System.out.println(x<= y); 
		 * System.out.println(x < y); 
		 * System.out.println(x == y);
		 * System.out.println(x != y);
		 */
        
		// 논리연산자
		boolean result = (3 > 2) && (3 > 4);
		System.out.println(result);

		result = (x != y) && (-1 > 0);
		System.out.println(result);

		result = !result;
		System.out.println(result);
		
		
		int a = 10;
		int b = 8;
		
		boolean bool1 = true;
		System.out.println(bool1);
		boolean bool2 = --a == b++; //다시 풀어볼 것 
		// 1) --a 
		// 2) bool2 = a == b;
		// 3) b++
		System.out.println(bool2);
		boolean bool3 = a++ != --b; //다시 풀어볼 것 
		// 1) --b 
		// 2) bool3 = a != b;
		// 3) a++
		System.out.println(bool3);
		boolean bool4 = bool3 && (5>7);
		System.out.println(bool4);
		boolean bool5 = !bool4 || (bool1 && bool2); //다시 풀어볼 것 
		System.out.println(bool5);
	}

}
