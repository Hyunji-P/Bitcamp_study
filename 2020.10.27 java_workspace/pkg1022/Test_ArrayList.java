package pkg1022;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Test_ArrayList {

	public static void main(String[] args) {
		String str = "¼Ò³à½Ã´ë ¿ø´õ°É½º ºò¹ð";
		StringTokenizer st1 = new StringTokenizer(str);
		String[] arr = new String[st1.countTokens()];

		List<Object> arrList = new ArrayList<Object>();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = st1.nextToken();
			arrList.add(arr[i]);
		}

		PrintFor(arrList);

	}

	private static void PrintFor(List<Object> arrList) {
		for (Object item : arrList) {
			System.out.println(item);
		}

	}

}
