package pkg1019;

public class StringTest {

	public static void main(String[] args) {
		String str1 = new String("SEOUL");
		String str2 = new String("korea");

		String stemp;
		stemp = str1.toLowerCase() + " " + str2.toUpperCase();
		System.out.println(stemp);

		// ���ڿ� ������ �� reverse() �޼ҵ�
		StringBuffer sb = new StringBuffer(stemp);

		StringBuffer result = sb.reverse();
		System.out.println(result);

		StringBuffer str3 = new StringBuffer("abcd");
		// ���ڿ� �߰��ϱ�
		result = str3.insert(2, "xx");
		System.out.println(result);

		// ���ڿ� �����ϱ�
		result = result.delete(3, 5);
		System.out.println(result);

		// ���ڿ� ������
		result = result.reverse();
		System.out.println(result);

		String str4 = "���ѹα�";
		String str5 = " ȭ����";

		// ���ڿ� ����
		String temp = str4.concat(str5);
		System.out.println(temp);

		String files = "a.XLS/b.ppt/c.doc/d.xls";

		// split : ���ڿ� �ɰ��� ---> 4�������� �Ǿ������Ƿ� �翬�� �迭
		String[] filename = files.split("/");

		// startswith : ~�� �����ϴ°�? , endsWith : ~�� �����°�?
		System.out.println("a.xls".endsWith(".xls"));
		System.out.println("b.ppt".endsWith(".xls"));

		for (int i = 0; i < filename.length; i++) {
			if (filename[i].toLowerCase().endsWith(".xls")) {
				//~�� ������ ���� �����ϱ����� �빮�ڴ� �ҹ��ڷ� ���� 
				//.(dot ������)�� �ι� ��� �Ͽ�����, "�޼ҵ� ü�̴�"�̶�� ��
				System.out.println(filename[i]);

			}

		}

	}

}
