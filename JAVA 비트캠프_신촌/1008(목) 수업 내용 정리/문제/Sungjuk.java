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
		System.out.println("���� : " + this.sungjuk);
		System.out.println("���� : " + this.hakjum);
		System.out.println("�� : " + this.comment);
	}
	
	public Sungjuk() {
		scan = new Scanner(System.in) ;
		this.InputData();
		this.calcSungjuk();
		this.getHakjum();
	}	
	private void getHakjum() {
		System.out.println("���� ���ϱ�");
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
		System.out.println("���� ���ϱ�");
		this.sungjuk = 
				this.finalexam * 0.3 +
				this.midexam * 0.3 +
				this.report * 0.2 +
				this.attendance * 0.2  ;
	}
	public void InputData() {
		System.out.print("�⸻ ���� :");
		this.finalexam  = scan.nextInt();

		System.out.print("�߰� ��� :");
		this.midexam  = scan.nextInt();
		
		System.out.print("����Ʈ :");
		this.report  = scan.nextInt();
		
		System.out.print("�⼮ :");
		this.attendance  = scan.nextInt();
	}
	
}







