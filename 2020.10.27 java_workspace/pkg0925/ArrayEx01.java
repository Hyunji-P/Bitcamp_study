package pkg0925;

public class ArrayEx01 {
	// �迭
	public static void main(String[] args) {
		// �����ϴ� ����/ �� �׷��� ������� �����ϰ� ����ϴ� ���α׷� �ۼ�
		
		//new ������
		String[] bts = new String[3];

		bts[0] = "����";
		bts[1] = "����";
		bts[2] = "��";

		for (int i = 0; i < bts.length; i++) {
			System.out.println(bts[i]);
		}
		
		//�ʱ�ȭ ���
		String[] bts2 = { "����", "����", "��" };

		for (int i = 0; i < bts2.length; i++) {
			System.out.println(bts2[i]);
		}

	}

}
