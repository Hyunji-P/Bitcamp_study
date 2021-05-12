package execute02;

import bean.Board;
import dao.BoardDao;

public class B02_MainUpdate {
	public static void main(String[] args) {		
		System.out.println("게시물 정보 수정");
		BoardDao dao = new BoardDao();
		
		int result = -1 ; 
		result = dao.UpdateData(
				new Board(7, "가나다", "hong", "시러요",  java.sql.Date.valueOf("2021-12-25"), 789)) ;
		if (result != -1) {
			System.out.println("게시물 정보가 수정되었습니다.");
		}
	}
}