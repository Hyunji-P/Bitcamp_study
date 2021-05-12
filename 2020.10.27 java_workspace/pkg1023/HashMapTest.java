package pkg1023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> maps = new HashMap<String, String>();

		maps.put("name", new String("홍길동"));
		maps.put("address", "신촌");
		maps.put("phone", "01011112222");
		maps.put("password", "1234");
		
		//id 라는 키가 있는지 검색하고 , 
		//없다면 hong 이라는 값으로 데이터를 입력하세요.
		
		if (!maps.containsKey("id")) {
			maps.put("id", "hong");
		}
		
		System.out.println("모든 요소 프린트 하기");
		Set<String> keys = maps.keySet();
		
		for (String key : keys) {
			String value = maps.get(key);
			String imsi = key + "/" + value;
			System.out.println(imsi);
		}

	}

}
