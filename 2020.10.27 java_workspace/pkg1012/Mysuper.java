package pkg1012;

//����Ŭ����
public class Mysuper {
	int x = 100;
	private String name;

	//�� ù��° setter ��� 
	public void setName(String name) {
		this.name = name;
	}

	//�� �ι�° : �����ڰ� ��������� �����Ͽ� ������ �����ε� 
	public Mysuper(String name) {// �θ��� ������
		this.name = name;
	}

	public Mysuper() {// �θ��� ������
		System.out.println("b");
	}

	// ��� �Ұ����� ����
	private String hello = "�ȳ��ϼ���.";

	// private �� ���������� ������ ���������� ���� ������ �޼ҵ带 ����
	public void sayhello() {
		System.out.println("�λ縻 : " + this.hello);

	}

}
