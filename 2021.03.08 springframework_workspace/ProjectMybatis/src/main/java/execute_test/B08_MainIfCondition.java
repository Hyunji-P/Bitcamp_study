package execute_test;

import java.util.List;
import java.util.Scanner;

import bean.Board;
import bean.Member;
import dao.BoardDao;
import dao.MemberDao;

public class B08_MainIfCondition {
// 숫자가 1이면 홍길동 , 다른 숫자는 전체 게시물 조회
	public static void main(String[] args) {
		System.out.println("동적 sql 사용하기");

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자가 1이면 홍길동 게시물 조회 , 다른 숫자는 전체 게시물을 조회합니다.");
		System.out.print("입력 : ");

		int num = scan.nextInt();

		String name = "";
		if (num == 1) {
			name = "홍길동";
		} else {
			name = null;
		}

		BoardDao dao = new BoardDao();
		Member bean = null;
		MemberDao mdao = new MemberDao();
		List<Board> lists = null;
		if (name != null) {
			bean = mdao.GetMemberByName(name);
			System.out.println(bean.getId());
			lists = dao.SelectByPkId(bean.getId());
		} else {
			lists = dao.SelectAllData();
		}

		String top = "글번호\t글제목\t작성자\t글내용\t작성일자\t\t조회수";
		System.out.println(top);

		for (Board board : lists) {
			String imsi = "";
			imsi += board.getNo() + "\t";
			imsi += board.getTitle() + "\t";
			imsi += board.getWriter() + "\t";
			imsi += board.getContent() + "\t";
			imsi += board.getRegdate() + "\t";
			imsi += board.getHitcount() + "\t";

			System.out.println(imsi);
		}
	}
}
