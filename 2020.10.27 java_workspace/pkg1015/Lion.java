package pkg1015;

public class Lion extends Animal {
	public Lion(String name, String location) {
		super(name, location);
	}

	// Ư¡) �߻� Ŭ������ ��� �޴� Ŭ������ �ݵ�� �߻� �޼ҵ带 �������̵� �ؾߵȴ�.
	@Override // implementation(��üȭ)
	public void move() {
		String imsi = super.getName() + "�� " + super.getLocation() + "���� �޸��ϴ�.";
		System.out.println(imsi);

	}
}
