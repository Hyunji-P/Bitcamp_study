package pkg1015;

public class Football extends Sport {
	private int goal;

	public Football(String name, int entry, int goal) {
		super(name, entry);
		this.goal = goal;
	}

	public void show() {
		String imsi = "";
		imsi += "���� : " + super.getName() + "\n";
		imsi += "��Ʈ�� : " + super.getEntry() + "\n";
		imsi += "��� : " + this.goal + "\n";
		System.out.println(imsi);

	}
	
	@Override
	public String toString() {
		String imsi = "�౸�� ��վ�";
		return super.toString() + "\n" + imsi;
		// Sport Ŭ�������� toString �޼ҵ尡 ��� �� ���� ������Ʈ���� toString ȣ��
	}

}
