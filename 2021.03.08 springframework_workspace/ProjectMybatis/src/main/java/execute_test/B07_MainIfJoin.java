package execute_test;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import bean.Member;
import dao.MemberDao;

public class B07_MainIfJoin {
	// 숫자 1 : 홍길동
	// 숫자 2 : 박영희
	// 다른 숫자 : 전체 게시물 조회

	public static void main(String[] args) {
		System.out.println("\"B06_MainJoinTest\" 를 if 구문을 사용하여 동적 sql 구문으로 만들기");

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		System.out.println("홍길동(1) , 박휘순(2) , 전체(다른 숫자)");
		System.out.print("입력 : ");

		int num = scan.nextInt();
		String input_name = "";
		if (num == 1) {
			input_name = "홍길동";
		} else if (num == 2) {
			input_name = "박휘순";
		} else {
			input_name = null;
		}

		MemberDao dao = new MemberDao();
		Member bean = null;
		List<HashMap<String, String>> maplists = null;
		if (input_name != null) {
			bean = dao.GetMemberByName(input_name);
			System.out.println("id ===> " + bean.getId());
			maplists = dao.SelectJoinList(bean.getId());
		} else {
			maplists = dao.SelectJoinList();
		}

		System.out.println("아이디\t이름\t글제목\t글내용");
		for (HashMap<String, String> map : maplists) {
			String id = map.get("ID");
			String name = map.get("NAME");
			String title = map.get("TITLE");
			String content = map.get("CONTENT");

			String imsi = "";
			imsi += id + "\t";
			imsi += name + "\t";
			imsi += title + "\t";
			imsi += content + "\t";

			System.out.println(imsi);

		}

	}
}
