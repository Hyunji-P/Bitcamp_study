package execute02;

import java.util.Scanner;

import bean.Board;
import dao.BoardDao;

public class B05_MainSelectOne {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("한건 조회하기.");
		System.out.print("글 번호 입력 : ");
		
		int no = scan.nextInt();
		Board bean = dao.GetDataByPk(no);
		
		if( bean == null ){
			System.out.println("존재하지 않는 게시물입니다.");
		}else{
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