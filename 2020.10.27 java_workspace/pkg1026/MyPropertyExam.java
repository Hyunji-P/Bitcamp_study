package pkg1026;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {

	public static void main(String[] args) {
		Properties prop = new Properties();

		// properties �� map �̸� �⺻������ : String���� �Ǿ�����
		prop.put("id", "hong");
		prop.put("name", "ȫ�浿");
		prop.put("password", "1234");
		prop.put("address", "������ ������");
		prop.put("zipcode", "123-456");

		System.out.println("������Ƽ �� : " + prop.size());

		String data = prop.getProperty("phone","���� ���� ���� �⺻��"); // get�޼ҵ�� ����

		// �� ������Ʈ�ͼ��� üũ�ϱ� !! - ��Ÿ , ���� ��Ʈ���� , ���� null�϶� ���
		if (data == null) {
			System.out.println("�����Ͱ� null�Դϴ�.");
		} else {
			// prop.getProperty("phone","���� ���� ���� �⺻��") -> data.toString() -> ���� ���� ���� �⺻�� 
			System.out.println(data.toString());
		}

		// ����) hphone�� ������ ���� �߰��ϼ���.
		if (prop.getProperty("hphone") == null) {
			prop.put("hphone", "01012345678");
		}

		System.out.println("toString �޼ҵ� : \n" + prop.toString());
		System.out.println();

		// System.in : Ű����
		// System.out : �����
		prop.list(System.out);

		System.out.println();
		System.out.println("������Ƽ ����ϱ�");

		Enumeration<Object> enu = prop.keys();
		// keys �� ������ �ƿ﷯�� Enum Ÿ���� Object Ŭ������ ��ȯ�Ǿ���� 

		while (enu.hasMoreElements()) {
			Object property = enu.nextElement();// �±�
			String value = prop.getProperty((String) property); // ����
			System.out.println(property + "/" + value);

		}

	}

}
