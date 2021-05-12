package pkg0921;

public class Assignment01 {

	public static void main(String[] args) {
		int x = 5; // x에 5라는 숫자를 기억시켜라.
					// = 기호는 값을 할당 / 지정하는 역할이다.
					// = 기호를 대입(assignment)연산자라고 한다.

		// x = x + 3; 현재 x의 값에 3을 더하시오. (누적)
		x += 3;
		System.out.println("x : " + x);

		x *= 4;
		System.out.println("x : " + x);

		x %= 5;
		System.out.println("x : " + x);

		x -= 1;
		System.out.println("x : " + x);

		x += 7;
		System.out.println("x : " + x);

		// 문제) 복합 대입 연산자를 이용하여 1부터 10까지의 총합인 55를 total 변수에 저장하는 프로그램을 작성하시오.
		int total = 0;

		for (int i = 1; i <= 10; i++) {
			total += i;
		} 
		
		/*total +=1;
		  total +=2;
		  total +=3;
		  total +=4;
		  total +=5;
		  total +=6;
		  total +=7;
		  total +=8;
		  total +=9;
		  total +=10;*/
		
		System.out.println("total : " + total);
		

	}

}
