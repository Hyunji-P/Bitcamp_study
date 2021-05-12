package execute02;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import dao.BoardDao;

public class B07_MainIfJoin {
	public static void main(String[] args) {
		System.out.println("조인 테스와 if 동적 sql 구문의 사용");
		System.out.println("숫자 1이면 \"홍길동\"이가 작성한 글만, 숫자 2이면 \"박영희\"가 작성한 글만, 다른 숫자는 전체 게시물을 조회합니다.");
		
		Scanner scan = new Scanner(System.in) ;
		
		int menu = scan.nextInt() ;
		String imsi ;
		if (menu == 1) {
			imsi = "홍길동" ;
		} else if (menu == 2) {
			imsi = "박영희" ;
		} else {
			imsi = null ;
		}
				
		BoardDao dao = new BoardDao();
		
		List<HashMap<String, Object>> maplists = dao.IfCondition(imsi) ;
		
		System.out.println("이름\t과일명\t단가\t수량\t총판매액");	
		
		for(HashMap<String, Object> map : maplists) {
			// 주의 사항으로 모든 컬럼이 대문자로 설정이 됩니다.
			String id = (String)map.get("ID") ;
			String name = (String)map.get("NAME") ;
			String title = (String)map.get("TITLE") ;
			String content = (String)map.get("CONTENT") ;
			
			String temp = "" ;
			temp += id + "\t" + name + "\t" + title + "\t" + content ;  
			System.out.println(temp); 
		}
	}
}