package execute;

import java.util.List;

import bean.Member;
import dao.MemberDao;

public class A11_Main1Foreach1 {

	public static void main(String[] args) {
		System.out.println("for each 구문(배열에 명시된 사람과 조회하기)");
		MemberDao dao = new MemberDao();
		
		List<Member> lists = dao.ForEach1();
		
		for(Member bean : lists) {
			String imsi = "";
			imsi += bean.getName() + "\t";
			imsi += bean.getAge() + "\t";
			imsi += bean.getGender() + "\t";
			
			System.out.println(imsi);
		}
	}

}
