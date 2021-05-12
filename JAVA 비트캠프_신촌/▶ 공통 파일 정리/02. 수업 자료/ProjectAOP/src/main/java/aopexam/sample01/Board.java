package aopexam.sample01;
public class Board {
	public void board() {
		// 로그인 수행, 게시물 등록, DB에 저장, 로그 아웃
		String msg = "게시물 등록" ;		
		
		System.out.println( msg + "을 위한 로그인을 수행합니다." ); // 공통 기능(Aspect)
		
		System.out.println( msg + " 하기" ); // 핵심 기능
		
		System.out.println( msg + " 을 DB에 저장" ); // 공통 기능(Aspect)
		System.out.println( msg + "을 위한 로그 아웃을 수행합니다." ); // 공통 기능(Aspect)
	}
}