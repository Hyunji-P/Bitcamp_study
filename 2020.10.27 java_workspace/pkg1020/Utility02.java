package pkg1020;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Utility02 {

//String str = "�ҳ�ô� ��� �����ɽ� exid �ɽ�����" ;
//str ������ StringTokenizer Ŭ������ �̿��Ͽ� ���ڿ��� �����մϴ�.
//�迭 groups�� �����մϴ�.
//���ص� ���ڿ����� �迭 groups�� ���� �����մϴ�.
//�迭 groups�� ���Ͽ� ������ ������ ������ ���ϴ�.
//�� �ܿ� �����ϰ� ���� ������ ������ ������.

	public static void main(String[] args) {
		String str = "�ҳ�ô� ��� �����ɽ� exid �ɽ�����";

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
				song = "���Ʒ�";
				break;
			case 1:
				song = "something";
				break;
			case 2:
				song = "����";
				break;
			case 3:
				song = "�ٽ� ���� ����";
				break;
			case 4:
				song = "tell me";
				break;

			}
			System.out.println(groups[i] + "�� ��ǥ���� \'" + song + "\' �Դϴ�.");

		}

	}

}
