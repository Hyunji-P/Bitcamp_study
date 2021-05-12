package pkg11;

import java.util.Scanner;

public class Sungjuk {
	private int finalexam ;
	private int midexam ;
	private int report ;
	private int attendance ;
	private double sungjuk ;
	private String hakjum ;
	private String comment ;
	private Scanner scan ; 

	public void Display() {
		System.out.println("성적 : " + this.sungjuk);
		System.out.println("학점 : " + this.hakjum);
		System.out.println("평가 : " + this.comment);
	}
	
	public Sungjuk() {
		scan = new Scanner(System.in) ;
		this.InputData();
		this.calcSungjuk();
		this.getHakjum();
	}	
	private void getHakjum() {
		System.out.println("학점 구하기");
		if (this.sungjuk >= 90.0) {
			this.hakjum = "A" ;
			this.comment = "excellent" ;

		}else if (this.sungjuk >= 80.0) {
			this.hakjum = "B" ;
			this.comment = "excellent" ;
			
		}else if (this.sungjuk >= 70.0) {
			this.hakjum = "C" ;
			this.comment = "good" ;
			
		}else if (this.sungjuk >= 60.0) {
			this.hakjum = "D" ;
			this.comment = "good" ;
			
		} else {
			this.hakjum = "F" ;
			this.comment = "poor" ;
		}
		
	}
	private void calcSungjuk() {
		System.out.println("성적 구하기");
		this.sungjuk = 
				this.finalexam * 0.3 +
				this.midexam * 0.3 +
				this.report * 0.2 +
				this.attendance * 0.2  ;
	}
	public void InputData() {
		System.out.print("기말 시험 :");
		this.finalexam  = scan.nextInt();

		System.out.print("중간 고사 :");
		this.midexam  = scan.nextInt();
		
		System.out.print("리포트 :");
		this.report  = scan.nextInt();
		
		System.out.print("출석 :");
		this.attendance  = scan.nextInt();
	}
	
}







