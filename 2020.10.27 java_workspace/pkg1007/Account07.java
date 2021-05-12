package pkg1007;

import java.util.Scanner;

public class Account07 {
	private String name;
	private int no;
	private int balance;

	Scanner scan;// 클래스 안에 적어서 scan : 인스턴스 변수 , Scanner : 클래스

	public Account07(String name, int no, int balance) {
		this();// 매개변수가 없는 생성자 호출됨

		// 목적 : 생성되자 마자 무엇인가를 구현하고 자 할 때 사용된다.
		this.scan = new Scanner(System.in);// Scanner : 생성자

		// 목적 : 인스턴스 변수의 값을 초기화 할 용도로 사용된다.
		this.name = name;
		this.no = no;
		this.balance = balance;
//		this.Display();

	}

	public Account07() {// 생성자
		System.out.println("호출!!");
		// heap 메모리에 객체가 생성된 다음에 생성자가 자동으로 1번만 호출
		// 개발자가 생성자를 만들었으므로 기본 생성자는 사라지고 생성자는 1개이다
	}

	// 생성자 모두 주석 처리 : hee 객체만 오류 없음
	// why? 매개변수가 0개인 것은 기본 생성자 1개를 의미 하기 때문에

	public Account07(String name, int balance) {
		this.name = name;
		this.balance = balance;
		this.no = 9999;
	}

	public void Display() {
		System.out.println("예금주 : " + this.name);
		System.out.println("계좌 번호 : " + this.no);
		System.out.println("예치금 : " + this.balance);
		System.out.println();

	}

}
