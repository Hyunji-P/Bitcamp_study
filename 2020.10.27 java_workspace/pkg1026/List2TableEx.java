package pkg1026;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class List2TableEx {

	public static void main(String[] args) {
		Human kim = new Human("김유신", "1234", 10);
		Human lee = new Human("이순신", "5678", 20);

		List<Human> lists = new ArrayList<Human>();

		lists.add(kim);
		lists.add(lee);
		lists.add(new Human("흥범도", "3456", 30));

		HumanDao dao = new HumanDao();

		// List2Table = list 를 table로 바꿔라(숫자를 가운데로 두고)
		Hashtable<String, String> ht = dao.List2Table(lists);

		if (ht != null) {
			// Hashtable은 map!
			System.out.println(ht.toString());
		} else {
			System.out.println("널 데이터 입니다");
		}

		dao.PrintTable(ht);

//실행 에러 		
// 		System.out.println(ht.toString());

//		Exception in thread "main" java.lang.NullPointerException
//		at pkg1026.List2TableEx.main(List2TableEx.java:24)

// 1. dao.List2Table(lists) : 메소드 호출 
// 2. return null : 참조 자료형의 기본값은 null
// 3. ht 객체로 들어감 (ht == null)
// 4. 결과 : NullPointerException --> null이라는 의미없는 데이터에 뻘짓하지 마라

	}
}
