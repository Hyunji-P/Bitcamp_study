package pkg0929;
//a�̻� b�̸��� ������ ����(���� ��) �����ϱ� (��, a�� b�� ����) 

//random(���Ѱ�, ���Ѱ�) �޼ҵ带 �̿��Ͽ� 5�̻� 9�̸��� ������ ������ 10���� ����� ������.

public class MethodRandom {

	public static void main(String[] args) {
//		for (int i = 1; i < 101; i++) {
//			System.out.println(Math.random());
//		}

		int low = 5; // ���Ѱ�
		int high = 9; // ���Ѱ�
		for (int i = 0; i < 11; i++) {
			int imsi = random(low, high);
			System.out.println(imsi);
		}//for���� random�޼ҵ� ������ �־ ������ ��ȯŸ���� void ������ 
		 //why ? �޼ҵ� ��ü ������ �ݺ������� ����� �Ǿ���ϱ� ������ 

	}

	static int random(int low, int high) {
		int result = (int) ((high - low) * Math.random() + low);
		return result;
	}

}
