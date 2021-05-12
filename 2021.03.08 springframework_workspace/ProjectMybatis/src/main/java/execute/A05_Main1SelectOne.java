package execute;

import java.util.Scanner;

import bean.Member;
import dao.MemberDao;

public class A05_Main1SelectOne {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		Scanner scan = new Scanner(System.in);
		System.out.println("한 사람 조회하기");
		System.out.print("아이디 입력 : ");

		String id = scan.next();
		Member member = dao.GetMemberByPk(id);

		if (member == null) {
			System.out.println("존재하지 않는 회원입니다.");
		} else {
			System.out.println("아이디 : " + member.getId());
			System.out.println("이름 : " + member.getName());
			System.out.println("나이 : " + member.getAge());
			System.out.println("성별 : " + member.getGender());
		}

	}

}
