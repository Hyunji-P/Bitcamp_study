package execute_test;

import bean.Board;
import dao.BoardDao;

public class B01_MainInsert {

	public static void main(String[] args) {
		System.out.println("게시물 1건을 등록합니다.");
		int cnt = -1;
		BoardDao bdao = new BoardDao();

		cnt = bdao.InsertData(new Board(7, "비트캠프", "sun", "지금은 수업중", java.sql.Date.valueOf("2021-01-26"), 26));
		if (cnt == 1) {
			System.out.println("게시물 테이블 추가 완료");
		} else if (cnt == 0) {
			System.out.println("게시물 테이블 추가 없음");
		} else {
			System.out.println("게시물 테이블 추가 실패");
		}
	}

}
