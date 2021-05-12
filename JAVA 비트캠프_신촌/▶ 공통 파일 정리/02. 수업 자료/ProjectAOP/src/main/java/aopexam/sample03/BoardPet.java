package aopexam.sample03;

public class BoardPet implements Board {
	public void board() {
		//로그인 수행, 게시물 등록, DB에 저장, 로그 아웃
		String msg = "PetShop 게시물을 등록(핵심 기능)합니다. " ;		
		
		System.out.println( msg ); //
	}
}