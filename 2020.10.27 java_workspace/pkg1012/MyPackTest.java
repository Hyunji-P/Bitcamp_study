package pkg1012;

import java.util.Scanner;

import mypackage.MyPackOne; // 클래스를 사용하기 위해 import 경로를 지정해줘야함
import mypackage.MyPackTwo;

public class MyPackTest {

	public static void main(String[] args) {
		MyPackOne myone = new MyPackOne();
		myone.one();

		MyPackTwo mytwo = new MyPackTwo();
		mytwo.two();

		Scanner scan = new Scanner(System.in);

	}

}
