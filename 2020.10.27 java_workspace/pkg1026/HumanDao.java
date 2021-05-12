package pkg1026;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class HumanDao {

	public Hashtable<String, String> List2Table(List<Human> lists) {
		// ����Ʈ �÷����� Hashtable�� �����Ͽ� ��ȯ���ش�.
		// ��ȯŸ������ ��ü ������� --> NullPointerException �� �� ���� ����
		Hashtable<String, String> ht = new Hashtable<String, String>();

		// List ����Ҷ� Ȯ�� for��
		for (Human human : lists) {
			String name = human.getName();
			// ����� ���̴� /�� �������ش�.
			String value = human.getPassword() + "/" + human.getAge();
			ht.put(name, value);
		}

		return ht;
	}

	public void PrintTable(Hashtable<String, String> ht) {
		// �ؽ� ���̺��� ����� �����Ѵ�.
		Enumeration<String> enu = ht.keys();

		while (enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			// ��� ��ȣ�� ���̷� ���еǾ� �ִ� ��Ȳ
			String value = ht.get(name);

			String[] arr = value.split("/");
			String password = arr[0];
			int age = Integer.parseInt(arr[1]);

			String imsi = "�̸� : " + name;
			imsi += ", ��й�ȣ : " + password;
			imsi += ", ���� : " + age;
			System.out.println(imsi);

		}

	}

}
