package execute;

import bean.Member;
import dao.MemberDao;
public class A01_Main1Insert {
	public static void main(String[] args) {		
		MemberDao dao = new MemberDao();
		System.out.println("회원 추가하기");
		int result = dao.InsertData( new Member("mija", "이미자", 60, "여자")) ;
		if (result == 1) {
			System.out.println("회원이 추가되었습니다.");
		}
	}
}