package pkg12;
public class Sales extends Book {
	private double amount ; //�ѱݾ�
	
	public Sales() {
		super();
		this.calc(); 
	}
	private void calc() {
		//�ݾ��� ����մϴ�.
		this.amount = super.getQty() * super.getCost() * (1.0 - Book.discount) ;
	}
	public void Display() {
		//�ݾ��� ����� �ݴϴ�.
		String imsi = "ǰ��\n";
		imsi += super.getArticle() + " : " + this.amount + "��" ;
		System.out.println( imsi ); 
	}
}