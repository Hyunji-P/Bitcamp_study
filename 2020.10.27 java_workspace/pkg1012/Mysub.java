package pkg1012;

// ���� Ŭ���� 
public class Mysub extends Mysuper {
//extends : ��� 

	int y = 200;

	public Mysub() {
		// super(); �Ͻ������� ���� ����
		System.out.println("a");
	}

	// ��ö���� ����Ŭ���� ������ �ְ� ���� ��
	public Mysub(String name) {
		// �����ڰ� ��������� �����ϸ� super������ �����
		super(name);
		super.setName(name);

		System.out.println("c");
	}
}
