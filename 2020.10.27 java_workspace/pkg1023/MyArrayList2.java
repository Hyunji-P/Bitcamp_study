package pkg1023;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList2 {

	//���� database
	public static void main(String[] args) {
		Person soo = new Person("��ö��", 30, 40, 50);
		Person hee = new Person("�ڿ���", 70, 80, 90);

		// �Ѹ� �ѱ�°� �ƴ� �ٱ��Ͽ� ��Ƽ� �Ѳ����� �ѱ��.
		List<Person> lists = new ArrayList<Person>();

		lists.add(soo);
		lists.add(hee);
		// 1ȸ�� ���
		lists.add(new Person("ȫ�浿", 40, 50, 60));

		// �� ����� html ������ �Ѱܼ� �����ְڴ�.(�����ڷ� �ѱ�)
		PersonHtml html = new PersonHtml(lists);
		html.SelectAll();
	}

}
