package pkg1013;

public class RefMain {

	public static void main(String[] args) {
		// ���� ���
		Book java = new Book("�ڹ�", 100);
		Sawon kim = new Sawon("��ö��", "����");

		// ���۷��� ����ȯ
		RefCasting ref01 = new Book("jsp", 200);// �±� , ref �� ��������
		RefCasting ref02 = new Sawon("�ڿ���", "�Ǹ�");// ref �� ��������

		Display(ref01);// å
		Display(ref02);// ���

	}

	// �Ű� ���� obj�� �������̰� �η繶���ϰ� ������ �� �ִ� �̸����� ��� ����
	private static void Display(RefCasting obj) {
//		System.out.println(obj);
		// obj ��ü : ��ü �̸��� ����Ѵٴ� ���� �Ͻ������� toString() �޼ҵ带 ȣ���ϴ� �� �̴�.
		if (obj instanceof Book) {
			// obj�� book���� ������� ����(��ü)�ΰ���?
			System.out.println("�� å�̾�");

			int i = (int) 3.14;

			// �������� ���� Ÿ������ ������� �ݵ�� ����� ����ȯ�� �ʿ��ϴ�.
			Book mybook = (Book) obj;// ���� , obj�� ���� ���ο� ��ü ����
			// ���� ����

			System.out.println("å�̸� : " + mybook.getName());
			System.out.println("�ܰ� : " + mybook.getPrice());

		} else if (obj instanceof Sawon) {
			System.out.println("�� ����̾�");

			Sawon mysawon = (Sawon) obj;// ����

			System.out.println("��� �̸� : " + mysawon.getName());
			System.out.println("�μ��� : " + mysawon.getDepartment());

		} else {
			System.out.println("�ٸ� ���̾�");
		}

	}
}
