package aopexam.sample03;

public class BoardPet implements Board{

	@Override
	public void board() {
		String msg = "PetShop 관련 게시물을 작성합니다.";
		System.out.println(msg);
		
	}

}
