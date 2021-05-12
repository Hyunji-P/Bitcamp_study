package aopexam.sample02;

public class Board {

	public void board() {
		String msg = "게시물 등록";

		Login.login(msg);
		System.out.println(msg + "하기");
		DataBase.save(msg);
		Logout.logout(msg);

	}

}
