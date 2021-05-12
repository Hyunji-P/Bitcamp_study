package execute_test;

import java.util.HashMap;
import java.util.List;

import dao.MemberDao;

public class B06_MainJoinTest {
// id , name , title , content 컬럼만 조회
	public static void main(String[] args) {
		System.out.println("회원과 게시물 조인하기");

		MemberDao dao = new MemberDao();
		List<HashMap<String, String>> maplists = dao.SelectJoinList();

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
