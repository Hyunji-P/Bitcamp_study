package pkg1006;

public class StaticTest {
	int x = 100; // �ν��Ͻ� ����
	static int y = 200;

	static void add(int x, int y) {
		int result = x + y;
		System.out.println(result);
	}

	void hello(String aa) {
		System.out.println(aa);
	}

	public static void main(String[] args) {// static �޼ҵ�
		StaticTest obj = new StaticTest();
		System.out.println(obj.x);
		// �� System.out.println(x) ;
		// main �޼ҵ� : static �� �ν��Ͻ� ���� x�� ���� �� �� ����.

		System.out.println(StaticTest.y);
		// �� static ������ Ŭ���� �������� Ŭ���� �̸����� ���� �����ϴ�.

		add(10, 20);
		// �� add(10,20); : static �޼ҵ�
		// ���� void add(int x, int y) : �ν��Ͻ� �޼ҵ忩�� ���� �Ұ���

		obj.hello("�ȳ��ϼ���.");
		// �� �ν��Ͻ� �޼ҵ带 ������ ���ϰ� ��ü.�޼ҵ��̸�(�Ű�����)�ص� ������
		
		

	}
}
