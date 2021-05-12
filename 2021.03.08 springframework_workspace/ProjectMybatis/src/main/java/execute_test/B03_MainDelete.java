package execute_test;

import java.util.Scanner;

import dao.BoardDao;

public class B03_MainDelete {

	public static void main(String[] args) {
		System.out.println("특정 게시물 삭제하기");

		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 게시물 번호를 입력하세요.");
		System.out.print("입력 : ");

		int num = scan.nextInt();
		int cnt = -1;

		BoardDao dao = new BoardDao();
		cnt = dao.DeleteData(num);

		if (cnt >= 1) {
			System.out.println("게시물 테이블 삭제 완료");
		} else if (cnt == 0) {
			System.out.println("게시물 테이블 삭제 없음");
		} else {
			System.out.println("게시물 테이블 삭제 실패");
		}
	}

}
