package pkg1023;

public class Dosirak {
	//is a ���� ---> ex) ��� ����� ���� �Դϴ�.
	//has a ���� ---> Saram saram , ex) ���ö��ȿ� ����� ���ԵǾ��ִ�. 
	private Saram saram; // ��� ��ü
	private String dname; // ���ö� �̸�
	private int price;// �ܰ�
	private String[] banchan; // = new String[3]; // �������� �迭 , �迭�� �����Ǳ� ������ ���� �������

	public Dosirak(Saram saram, String dname, int price, String[] banchan) {
		this.saram = saram;
		this.dname = dname;
		this.price = price;
		this.banchan = banchan;

	}

	public Saram getSaram() {
		return saram;
	}

	public String getDname() {
		return dname;
	}

	public int getPrice() {
		return price;
	}

	public String[] getBanchan() {
		return banchan;
	}

}
