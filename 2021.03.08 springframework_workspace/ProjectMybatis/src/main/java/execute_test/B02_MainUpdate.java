package execute_test;

import bean.Board;
import dao.BoardDao;

public class B02_MainUpdate {

	public static void main(String[] args) {
		System.out.println("특정 게시물 정보 수정");
		
		int cnt = -1;
		BoardDao dao = new BoardDao();
		cnt = dao.UpdateData(new Board(6, "4시!!", "hong", "4시1분!!", java.sql.Date.valueOf("2021-01-26"), 4));
		
		if (cnt == 1) {
			System.out.println("게시물 테이블 수정 완료");
		} else if (cnt == 0) {
			System.out.println("게시물 테이블 수정 없음");
		} else {
			System.out.println("게시물 테이블 수정 실패");
		}
	}

}
