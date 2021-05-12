package pkg1023;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList2 {

	//실제 database
	public static void main(String[] args) {
		Person soo = new Person("김철수", 30, 40, 50);
		Person hee = new Person("박영희", 70, 80, 90);

		// 한명씩 넘기는게 아닌 바구니에 담아서 한꺼번에 넘긴다.
		List<Person> lists = new ArrayList<Person>();

		lists.add(soo);
		lists.add(hee);
		// 1회용 방법
		lists.add(new Person("홍길동", 40, 50, 60));

		// 이 결과를 html 문서에 넘겨서 보여주겠다.(생성자로 넘김)
		PersonHtml html = new PersonHtml(lists);
		html.SelectAll();
	}

}
