package pkg1022;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		// ex) ��� �Խù� �÷��� �� 1�������� �� ����(������ ����)
		// ����(��) , ��ö�� 8������ �Ǿ��ְ� �տ������� 3-2�� �� ������ ����

		List<Object> lists = new ArrayList<Object>();

		// ������ ����
		lists.add("bigbang");// 0��
		lists.add("2ne1");
		lists.add("wonder");// 2��
		lists.add("kara");
		lists.add("2ne1");

		int idx = -1;
		//-1�� ���ٴ� �ǹ̷� ���̰� ������ ��Ÿ���Ƿ� �ʱⰪ�� -1�� �ذ��� 
		//ex) 9999�� �ص� �� 
		idx = lists.indexOf("2ne1");// 1)
		System.out.println(idx);

		idx = lists.lastIndexOf("2ne1");// 2)
		System.out.println(idx);

		idx = lists.lastIndexOf("girls");// 3)
		System.out.println(idx);

		lists.add(2, "girls");// 4)

		printFor(lists);// 5)

		lists.set(5, "2am");// 6)

		lists.remove("wonder");// 7)

		PrintGet(lists);// 8)
		
		List<Object> newlist = lists.subList(2, 4);//9)
		System.out.println(newlist);

		System.out.println(lists);
		//11) toString() �޼ҵ� : ����� �޸��� �����ؼ� �ٱ��� [] 

		// �ߺ� ��� O
		System.out.println("����� ���� : " + lists.size());
	}

	private static void PrintGet(List<Object> lists) {
		System.out.println("get �޼ҵ带 ����� ���");
		for (int i = 0; i < lists.size(); i++) {
//			Object item = lists.get(i);
			String item = (String) lists.get(i);
			System.out.println(item);

		}

	}

	// printFor(lists) �޼ҵ带 ȣ���ؼ� lists�� abcd�� ��
	private static void printFor(List<Object> abcd) {// 5)
		System.out.println("Ȯ�� for�� �̿��� ���");
		// <> ���� Ÿ��
		for (Object item : abcd) {
			System.out.println(item);
		}

	}

}
