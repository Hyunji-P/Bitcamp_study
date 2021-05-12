package execute_test;

import java.util.List;

import bean.Board;
import dao.BoardDao;

public class B04_MainSelectAll {

	public static void main(String[] args) {
		System.out.println("게시물 목록 조회");

		BoardDao dao = new BoardDao();
		List<Board> lists = dao.SelectAllData();

		String top = "글번호\t글제목\t작성자\t글내용\t작성일자\t\t조회수";
		System.out.println(top);

		for (Board board : lists) {
			String imsi = "";
			imsi += board.getNo() + "\t";
			imsi += board.getTitle() + "\t";
			imsi += board.getWriter() + "\t";
			imsi += board.getContent() + "\t";
			imsi += board.getRegdate() + "\t";
			imsi += board.getHitcount() + "\t";

			System.out.println(imsi);
		}

	}

}
