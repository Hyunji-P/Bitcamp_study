package pkg1019;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("SEOUL");
		String str2 = new String("korea");

		String stemp;
		stemp = str1.toLowerCase() + " " + str2.toUpperCase();
		System.out.println(stemp);

		// 문자열 뒤집기 ② reverse() 메소드
		StringBuffer sb = new StringBuffer(stemp);

		StringBuffer result = sb.reverse();
		System.out.println(result);

		StringBuffer str3 = new StringBuffer("abcd");
		// 문자열 추가하기
		result = str3.insert(2, "xx");
		System.out.println(result);

		// 문자열 삭제하기
		result = result.delete(3, 5);
		System.out.println(result);

		// 문자열 뒤집기
		result = result.reverse();
		System.out.println(result);

		String str4 = "대한민국";
		String str5 = " 화이팅";

		// 문자열 결합
		String temp = str4.concat(str5);
		System.out.println(temp);

		String files = "a.XLS/b.ppt/c.doc/d.xls";

		// split : 문자열 쪼개기 ---> 4묶음으로 되어있으므로 당연히 배열
		String[] filename = files.split("/");

		// startswith : ~로 시작하는가? , endsWith : ~로 끝나는가?
		System.out.println("a.xls".endsWith(".xls"));
		System.out.println("b.ppt".endsWith(".xls"));

		for (int i = 0; i < filename.length; i++) {
			if (filename[i].toLowerCase().endsWith(".xls")) {
				//~로 끝나는 것을 실행하기전에 대문자는 소문자로 변경 
				//.(dot 연산자)를 두번 사용 하였으며, "메소드 체이닝"이라고 함
				System.out.println(filename[i]);

			}

		}

	}

}
