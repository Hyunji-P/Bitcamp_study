package execute_test;

import java.util.Scanner;

import bean.Board;
import dao.BoardDao;

public class B05_MainSelectOne {

	public static void main(String[] args) {
		System.out.println("특정 게시물 1건 조회하기");

		Scanner scan = new Scanner(System.in);
		System.out.println("조회할 게시물 번호를 입력하세요.");
		System.out.print("입력 : ");

		int num = scan.nextInt();

		BoardDao dao = new BoardDao();
		Board bean = dao.SelectOneData(num);
		if (bean != null) {
			String top = "글번호\t글제목\t작성자\t글내용\t작성일자\t\t조회수";
			System.out.println(top);

			String imsi = "";
			imsi += bean.getNo() + "\t";
			imsi += bean.getTitle() + "\t";
			imsi += bean.getWriter() + "\t";
			imsi += bean.getContent() + "\t";
			imsi += bean.getRegdate() + "\t";
			imsi += bean.getHitcount() + "\t";

			System.out.println(imsi);
		}else {
			System.out.println("존재하지 않은 게시물 번호 입니다.");
		}

	}
}
