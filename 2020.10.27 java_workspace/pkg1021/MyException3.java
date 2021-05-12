package pkg1021;

public class MyException3 {

	// third() �޼ҵ忡�� ����ó���� �ؾ��ϳ� ���� �������� ��� �� �ѱ� �� ����
	// �� throws Ű���� ���
	// ���� -> ���Լ���(LIFO) , ���߿� ���� ���� ����
	public static void main(String[] args) {
		// main �޼ҵ嵵 ����ó���� �ϱ� ������ ���ѱ�� �ְ�, ���ѱ�� JVM(�ڹٰ���ӽ�)�� å��������
		try {
			//try�� �ּ� ���� ���� ���ٸ� Ǯ�� �ڹٽý��ۿ��� printStackTrace()�� ������
			String xx = "aa";
			first(xx); // first() �޼ҵ� ȣ��

		} catch (ArithmeticException e) {
			System.out.println("0���� ��������");
		} catch (NumberFormatException e) {
			System.out.println("�߸��� ���� �����̾�");
		} catch (Exception e) {
			System.out.println("������ ����");
		}
	}

	static void first(String xx) throws ArithmeticException, NumberFormatException {
		int x = Integer.parseInt(xx);
		// ���� aa�� ���������� �ٲٷ��� �ϴ� NumberFormatException �߻�
		second(); // second() �޼ҵ� ȣ��
	}

	static void second() throws ArithmeticException {
		third(); // third() �޼ҵ� ȣ��
	}

	static void third() throws ArithmeticException {
		int i = 1, j = 0;
		System.out.println(i / j);
	}

}
