package pkg1006;

public class Account06 {

	private String name; // 1�� null
	private int age;// 0

//	public void setName(String name) {//2��
//		name = name;//name �ΰ� �� �������� 
//	}

	public void setName(String name) {
		this.name = name;
	}
	//�� name = �� name �̶�� �ϸ� 
	//�� ���� ����� ���������� ������ ã�� �� ���������� ����Ѵٰ� �ν�/ ��������
	//���� ���Ѱ� ���� ���� , 0
	
	//�� this.name = ��name �̶�� �ϸ� 
	//this�� �츮 Ŭ���� �ȿ��� �ڱ��ڽ��� ��Ī�ϴ� �ν��Ͻ� ������ ã�ư�
	
	

	public void setAge(int age) {
		this.age = age;
	}

	private void hello(String msg) {//���� �� Ŭ���������� ���
		System.out.println(msg);
	}

	void Display() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.age);
		this.hello("��ȣ");//�� �ڽŰ� ������ hello�� �ҷ��Ͷ�
		hello("��ȣ");//this��� Ű���尡 �̹� ��������ֱ� ������
					// �Ͻ������� this �� ��Ī��
	}
}
