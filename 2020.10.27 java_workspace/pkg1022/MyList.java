package pkg1022;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		// ex) 방금 게시물 올렸을 때 1페이지에 들어가 있음(순서를 따짐)
		// 기차(량) , 전철은 8량으로 되어있고 앞에서부터 3-2번 등 순서가 있음

		List<Object> lists = new ArrayList<Object>();

		// 순서가 있음
		lists.add("bigbang");// 0번
		lists.add("2ne1");
		lists.add("wonder");// 2번
		lists.add("kara");
		lists.add("2ne1");

		int idx = -1;
		//-1이 없다는 의미로 쓰이고 부정을 나타내므로 초기값을 -1로 준거임 
		//ex) 9999로 해도 됨 
		idx = lists.indexOf("2ne1");// 1)
		System.out.println(idx);

		idx = lists.lastIndexOf("2ne1");// 2)
		System.out.println(idx);

		idx = lists.lastIndexOf("girls");// 3)
		System.out.println(idx);

		lists.add(2, "girls");// 4)

		printFor(lists);// 5)

		lists.set(5, "2am");// 6)

		lists.remove("wonder");// 7)

		PrintGet(lists);// 8)
		
		List<Object> newlist = lists.subList(2, 4);//9)
		System.out.println(newlist);

		System.out.println(lists);
		//11) toString() 메소드 : 목록을 콤마로 연결해서 바깥에 [] 

		// 중복 허락 O
		System.out.println("요소의 갯수 : " + lists.size());
	}

	private static void PrintGet(List<Object> lists) {
		System.out.println("get 메소드를 사용한 출력");
		for (int i = 0; i < lists.size(); i++) {
//			Object item = lists.get(i);
			String item = (String) lists.get(i);
			System.out.println(item);

		}

	}

	// printFor(lists) 메소드를 호출해서 lists가 abcd로 들어감
	private static void printFor(List<Object> abcd) {// 5)
		System.out.println("확장 for를 이용한 출력");
		// <> 안이 타입
		for (Object item : abcd) {
			System.out.println(item);
		}

	}

}
