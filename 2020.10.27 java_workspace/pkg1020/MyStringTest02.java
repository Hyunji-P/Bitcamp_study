package pkg1020;
//������ ���� ������ String Ŭ������ �����ϴ� ���α׷��� �ۼ��ϼ���.

public class MyStringTest02 {

	public static void main(String[] args) {
		String sometext = "abcdeefghaa";

		MyCustomString mystr = new MyCustomString(sometext);

		// �� ��� ���� : 3��° ���� 5��° ���� �̹Ƿ� ���ڿ�

		String result = mystr.mysubstring(3, 5);
		System.out.println(result); // ���� : cde

		// �� ���ڿ� a�� �?
		int count = mystr.mycount("a");
		System.out.println(count); // ���� : 3

		// ���� ���� : 3��° ���� 5��° ������ ���ڿ��� ������
		String myrev = mystr.myreverse(3, 5);
		System.out.println(myrev); // edc

	}

}
