package pkg1015;

public class Sport {
	private String name; // ������ �̸�
	private int entry;// ��Ʈ��

	public Sport(String name, int entry) {
		this.name = name;
		this.entry = entry;
	}

	public final void Play() {
		String imsi = this.name + "������ �մϴ�.";
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
