package pkg1013;

public class RefTest {

	public static void main(String[] args) {
		Mysuper obj1 = new Mysub();// �±�
		System.out.println(obj1.a);

		// �Ͻ��� ������ �Ұ���
//		System.out.println(obj1.b);

		Mysub sub = (Mysub) obj1; // ����
		System.out.println(sub.a);
		System.out.println(sub.b);

		obj1.haha();
		// obj1 �»� �� Mysub �̹Ƿ� Mysuper�� ����
		// ��ӹް� �־ �޼ҵ忡 ������ �� �ִ�
		sub.hoho();
		// sub. �� haha ���� : ��ӹޱ� ������
		//      �� hoho ���� : �ڱ��ڽ��̱� ������
		
		obj1.Display();
		//�θ��ڽ��� �������̵��� �Ǿ������� �ڽ� �޼ҵ� ȣ��
		//�ָ� �ִ� �޼ҵ� ���� ����� �ڽĸ޼ҵ� ȣ��
	}

}
