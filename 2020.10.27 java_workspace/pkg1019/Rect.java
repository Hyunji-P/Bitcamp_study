package pkg1019;

//�簢�� 
public class Rect {
	int width;// ����
	int height;// ����

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// ������ ���Ͽ� ���� ���ؾ��ϹǷ�
	// equals() �޼ҵ带 �������̵� �Ͽ� �� �Ը� ��� �ٲٰڴ�.

	@Override
	public boolean equals(Object obj) {
		// �� ��ü�� ������ �����ϸ� true �� ��ȯ
		// obj = recB , recA�� ���� ��ü�̱� ������ this
		Rect target = (Rect) obj;// ����
		boolean result = (this.width * this.height == target.width * target.height);
		return result;
	}

}
