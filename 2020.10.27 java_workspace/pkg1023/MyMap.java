package pkg1023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>(); // �±�

		map.put(1, "�Ｚ");
		map.put(2, "�Ե�");
		map.put(3, "sk");
		map.put(4, "���");

		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("�ؼ�"));

		// ����) 5���� �ؼ��� �ִ��� �ľ��ϰ� , ������ �߰��ϵ��� �ϼ���.
		if (!map.containsKey(5)) {
			map.put(5, "�ؼ�");
		}

		// map���� toString --> {} �� , = �� ����
		System.out.println(map);

		System.out.println(map.get(2));
		
		map.remove(4);//��Һκл��� 

		System.out.println("����� ���� : " + map.size());

		// Ű : x , �� : y �� ����غ���
		System.out.println("���Ҹ� ����ϱ�");

		// ���� Map �� Set�� ����
		Set<Integer> keylist = map.keySet();

		for (Integer key : keylist) {
			// ����ִ� �� ��ȯ
			String value = map.get(key);
			String imsi = "Ű : " + key + ", �� : " + value;
			System.out.println(imsi);
		}
		
		map.clear();//��� ��ü����
		System.out.println(map);
		
		//be����� �����ϸ� ��ȯŸ���� boolean
		if (map.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println("not empty");
		}

	}

}
