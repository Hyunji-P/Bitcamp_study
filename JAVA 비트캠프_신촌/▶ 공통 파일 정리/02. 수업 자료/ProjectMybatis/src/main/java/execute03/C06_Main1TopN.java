package execute03;

import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C06_Main1TopN {
	public static void main(String[] args) {
		System.out.println("TopN 구문을 수행합니다.");
//		final String SEPARATOR = "\t" ;
		AlbumDao dao = new AlbumDao();
		String temp7 = "글번호\t제목\t작성자\t글내용\t작성일자\t조회수" ;
		System.out.println( temp7);
		
		int pageNumber = 2 ;
		int pageSize = 3 ; 
		int offset = ( pageNumber - 1 ) * pageSize ;
		int limit = pageSize ;
		List<Album>  albumlist = dao.SelectTopN(offset, limit ) ;
		//System.out.println( albumlist.size() );
		for(Album alb : albumlist){			
			System.out.println(alb);
		}
	}
}