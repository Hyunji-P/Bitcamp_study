package execute;

import java.util.List;
import java.util.Scanner;

import bean.Member;
import dao.MemberDao;

public class A09_Main1IfCondition {

	public static void main(String[] args) {
		System.out.println("동적 sql 실행하기");
		System.out.println("if 구문을 사용하여 회원 목록을 조회합니다.");

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 1을 입력하면 홍길동만 조회, 다른 숫자는 전체 목록을 조회합니다.");
		int menu = scan.nextInt();

		String name = "";
		if (menu == 1) {
			name = "홍길동";
		} else {
			name = null;
		}

		MemberDao dao = new MemberDao();
		List<Member> lists = dao.IfCondition(name);

		for (Member member : lists) {
			String imsi = member.getName() + "\t";
			imsi += member.getAge() + "\t";
			imsi += member.getGender() + "\t";

			System.out.println(imsi);
		}
	}

}
