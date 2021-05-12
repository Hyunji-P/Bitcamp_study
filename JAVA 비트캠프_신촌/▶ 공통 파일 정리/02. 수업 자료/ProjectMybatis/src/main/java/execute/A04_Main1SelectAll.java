package execute;

import java.util.List;

import bean.Member;
import dao.MemberDao;

public class A04_Main1SelectAll {
	public static void main(String[] args) {
		System.out.println("모든 회원을 조회합니다.");
		MemberDao dao = new MemberDao();
		
		List<Member> lists = dao.GetMemberList() ;
		System.out.println("아이디\t이름\t나이\t성별");
		for(Member member : lists){
			String imsi = 
					member.getId() + "\t" +
					member.getName() + "\t" +
					member.getAge() + "\t" + 
					member.getGender()  ; 
			
			System.out.println( imsi );		
		}
	}
}