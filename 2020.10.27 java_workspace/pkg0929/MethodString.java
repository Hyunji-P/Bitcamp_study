package pkg0929;
//�ٽ� Ǯ��� !!! 

public class MethodString {

	public static void main(String[] args) {
		String str = "gugudan";// ���ڿ� �ε��� 0��°���� ����
		System.out.println(str.length());// ���ڿ� ����
		System.out.println(str.charAt(4));// 4��° ��ġ�� ���ڸ� ��ȯ

		// ��� ���ڿ��� �������� ����Ͻÿ�.
		reverse(str);// nadugug

		// 2��° ��ҿ��� 5��° ��ұ��� �����Ͽ� ������ �������� ���
		reverse(str, 2, 5);// adug

	}

	static void reverse(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);

		}
		System.out.print(result);
		System.out.println();
	}

	static void reverse(String str, int x, int y) {
		String result = "";
		for (int i = y; i >= x; i--) {
			result += str.charAt(i);

		}
		System.out.print(result);

	}

}
