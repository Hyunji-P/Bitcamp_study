package pkg1015;

public class Football extends Sport {
	private int goal;

	public Football(String name, int entry, int goal) {
		super(name, entry);
		this.goal = goal;
	}

	public void show() {
		String imsi = "";
		imsi += "게임 : " + super.getName() + "\n";
		imsi += "엔트리 : " + super.getEntry() + "\n";
		imsi += "골수 : " + this.goal + "\n";
		System.out.println(imsi);

	}
	
	@Override
	public String toString() {
		String imsi = "축구는 재밌어";
		return super.toString() + "\n" + imsi;
		// Sport 클래스에는 toString 메소드가 없어서 그 위에 오브젝트내의 toString 호출
	}

}
