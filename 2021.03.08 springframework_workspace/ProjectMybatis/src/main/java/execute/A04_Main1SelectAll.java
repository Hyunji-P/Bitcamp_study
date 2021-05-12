package execute;

import java.util.List;

import bean.Member;
import dao.MemberDao;

public class A04_Main1SelectAll {

	public static void main(String[] args) {
		System.out.println("모든 회원을 조회합니다.");
		MemberDao dao = new MemberDao();

		System.out.println("아이디\t이름\t나이\t성별");
		List<Member> lists = dao.GetMemberList();
		for (Member member : lists) {
			String imsi = member.getId() + "\t";
			imsi += member.getName() + "\t";
			imsi += member.getAge() + "\t";
			imsi += member.getGender();
			
			System.out.println(imsi);
		}

	}

}
