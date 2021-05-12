package pkg12;
public class Sales extends Book {
	private double amount ; //총금액
	
	public Sales() {
		super();
		this.calc(); 
	}
	private void calc() {
		//금액을 계산합니다.
		this.amount = super.getQty() * super.getCost() * (1.0 - Book.discount) ;
	}
	public void Display() {
		//금액을 출력해 줍니다.
		String imsi = "품목\n";
		imsi += super.getArticle() + " : " + this.amount + "원" ;
		System.out.println( imsi ); 
	}
}