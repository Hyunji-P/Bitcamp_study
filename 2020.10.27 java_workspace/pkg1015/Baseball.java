package pkg1015;

public class Baseball extends Sport {
	private double hitrate;// 타율

	public void Baseball() {

	}

	public Baseball(String name, int entry, double hirate) {
		super(name, entry);
		this.hitrate = hirate;
	}

	public void Display() {
		String imsi = "";
		imsi += "게임 이름 : " + super.getName() + "\n";
		imsi += "엔트리 : " + super.getEntry() + "\n";
		imsi += "타율 : " + this.hitrate + "\n";
		System.out.println(imsi);

	}

}
