package execute02;

import java.util.List;
import java.util.Scanner;

import bean.Board;
import dao.BoardDao;

public class B08_MainIfCondition {
	public static void main(String[] args) {		
		BoardDao dao = new BoardDao();	
		String name = null ;

		System.out.println( "if 구문을 사용하여 동적 sql 구문을 만들어 봅니다." );
		System.out.println( "숫자 1이면 홍길동이가 작성한 글만, 다른 숫자는 전체 게시물을 조회합니다." );
		Scanner scan = new Scanner(System.in) ;
		int menu = scan.nextInt() ;
		if (menu == 1) {
			name = "hong" ;
		} else {
			name = null ;
		}
		List<Board> lists = dao.IfCondition2(name) ;
		
		System.out.println("이름\t나이\t성별");
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
		scan.close(); 
	}
}