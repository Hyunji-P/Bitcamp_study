package pkg1021;

public class SoshiMain {

	public static void main(String[] args) {
		String[] soshi = { "����", "ȿ��", "����" };
		String name = "��ö��";

		// false �̸� �ҽ� ����� �ƴ϶�� ����
		boolean isMember = false; // flag ����(�´��� �ƴ��� �Ǵ��ϴ� ����)

		try {
			for (int i = 0; i < soshi.length; i++) {
				if (soshi[i].equals(name)) {
					isMember = true;
					break; // ���� ã���� �ڿ� �迭�� ���� �ʿ� ����
				}
			}
			if (isMember == true) {
				System.out.println(name + "�� �ҳ�ô� ����� �¾ƿ�.");
			} else {// �ҽø���� �ƴϸ� ����� ���� ���ܹ߻�,throw �� �ѱ���� ��
				String message = name + "�� �ҳ�ô� ����� �ƴϿ���";

				// 1ȸ�� ��ü�� ���� throw�� �Ѱ� �ش�
				throw new GirlsException(message);
				// new GirlsException(message) - 1��(��ü�� �ȸ���� �ٷ� ������ ȣ��)
				// throw new GirlsException(message) - 2��(���� ������)
				// catch���� �̵� - 3��(��ǻ�� �߻�)
			}

		} catch (GirlsException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			System.out.println();
			ex.printStackTrace();//�޼ҵ� ���ο��� toString() ȣ��

		}

	}

}
