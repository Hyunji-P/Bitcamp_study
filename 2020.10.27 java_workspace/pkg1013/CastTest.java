package pkg1013;

public class CastTest {

	// �⺻ �ڷ��� ����
	public static void main(String[] args) {

		// implicit casting(�Ͻ��� ����ȯ)
		// �ý����� ���� 5�� �Ǽ��� ���� d�� �����ϱ� ���� ������ �˾Ƽ� 5.0���� ����ȯ
		double d = 5;
		System.out.println(d);

		// explicit casting(����� ����ȯ)
		// ū ������ �����͸� ���� ������ �����ͷ� ����ÿ��� �ݵ�� ����� ����ȯ�� ����� �Ѵ�.
		// �Ҽ��� �κ��� ������ ������.
		int i = (int) 3.14;

		System.out.println(i);

	}

}
