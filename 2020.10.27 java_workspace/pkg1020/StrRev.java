package pkg1020;

public class StrRev {

	public static void main(String[] args) {
		String str = "korea";

		// ��� 01 : �ݺ��� ����ϱ�
		String imsi = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			imsi += str.charAt(i);
		}

		System.out.println(imsi.toUpperCase());

		// ��� 02 : StringBuffer Ŭ���� ����ϱ�
		str = str.toUpperCase(); // ���� �빮�ڷ� �ٲٱ�

		StringBuffer str01 = new StringBuffer(str);
		System.out.println(str01.reverse());

		// ����) AeRoK
		imsi = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				imsi += str.charAt(i);
			} else {
				//str.charAt(i) : ��ȯŸ���� char �̱� ������ String���� �����ؾ��Ѵ�.
				imsi += String.valueOf(str.charAt(i)).toLowerCase();

			}
		}
		System.out.println(imsi);

	}

}
