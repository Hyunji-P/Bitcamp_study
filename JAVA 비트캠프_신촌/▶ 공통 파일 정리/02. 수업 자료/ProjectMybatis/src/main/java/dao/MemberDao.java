package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Member;

public class MemberDao extends SuperDao {
	// 상수 namespace : 맵퍼를 위한 네임 스페이스 이름입니다.
	static final String namespace = "NsMember." ; 
	
	public MemberDao(){ }
	
	public int InsertData(Member member) {
		int cnt = -1 ;		
		//insert 메소드 : 	
		cnt = super.sqlSession.insert(namespace + "InsertData", member);
		super.SessionClose();	
		return cnt;
	}

	public int UpdateData(Member member) {
		int cnt = -1 ;		
		cnt = super.sqlSession.insert(namespace + "UpdateData", member);
		super.SessionClose();
		return cnt;
	}
	
	public int DeleteData(String name) {
		int cnt = -1 ;		
		cnt = super.sqlSession.delete(namespace + "DeleteData", name);
		super.SessionClose();		
		return cnt;
	}	
	
	public List<Member> GetMemberList(){
		List<Member> lists = null;
		lists = super.sqlSession.selectList(namespace + "GetMemberList");
		super.SessionClose();
		return lists;
	}	
	
	public Member GetMemberByPk(String id){
		Member member = null;
		//selectOne 메소드 : 하나의 값 객체를 반환한다.			
		member = (Member)super.sqlSession.selectOne(namespace + "GetMemberByPk", id);
		super.SessionClose();			
		return member;
	}	
	
	public List<Member> GetJoinList() {
		List<Member> lists = null;
		lists = super.sqlSession.selectList(namespace + "GetJoinList");
		super.SessionClose();
		return lists;
	}	
	
	public List<HashMap<String, Object>> JoinGet3Way() {
		List<HashMap<String, Object>> maplists = null;
		
		maplists = super.sqlSession.selectList(namespace + "JoinGet3Way");
		super.SessionClose();
		return maplists;		
	}
	
	public List<Member> IfCondition(String name) {//동적 sql if 사용
		Map<String, String> map = new HashMap<String, String>() ;
		map.put("name", name) ;
		List<Member> lists = null;
		lists = super.sqlSession.selectList(namespace + "IfCondition", map);
		super.SessionClose();
		return lists ;
	}	
	
	public List<Member> Foreach1() {//배열을 이용한 예시
		String[] item = {"홍길동", "김철수", "심형래" };
		
		List<Member> lists = null;
		lists = super.sqlSession.selectList(namespace + "Foreach1", item);
		super.SessionClose();
		return lists;
	}	
	
	public List<Member> Foreach2() {
		List<String> somelists = new ArrayList<String>() ;
		somelists.add("박영희") ;
		somelists.add("강감찬") ;
		
		List<Member> lists = null;
		lists = super.sqlSession.selectList(namespace + "Foreach2", somelists);
		super.SessionClose();
		return lists;		
	}	
	
	
}