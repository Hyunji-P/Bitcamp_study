package pkg1020;

public class GetName2 {
//Ǯ�� ����
//ī��Ʈ ����(cnt)�� �����ϰ� �ʱ�ȭ�Ѵ�.
//ã���� �ϴ� �ܾ �߰ߵ� ��ġ(idx) ������ �����ϰ� �ʱ�ȭ �Ѵ�.
//ã���� �ϴ� �ܾ��� ���̿� ���� ������ �����ϰ� �ʱ�ȭ �Ѵ�.
//���� ���� while �ݺ����� ����Ͽ� ã�� �ܾ� �˻��� �Ѵ�.(indexOf()�޼ҵ�)
//�߰��� �Ǿ��ٸ� ī��Ʈ ������ 1 ���� �ش�.
//	�߰ߵ� ���ڿ��� �߶� ���� ������.(subString()�޼ҵ�)
//�߰��� �ȵǾ��ٸ� break �������� ���� ������.

	public static void main(String[] args) {
		final String what = "��ȣ��";

		String str = "��ȣ����ȣ�����缮��ö����ȣ��";
		System.out.println("���ڿ� ���� : " + str);

		int cnt = 0; // ī��Ʈ ����
		int len = what.length();// ã���� �ϴ� ���ڿ� ����
		int idx = 0; // �߰ߵ� ��ġ

		while (true) {
			idx = str.indexOf(what);
//			System.out.println(idx);
			if (idx == -1) {
				System.out.println("�� �̻� �������� �ʽ��ϴ�.");
				break;
			} else {
				//idx + len 
				//1. "��ȣ����ȣ�����缮��ö����ȣ��" ---> ��ȣ���� 0��°���� ���� , idx = 0;
				//2. index �� 3��° ���� �ٽ� ���ڿ������� �ؾ���(�� , 0���� 2��°�� ����)
				//3. idx + len = 0 + 3; (ex, �ȳ�ȳ��̸� 0 + 4(len)������ ����)
				//4. ���� substring�޼ҵ带 �̿��Ͽ� ���� ���� 
				str = str.substring(idx + len);
				System.out.println(str);
				cnt++;
				
				
			}

		}
		System.out.println("���ڿ� \'" + what + "\'�� " + cnt + "�� �߰� �Ǿ����ϴ�.");

	}

}
