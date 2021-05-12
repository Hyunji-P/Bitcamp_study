package execute;

import java.util.List;
import java.util.Scanner;

import bean.Member;
import dao.MemberDao;

public class A09_Main1IfCondition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println( "동적 sql 실행하기" );
		System.out.println( "if 구문을 이용하여 회원 목록을 조회합니다." );
		MemberDao dao = new MemberDao();	
		String name = null ;
		
		System.out.println("전체 조회(1), 홍길동만 조회(2) 숫자를 입력하세요. ");
		int menu = scan.nextInt() ;
		if (menu == 1) {
			name = null ;
		} else if (menu == 2) {
			name = "홍길동" ; //이름이 널이 아닌 경우
		} else {
			name = null ;
		}
		List<Member> lists = dao.IfCondition(name) ;
		
		System.out.println("이름\t나이\t성별");
		for(Member member : lists){
			String imsi = 
					member.getName() + "\t" +
					member.getAge() + "\t" + 
					member.getGender()  ; 
			
			System.out.println( imsi );		
		} 
		scan.close(); 
	}
}