package pkg1020;

public class MyCustomString {
	private String sometext;

	public MyCustomString(String sometext) {
		this.sometext = sometext;
	}

	// ��
	public String mysubstring(int first, int last) {
		this.sometext = "abcdeefghaa";//�� sometext ������ �����ߴµ� �� �ȳ������� �𸣰���
		String result = this.sometext.substring(first - 1, last);

		return result;
	}

	// ��
	public int mycount(String str) {
		int count = 0; // ī���� ����
		int len = str.length(); // ã���� �ϴ� ���ڿ��� ����
		int idx = 0; // ���°������ ��Ÿ���� ����

		while (true) {
			idx = sometext.indexOf(str);
			if (idx == -1) {
				break;
			} else {
				sometext = sometext.substring(idx + len);
				count++;
			}
		}
		return count;
	}

	// ��
	public String myreverse(int first, int last) {
		StringBuffer result = new StringBuffer(this.mysubstring(first, last));
		result = result.reverse();
		return String.valueOf(result);
	}

}
