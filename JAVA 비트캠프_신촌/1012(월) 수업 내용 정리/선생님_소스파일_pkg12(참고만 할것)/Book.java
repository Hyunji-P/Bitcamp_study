package pkg12;

import java.util.Scanner;

public class Book {
	private String article ;//ǰ��
	private int qty ; //����
	private int cost ; //�ܰ�
	
	static double discount ; //������
	static int count ; //�� �Ǹ� �Ǽ�
	
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

	public Book() {//������
		this.scan = new Scanner(System.in) ;
		
		System.out.print("ǰ�� : ");
		this.article = scan.next() ;
		
		System.out.print("���� : ");
		this.qty = scan.nextInt() ;
		
		count += qty ; //�� �Ǹ� �Ǽ� ����
		
		System.out.print("�ܰ� : ");
		this.cost = scan.nextInt() ;
	}
}








