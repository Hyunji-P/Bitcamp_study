package pkg0929;
//���� ���ϱ� 

//1���� 10������ ������ ���Ͽ� ����ϴ� �޼ҵ� sum �ۼ�
//�� , ���� ��ȯ���� �ʰ� �޼ҵ� ���ο��� ����ϵ��� �Ѵ�.

//hap �޼ҵ� : sum  �޼ҵ�� ������ ������ �����ϰ� ��ȯ���ִ� �޼ҵ� 

public class MethodSum {

	public static void main(String[] args) {
		int su = 10;
		int result = hap(su);//��ȯŸ���� �ֱ� ������ ������ �ʿ���
		System.out.println("��� 01 : " + result);
		sum(su);//��ȯŸ���� ���� ������ ���ʿ� ������ �ʿ� ���� 
		//System.out.println("��� 01 : " + sum(su)); - ��ȯ Ÿ���� ���⶧���� ������ ��
		//										     - ������ ���� ���� ������ ����ؾߵǴ��� ��

	}
    //��ȯŸ�� ���� - void �̱� ������ return���� ����
	static void sum(int x) {
		int result = 0;
		for (int i = 1; i <= x; i++) {
			result += i;

		}
		System.out.println("��� 02 : " + result);//return ���� ���� ������ ��ü ������ ���
	}
    //��ȯŸ�� ����
	static int hap(int x) {
		int result = 0;
		for (int i = 1; i <= x; i++) {
			result += i;

		}
		return result;
	}

}
