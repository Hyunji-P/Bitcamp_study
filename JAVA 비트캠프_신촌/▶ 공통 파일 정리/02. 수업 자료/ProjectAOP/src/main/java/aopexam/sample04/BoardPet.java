package aopexam.sample04;

import org.springframework.stereotype.Component;

@Component(value="myboard") 
public class BoardPet implements Board {
	public void board() {
		String msg = "PetShop 게시물을 등록(핵심 기능)합니다. " ;	
		System.out.println( msg ); //	
	}
}