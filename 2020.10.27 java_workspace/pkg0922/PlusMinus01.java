package pkg0922;

public class PlusMinus01 {

	// 증감연산자
	public static void main(String[] args) {
		int a = 10, b = 20, c;

		c = ++a + b++;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

		c = a++ + --b;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

		a = 15;
		b = 12;
		c = --a + --b;

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		
		--a;
		c += a-- + ++b;
		//1) ++b;
		//2) c += a+b;
		//3) a--;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		

	}

}
