package pkg1026;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class List2TableEx {

	public static void main(String[] args) {
		Human kim = new Human("������", "1234", 10);
		Human lee = new Human("�̼���", "5678", 20);

		List<Human> lists = new ArrayList<Human>();

		lists.add(kim);
		lists.add(lee);
		lists.add(new Human("�����", "3456", 30));

		HumanDao dao = new HumanDao();

		// List2Table = list �� table�� �ٲ��(���ڸ� ����� �ΰ�)
		Hashtable<String, String> ht = dao.List2Table(lists);

		if (ht != null) {
			// Hashtable�� map!
			System.out.println(ht.toString());
		} else {
			System.out.println("�� ������ �Դϴ�");
		}

		dao.PrintTable(ht);

//���� ���� 		
// 		System.out.println(ht.toString());

//		Exception in thread "main" java.lang.NullPointerException
//		at pkg1026.List2TableEx.main(List2TableEx.java:24)

// 1. dao.List2Table(lists) : �޼ҵ� ȣ�� 
// 2. return null : ���� �ڷ����� �⺻���� null
// 3. ht ��ü�� �� (ht == null)
// 4. ��� : NullPointerException --> null�̶�� �ǹ̾��� �����Ϳ� �������� ����

	}
}
