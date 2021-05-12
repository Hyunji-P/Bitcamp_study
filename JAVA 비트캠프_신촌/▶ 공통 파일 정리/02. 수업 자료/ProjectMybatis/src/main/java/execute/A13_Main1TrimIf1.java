package execute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Board;
import dao.BoardDao;

public class A13_Main1TrimIf1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println( "trim과 if 구문을 이용한 동적 sql 실행하기" );
		BoardDao dao = new BoardDao();
		
		String writer = null ; //작성자
		int hitcount = 0 ; //조회수		
		
		
		final int HITCOUNT = 7 ;
		
		System.out.println("모든 게시물 조회(1)") ;
		System.out.println("홍길동 정보 모두 조회(2), 홍길동 정보 중에서 hitcount >= " + HITCOUNT + " 이상인 것만 조회(3)");
		System.out.println("hitcount >= " + HITCOUNT + " 이상인 것만 조회(4)") ;
		System.out.print("숫자 입력 : ") ;
		int menu = scan.nextInt() ;
		
		Map<String, Object> map = new HashMap<String, Object>(); 
		
		if (menu == 1) {
			//writer와 hitcount 모두 null인 경우
		} else if (menu == 2) {
//			writer = "홍길동" ;
			writer = "hong" ;
			map.put("writer", writer) ;
		} else if (menu == 3) {
//			writer = "홍길동" ;
			writer = "hong" ;
			hitcount = HITCOUNT ;
			map.put("writer", writer) ;
			map.put("hitcount", hitcount) ;
		} else if (menu == 4) {
			hitcount = HITCOUNT ;
			map.put("hitcount", hitcount) ;
		}
		List<Board> lists = dao.TrimIf1( map ) ;		
		
		System.out.println("작성자\t글제목\t조회수");
		for(Board board : lists){
			String imsi = 
					board.getWriter() + "\t" +
					board.getTitle() + "\t" + 
					board.getHitcount() ; 
			
			System.out.println( imsi );		
		} 
		scan.close(); 
	}
}