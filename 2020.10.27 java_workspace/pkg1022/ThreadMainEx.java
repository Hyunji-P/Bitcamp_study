package pkg1022;

public class ThreadMainEx {

	public static void main(String[] args) {
		// thread �� �������� �����ϱ� ���ϰ� ������� �޼ҵ� ����
		long id = Thread.currentThread().getId();
		// ���� ������ ����� �ִٰ� ������ ��
		String name = Thread.currentThread().getName();
		// ���� ������ ����� �ִٰ� ������ ��
		int count = Thread.currentThread().activeCount();
		// ���ݱ��� �ؿ� ������ : single thread
		int priority = Thread.currentThread().getPriority();
		// ex) pc���� �뷡 , ��� , ���� ���� �۾� -> �ϳ��� pc���� ������ ������ ���� -> ���ۿ��� �켱������ �ο��� �� priority
		// �켱���� : 1 ~ 10 �̸� ���ڰ� ���� ���� �켱������ ���� 
		
		//�¾�� ������������ ������ ����Ŭ�̶�� �ϸ� �� ���� ����� ������ �ߴٰ� ����ٸ� �ݺ���
		//�����嵵 ���������� �����Ǿ��ٰ� �Ҹ�Ǳ� ���� ���� ������ �ߴٰ� ���߱⸦ �ݺ�
		//�����嵵 ���°��� ���� -> ���� ������ �����ϰ� �ִ� �޼ҵ� : getState() 

		System.out.println("������ ���̵� : " + id);
		System.out.println("������ �̸� : " + name);
		System.out.println("���� ���� ������ ���� : " + count);
		System.out.println("������ �켱 ���� : " + priority);
	}

}
