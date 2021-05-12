package execute;

import dao.MemberDao;

public class A03_Main1Delete {

	public static void main(String[] args) {
		System.out.println("회원 정보 삭제");
		MemberDao dao = new MemberDao();
		String name = "mija";
		int result = -1;
		result = dao.DeleteData(name);
		if (result == 1) {
			System.out.println(name + " 회원 정보 삭제");
		} else if (result == -1) {
			System.out.println(name + " 회원 정보 삭제 실패");
		} else {
			System.out.println(name + " 삭제 내역 없음");
		}

	}

}
