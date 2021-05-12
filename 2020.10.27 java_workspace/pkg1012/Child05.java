package pkg1012;

public class Child05 extends Mother05 {

	public Child05(String name, int age) {
		super(name, age);

	}
	
	// * �����ε�
	public Child05(int x, int y) {
		this.overload(x, y);
		this.overload(x);

	}

	private void overload(int x, int y) {
		// �� ���� ����
		int result = x + y;
		System.out.println("����01 : " + result);

	}

	private void overload(int x) {
		// 1���� x������ ����
		int total = 0;
		for (int i = 1; i <= x; i++) {
			total += i;
		}
		System.out.println("����02 : " + total);
	}

	public void getData() {
		super.Display();// ���� Ŭ���� ȣ��
		// ����ī�� 20���Դϴ� ���
		this.Display();// ���� Ŭ���� ȣ��
		// �̸� : ����ī , ���� : 20 ���
	}

//	*�������̵� ���
//	*�ñ״�ó �״�� ���� 
//	public void Display() { �θ�Ŭ����
//		String imsi = "%s�� %d�� �Դϴ�.";
//		System.out.printf(imsi, this.name, this.age);
//	}

	// ������̼�(annotation) : ����ڿ��� �����ΰ��� �����ϱ� ���� ��� �ּ�
	@Override // ������̼� : �� �޼ҵ�� �������̵� �Ǿ���.
	public void Display() {
		String imsi = "�̸� : %s, ���� : %d";
		System.out.printf(imsi, super.getName(), super.getAge());
		System.out.println();
	}

}
