package execute02;

import bean.Board;
import dao.BoardDao;

public class B01_MainInsert {
	public static void main(String[] args) {		
		BoardDao dao = new BoardDao();
		System.out.println("게시물 추가하기");
        
		int result = dao.InsertData(
				new Board(0, "홍홍홍", "park", "조아요",  java.sql.Date.valueOf("2021-01-26"), 123)) ;
		
		if (result == 1) {
			System.out.println("게시물이 추가되었습니다.");
		}
	}
}