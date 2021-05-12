package pkg1020;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Utility02 {

//String str = "소녀시대 빅뱅 원더걸스 exid 걸스데이" ;
//str 변수를 StringTokenizer 클래스를 이용하여 문자열을 분해합니다.
//배열 groups를 정의합니다.
//분해된 문자열들을 배열 groups에 값을 대입합니다.
//배열 groups에 대하여 가나다 순으로 정렬해 봅니다.
//이 외에 구현하고 싶은 내용을 구현해 보세요.

	public static void main(String[] args) {
		String str = "소녀시대 빅뱅 원더걸스 exid 걸스데이";

		StringTokenizer str1 = new StringTokenizer(str);
		String[] groups = new String[str1.countTokens()];

		for (int i = 0; i < groups.length; i++) {
			groups[i] = str1.nextToken();

		}

		Arrays.sort(groups);
		Display(groups);

	}

	private static void Display(String[] groups) {
		String song = "";
		for (int i = 0; i < groups.length; i++) {
			switch (i) {
			case 0:
				song = "위아래";
				break;
			case 1:
				song = "something";
				break;
			case 2:
				song = "뱅뱅뱅";
				break;
			case 3:
				song = "다시 만난 세계";
				break;
			case 4:
				song = "tell me";
				break;

			}
			System.out.println(groups[i] + "의 대표곡은 \'" + song + "\' 입니다.");

		}

	}

}
