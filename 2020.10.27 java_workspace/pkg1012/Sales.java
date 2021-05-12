package pkg1012;
//서브 클래스

public class Sales extends Book {
	private double amount; // 총 금액

	public Sales() {
		super();
		this.calc();

	}

	private void calc() {
		// 금액을 계산한다.→ 공통 : 인스턴스 변수
		this.amount = super.getQty() * super.getCost() * (1.0 - Book.discount);

	}

	public void Display() {
		// 금액을 출력해 준다.→ 공통 : 인스턴스 변수
		String imsi = "품목\n";
		imsi += super.getArticle() + " : " + this.amount + "원";
		System.out.println(imsi);

	}
}
