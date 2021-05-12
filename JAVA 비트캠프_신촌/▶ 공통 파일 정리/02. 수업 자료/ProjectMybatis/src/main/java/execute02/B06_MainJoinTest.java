package execute02;

import java.util.HashMap;
import java.util.List;

import dao.BoardDao;

public class B06_MainJoinTest {
	public static void main(String[] args) {
		System.out.println("조인 테스트하기");
		BoardDao dao = new BoardDao(); 
		String imsi = "이름\t과일명\t단가\t수량\t총판매액" ;
		System.out.println(imsi);
		
		List<HashMap<String, Object>> maplists = dao.JoinTest() ;
		
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