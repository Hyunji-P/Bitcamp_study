package pkg1015;

public class Sport {
	private String name; // 스포츠 이름
	private int entry;// 엔트리

	public Sport(String name, int entry) {
		this.name = name;
		this.entry = entry;
	}

	public final void Play() {
		String imsi = this.name + "게임을 합니다.";
		System.out.println(imsi);
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public int getEntry() {
		return entry;
	}
}
