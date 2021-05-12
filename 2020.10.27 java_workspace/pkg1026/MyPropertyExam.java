package pkg1026;

import java.util.Enumeration;
import java.util.Properties;

public class MyPropertyExam {

	public static void main(String[] args) {
		Properties prop = new Properties();

		// properties 는 map 이며 기본적으로 : String으로 되어있음
		prop.put("id", "hong");
		prop.put("name", "홍길동");
		prop.put("password", "1234");
		prop.put("address", "마포구 공덕동");
		prop.put("zipcode", "123-456");

		System.out.println("프로퍼티 수 : " + prop.size());

		String data = prop.getProperty("phone","폰이 없을 때의 기본값"); // get메소드와 동일

		// ★ 널포인트익셉션 체크하기 !! - 오타 , 글자 빠트리고 , 값이 null일때 등등
		if (data == null) {
			System.out.println("데이터가 null입니다.");
		} else {
			// prop.getProperty("phone","폰이 없을 때의 기본값") -> data.toString() -> 폰이 없을 때의 기본값 
			System.out.println(data.toString());
		}

		// 문제) hphone이 없으면 값을 추가하세요.
		if (prop.getProperty("hphone") == null) {
			prop.put("hphone", "01012345678");
		}

		System.out.println("toString 메소드 : \n" + prop.toString());
		System.out.println();

		// System.in : 키보드
		// System.out : 모니터
		prop.list(System.out);

		System.out.println();
		System.out.println("프로퍼티 출력하기");

		Enumeration<Object> enu = prop.keys();
		// keys 는 모든것을 아울러서 Enum 타입의 Object 클래스로 반환되어야함 

		while (enu.hasMoreElements()) {
			Object property = enu.nextElement();// 승급
			String value = prop.getProperty((String) property); // 강등
			System.out.println(property + "/" + value);

		}

	}

}
