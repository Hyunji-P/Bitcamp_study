package pkg11;

import java.util.Scanner;

public class Fruit {
	private String item ; // 품명 
	private int qty ; //수량
	private int price ; // 단가
	
	private double discount = 0.0 ; //할인율
	private double amount ; //총 금액
	
	private Scanner scan ;
	
	public Fruit(){
		this.scan = new Scanner(System.in) ;
		
		this.InputData(); //입력 받고
		this.Compute() ; //계산 하고
		this.Display(); //보여 주고
	}
	private void Compute(){
		this.amount = this.qty * this.price ; 
		if (this.amount >= 10000) {
			this.discount += 0.05 ;
		}
		if(this.item.equals("바나나")) {
			this.discount += 0.03 ;
		}
		this.amount *= (1.0 - this.discount) ; 
	}
	private void InputData() {
		System.out.println("품명 : ");
		this.item = scan.next();
		
		System.out.println("수량 : ");
		this.qty = scan.nextInt() ;
		
		System.out.println("단가 : ");
		this.price = scan.nextInt() ;
		
	}
	private void Display() {
		System.out.println("품명 : " + this.item);
		System.out.println("수량 : " + this.qty);
		System.out.println("금액 : " + this.amount);
	}
}