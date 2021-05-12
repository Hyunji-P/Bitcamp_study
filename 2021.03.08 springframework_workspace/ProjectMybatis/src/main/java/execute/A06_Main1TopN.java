package execute;

import java.util.List;

import bean.Board;
import dao.BoardDao;

public class A06_Main1TopN {

	public static void main(String[] args) {
		System.out.println("TopN 구문을 수행한다.");
		BoardDao dao = new BoardDao();

		int pageNumber = 2; // 페이징 하단부 갯수 
		int pageSize = 3; // 한 페이지에 보여줄 갯수 

		int offset = (pageNumber - 1) * pageSize;// 3 , 건너 뛸 갯수
		int limit = pageSize; // 3 , 사용자에게 보여줄 갯수

		List<Board> lists = dao.SelectTopN(offset, limit);

		for (Board board : lists) {
			System.out.println(board.toString());
		}

	}

}
