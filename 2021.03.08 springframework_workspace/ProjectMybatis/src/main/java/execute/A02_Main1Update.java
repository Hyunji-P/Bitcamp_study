package execute;

import bean.Member;
import dao.MemberDao;

public class A02_Main1Update {

	public static void main(String[] args) {
		System.out.println("회원 정보 수정");
		MemberDao dao = new MemberDao();

		int result = -1;
		result = dao.UpdateData(new Member("park", "박휘순", 100, "여자"));
		if (result != -1) {
			System.out.println("회원 정보가 수정이 되었습니다.");
		}
	}

}
