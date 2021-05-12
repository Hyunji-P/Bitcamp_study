package pkg11;

import java.util.Scanner;

public class Fruit {
	private String item ; // ǰ�� 
	private int qty ; //����
	private int price ; // �ܰ�
	
	private double discount = 0.0 ; //������
	private double amount ; //�� �ݾ�
	
	private Scanner scan ;
	
	public Fruit(){
		this.scan = new Scanner(System.in) ;
		
		this.InputData(); //�Է� �ް�
		this.Compute() ; //��� �ϰ�
		this.Display(); //���� �ְ�
	}
	private void Compute(){
		this.amount = this.qty * this.price ; 
		if (this.amount >= 10000) {
			this.discount += 0.05 ;
		}
		if(this.item.equals("�ٳ���")) {
			this.discount += 0.03 ;
		}
		this.amount *= (1.0 - this.discount) ; 
	}
	private void InputData() {
		System.out.println("ǰ�� : ");
		this.item = scan.next();
		
		System.out.println("���� : ");
		this.qty = scan.nextInt() ;
		
		System.out.println("�ܰ� : ");
		this.price = scan.nextInt() ;
		
	}
	private void Display() {
		System.out.println("ǰ�� : " + this.item);
		System.out.println("���� : " + this.qty);
		System.out.println("�ݾ� : " + this.amount);
	}
}