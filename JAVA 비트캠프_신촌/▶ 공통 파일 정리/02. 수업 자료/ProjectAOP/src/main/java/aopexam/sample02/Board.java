package aopexam.sample02;

public class Board {

	public void board() {
		// 로그인 수행, 게시물 등록, DB에 저장, 로그 아웃
		String msg = "게시물 등록" ;		
		
		Login.login(msg) ;
		System.out.println( msg + "하기" ); // 핵심 기능
		DataBase.save(msg);
		Logout.logout(msg) ; 
	}
}