package pkg1015;

public class Baseball extends Sport {
	private double hitrate;// Ÿ��

	public void Baseball() {

	}

	public Baseball(String name, int entry, double hirate) {
		super(name, entry);
		this.hitrate = hirate;
	}

	public void Display() {
		String imsi = "";
		imsi += "���� �̸� : " + super.getName() + "\n";
		imsi += "��Ʈ�� : " + super.getEntry() + "\n";
		imsi += "Ÿ�� : " + this.hitrate + "\n";
		System.out.println(imsi);

	}

}
