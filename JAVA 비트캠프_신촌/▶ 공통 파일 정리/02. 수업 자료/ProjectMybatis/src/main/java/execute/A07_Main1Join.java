package execute;

import java.util.List;

import bean.Board;
import bean.Member;
import dao.MemberDao;

public class A07_Main1Join {
	public static void main(String[] args) {
		System.out.println("조인 구문을 실행합니다.");
		MemberDao dao = new MemberDao();
		List<Member> lists = dao.GetJoinList();
	
		System.out.println("이름\t나이\t성별\t제목\t내용\t작성일자\t조회수");
		
		String imsi = "";
		String temp = "";
		
		for(Member mem : lists) {
			imsi = "" ;
			imsi += mem.getName() + "\t" ;
			imsi += mem.getAge() + "\t" ;
			imsi += mem.getGender() + "\t" ;

			List<Board> blist = mem.getBoardBeans() ;
			temp = "" ;			
			for(Board board : blist) {
				temp += board.getTitle() + "\t" ;
				temp += board.getContent() + "\t" ;
				temp += board.getRegdate() + "\t" ;
				temp += board.getHitcount() + "\t" ;
				
				System.out.println( imsi + temp );
				temp = "" ;	
			}
		}
	}
}