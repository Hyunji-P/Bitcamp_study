package pkg1013;

public class Mysub extends Mysuper {
	int b = 200;

	public void hoho() {
		System.out.println("ȣȣ");
	}

	@Override
	public void Display() {
		super.Display(); // �޼ҵ� ����ȭ�� ������ ����Ŭ������ ȣ���ϰ� ������
		System.out.println("abcd");
	}

}
