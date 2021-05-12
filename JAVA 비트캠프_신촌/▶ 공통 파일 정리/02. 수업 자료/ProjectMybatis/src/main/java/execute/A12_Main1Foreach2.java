package execute;

import java.util.List;

import bean.Member;
import dao.MemberDao;

public class A12_Main1Foreach2 {
	public static void main(String[] args) {		
		System.out.println( "forEach list 컬렉션" );
		MemberDao dao = new MemberDao();			
		
		List<Member> lists = dao.Foreach2(  ) ;
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