package pkg12;

import java.util.Scanner;

public class Book {
	private String article ;//품목
	private int qty ; //수량
	private int cost ; //단가
	
	static double discount ; //할인율
	static int count ; //총 판매 권수
	
	private Scanner scan = null ;
	
	public String getArticle() {
		return article ;
	}
	
	public int getQty() {
		return qty;
	}

	public int getCost() {
		return cost;
	}

	public Book() {//생성자
		this.scan = new Scanner(System.in) ;
		
		System.out.print("품목 : ");
		this.article = scan.next() ;
		
		System.out.print("수량 : ");
		this.qty = scan.nextInt() ;
		
		count += qty ; //총 판매 권수 누적
		
		System.out.print("단가 : ");
		this.cost = scan.nextInt() ;
	}
}








