package pkg1007;

public class Rectangle {
	private int width;
	private int height;

	// �޼ҵ�� private �ϸ� �ܺ� Ŭ�������� ������ ���ϹǷ� public ���� ���� ��
	// private �Ϸ��� public�� �޼ҵ�(getter , setter)�� �������� �ؾ��� 
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int area() {// ����
		return this.width * this.height;
	}

	public void perimiter() {// �ѷ�
		int result = 2 * (this.width + this.height);
		System.out.println("�ѷ� : " + result);
	}

	public void result() {// ũ��
		String imsi = "";
		if (this.area() > 300) {
			imsi = "����";

		} else if (this.area() > 200) {
			imsi = "����";
		} else {
			imsi = "����";
		}

		System.out.println("ũ�� : " + imsi);
	}

	public double diagonal() {// �밢�� ����
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

}
