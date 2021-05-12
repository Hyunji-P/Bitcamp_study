package pkg1023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>(); // 승급

		map.put(1, "삼성");
		map.put(2, "롯데");
		map.put(3, "sk");
		map.put(4, "기아");

		System.out.println(map.containsKey(5));
		System.out.println(map.containsValue("넥센"));

		// 문제) 5위인 넥센이 있는지 파악하고 , 없으면 추가하도록 하세요.
		if (!map.containsKey(5)) {
			map.put(5, "넥센");
		}

		// map에서 toString --> {} 와 , = 로 구분
		System.out.println(map);

		System.out.println(map.get(2));
		
		map.remove(4);//요소부분삭제 

		System.out.println("요소의 개수 : " + map.size());

		// 키 : x , 값 : y 로 출력해보자
		System.out.println("원소를 출력하기");

		// 위에 Map 과 Set은 연계
		Set<Integer> keylist = map.keySet();

		for (Integer key : keylist) {
			// 들어있는 값 반환
			String value = map.get(key);
			String imsi = "키 : " + key + ", 값 : " + value;
			System.out.println(imsi);
		}
		
		map.clear();//요소 전체삭제
		System.out.println(map);
		
		//be동사로 시작하면 반환타입이 boolean
		if (map.isEmpty()) {
			System.out.println("empty");
		} else {
			System.out.println("not empty");
		}

	}

}
