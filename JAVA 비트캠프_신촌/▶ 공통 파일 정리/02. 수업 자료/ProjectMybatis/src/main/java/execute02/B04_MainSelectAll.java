package execute02;

import java.util.List;

import bean.Board;
import dao.BoardDao;

public class B04_MainSelectAll {
	public static void main(String[] args) {
		System.out.println("모든 게시물을 조회합니다.");
		BoardDao dao = new BoardDao();
		
		List<Board> lists = dao.GetDataList() ;
		System.out.println("글번호\t제목\t작성자\t글내용\t작성 일자\t조회수");
		for(Board bean : lists){
			String imsi = 
					bean.getNo() + "\t" +
					bean.getTitle() + "\t" +
					bean.getWriter() + "\t" + 
					bean.getContent() + "\t" +
					bean.getRegdate() + "\t" +
					bean.getHitcount()  ; 			
			
			System.out.println( imsi );		
		}
	}
}