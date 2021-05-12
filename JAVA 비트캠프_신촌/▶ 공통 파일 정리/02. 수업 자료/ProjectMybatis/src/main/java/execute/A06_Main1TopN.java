package execute;

import java.util.List;

import bean.Board;
import dao.BoardDao;

public class A06_Main1TopN {
	public static void main(String[] args) {
		System.out.println("TopN 구문을 수행합니다.");
		final String SEPARATOR = "\t" ;
		BoardDao dao = new BoardDao();
		String temp7 = "글번호\t제목\t작성자\t글내용\t작성일자\t조회수" ;
		System.out.println( temp7);
		
		int pageNumber = 2 ;
		int pageSize = 3 ; 
		int offset = ( pageNumber - 1 ) * pageSize ;
		int limit = pageSize ;
		List<Board>  mblists7 = dao.SelectTopN(offset, limit ) ;
		//System.out.println( mblists7.size() );
		for(Board board7 : mblists7){
			String imsi7 = "" ;
			imsi7 += board7.getNo() + SEPARATOR + board7.getTitle() + SEPARATOR + board7.getWriter() + SEPARATOR ;
			imsi7 += board7.getContent() + SEPARATOR + board7.getRegdate() + SEPARATOR + board7.getHitcount() + SEPARATOR ;
			System.out.println( imsi7 );
		}
	}
}