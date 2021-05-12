package aopexam.sample01;

public class Board {
	String msg = "게시물 등록";
	
	public void board() {
		System.out.println(msg + "을 위한 로그인을 수행합니다.");
		System.out.println(msg + "하기");
		System.out.println(msg + " 내역을 데이터 베이스에 저장합니다.");
		System.out.println(msg + "을 위한 로그아웃을 수행합니다.");
		
	}

}
