package pkg1020;

public class MyCustomString {
	private String sometext;

	public MyCustomString(String sometext) {
		this.sometext = sometext;
	}

	// ①
	public String mysubstring(int first, int last) {
		this.sometext = "abcdeefghaa";//→ sometext 변수를 지정했는데 왜 안나오는지 모르겠음
		String result = this.sometext.substring(first - 1, last);

		return result;
	}

	// ②
	public int mycount(String str) {
		int count = 0; // 카운터 변수
		int len = str.length(); // 찾고자 하는 문자열의 길이
		int idx = 0; // 몇번째인지를 나타내는 변수

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

	// ③
	public String myreverse(int first, int last) {
		StringBuffer result = new StringBuffer(this.mysubstring(first, last));
		result = result.reverse();
		return String.valueOf(result);
	}

}
