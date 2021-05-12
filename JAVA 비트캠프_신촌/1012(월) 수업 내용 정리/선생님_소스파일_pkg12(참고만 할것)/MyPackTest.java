package pkg12;

import java.util.Scanner;
import mypackage.MyPackOne;
import mypackage.MyPackTwo;

public class MyPackTest {
	public static void main(String[] args) {
		MyPackOne myone = new MyPackOne();
		myone.one();
		
		MyPackTwo mytwo = new MyPackTwo() ;
		mytwo.two();
		
		Scanner scan = new Scanner(System.in) ;
	}
}




