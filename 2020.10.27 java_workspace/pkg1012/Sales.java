package pkg1012;
//���� Ŭ����

public class Sales extends Book {
	private double amount; // �� �ݾ�

	public Sales() {
		super();
		this.calc();

	}

	private void calc() {
		// �ݾ��� ����Ѵ�.�� ���� : �ν��Ͻ� ����
		this.amount = super.getQty() * super.getCost() * (1.0 - Book.discount);

	}

	public void Display() {
		// �ݾ��� ����� �ش�.�� ���� : �ν��Ͻ� ����
		String imsi = "ǰ��\n";
		imsi += super.getArticle() + " : " + this.amount + "��";
		System.out.println(imsi);

	}
}
