package execute02;

import dao.BoardDao;

public class B03_MainDelete {
	public static void main(String[] args) {		
		System.out.println( "게시물 정보 삭제하기");
		BoardDao dao = new BoardDao();
		int no = 7 ;
		int result = -1 ;
		result = dao.DeleteData(no) ;
		if (result == 1) {
			System.out.println(no + " 게시물 정보가 삭제됨"); 
		}else if(result == -1) {
			System.out.println(no + " 게시물 정보 삭제 실패");
		}else {
			System.out.println("삭제 내역 없슴");
		}
	}
}