package pkg1020;

public class MyStringExam {

	public static void main(String[] args) {
		String str = "lastgodfather";
		int apos = str.indexOf("t");
		int dpos = str.lastIndexOf("t");

		String temp = str.substring(apos + 1, dpos);
		System.out.println(temp);

		// 第笼扁 规过 01
		StringBuffer sb = new StringBuffer(temp);
		System.out.println(sb.reverse());

		// 第笼扁 规过 02
		String imsi = "";
		for (int i = temp.length() - 1; i >= 0; i--) {
			imsi += temp.charAt(i);
		}
		System.out.println(imsi);
		System.out.println(imsi.toUpperCase());

	}

}
