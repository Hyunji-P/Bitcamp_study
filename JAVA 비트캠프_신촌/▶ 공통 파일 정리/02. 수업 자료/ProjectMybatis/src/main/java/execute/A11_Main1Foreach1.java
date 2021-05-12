package execute;

import java.util.List;

import bean.Member;
import dao.MemberDao;

public class A11_Main1Foreach1 {
	public static void main(String[] args) {		
		System.out.println( "동적 sql forEach 구문을 사용하여 배열에 명시된 사람들만 조회해 봅니다." );
		MemberDao dao = new MemberDao();			
		
		List<Member> lists = dao.Foreach1(  ) ;
		//System.out.println( "조회된 건수 : " + lists.size() );
		for(Member member : lists){
			String imsi = 
					member.getName() + "\t" +
					member.getAge() + "\t" + 
					member.getGender()  ; 
			
			System.out.println( imsi );		
		}		
	}
}