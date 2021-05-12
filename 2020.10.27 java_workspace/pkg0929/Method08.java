package pkg0929;

//main 메소드에서 스캐너를 사용하여 이름과 나이를 입력 받으세요.
//이름과 나이를 입력 받아서 출력해주는 namePrint() 메소드를 구현해 보세요.
//스캐너 
//	nextInt() : 정수 입력
//  next() : 문자열 입력 

import java.util.Scanner;

public class Method08 {

	static void namePrint(String a, int b) {
		System.out.println("이름 : " + a);
		System.out.println("나이 : " + b);

		// printf 로 출력하기
		// String imsi = "이름 : %s , 나이 : %d";
		// System.out.printf(imsi , a , b);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("이름을 입력하세요.");
		String name = scan.next();

		System.out.println("나이를 입력하세요.");
		int age = scan.nextInt();

		namePrint(name, age);// 메소드 호출

	}

}
