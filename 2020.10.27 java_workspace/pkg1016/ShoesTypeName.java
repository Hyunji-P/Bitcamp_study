package pkg1016;

//ShoesTypeName(�ѱ��̸�����)
//1. ���� private ������ �����Ѵ�.
//2. private �����ڸ� �����Ѵ�.
//3. public getter�� �����Ѵ�.

public enum ShoesTypeName {
	WALKING("��ŷȭ"), RUNNING("����ȭ"), TRACKING("Ʈ��ŷȭ"), HIKING("���ȭ");

	//1
	private String name;

	//2
	private ShoesTypeName(String name) {
		this.name = name;
	}

	//3
	public String getName() {
		return name;
	}
}
