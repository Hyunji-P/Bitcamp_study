package pkg1022;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		// ex) ���� --> �����̾�׷��� �ߺ��� ���ڴ� ���� �ʿ䰡 ����
		Set<Object> set = new HashSet<Object>();

		// �±�
		set.add("����ī");// String -> Object
		set.add(123);// int -> Integer -> Object(�ڽ�)
		set.add(false);
		set.add("����ī");

		set.clear();// ��ü ��� ����

		// ������ ����
		set.add("����ī");
		set.add("Ƽ�Ĵ�");
		set.add("����");
		set.add("ȿ��");

		// contains() : �����Ͱ� ���� �� ã�� , �����̳� �ڽ����� ã�� ����
		System.out.println(set.contains("���"));
		System.out.println(set.contains("����"));

		System.out.println(set.remove("Ƽ�Ĵ�"));

		// ����) "����"�� �ִ��� Ȯ���ϰ� , ������ �߰��ϼ���.
		if (!set.contains("����")) {// ! : not
			set.add("����");
		}

		// set.toString() : ���ȣ , �޸��� ����
		System.out.println(set);

		// �ߺ� ��� X
		System.out.println("��� ũ�� : " + set.size());

		//�÷��� Map 
		Set<Integer> aaa = new HashSet<Integer>();

		//���ʿ� ���ڸ� ��´ٰ� ���� 
		//< > �ȿ� �ڵ��ϴ� ����� ���ʸ�(Generic) ����̶�� ��
		//Ư�� Ÿ�Ը� �������� �ٸ�����Ʈ ġ�� ���� 
		//������ ������ �����ϱ� ���� �����
//		aaa.add("������");
		aaa.add(100);
//		aaa.add(12.35);
	}

}
