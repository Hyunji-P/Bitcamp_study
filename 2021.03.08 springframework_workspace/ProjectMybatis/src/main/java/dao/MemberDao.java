package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Board;
import bean.Member;

public class MemberDao extends SuperDao {
	private final String namespace = "NsMember.";

	public MemberDao() {
		super();
	}

	public int InsertData(Member member) {
		// 회원 추가 관련 메소드
		int cnt = -1;
		cnt = super.sqlSession.insert(this.namespace + "InsertData", member);
		super.SessionClose(); // 작업이 끝난 후에 닫아줌
		return cnt;
	}

	public int UpdateData(Member member) {
		// 회원 정보 수정 관련 메소드
		int cnt = -1;
		cnt = super.sqlSession.update(this.namespace + "UpdateData", member);
		super.SessionClose(); // 작업이 끝난 후에 닫아줌
		return cnt;
	}

	public int DeleteData(String name) {
		// 회원 정보 삭제 관련 메소드
		int cnt = -1;
		cnt = super.sqlSession.delete(this.namespace + "DeleteData", name);
		super.SessionClose(); // 작업이 끝난 후에 닫아줌
		return cnt;
	}

	public List<Member> GetMemberList() {
		// 회원 목록에 관련된 메소드
		List<Member> lists = super.sqlSession.selectList(this.namespace + "GetMemberList");
		super.SessionClose(); // 작업이 끝난 후에 닫아줌
		return lists;
	}

	public Member GetMemberByPk(String id) {
		// 회원 상세 정보 관련 메소드
		Member member = super.sqlSession.selectOne(this.namespace + "GetMemberByPk", id);
		super.SessionClose();
		return member;
	}

	public List<Member> GetJoinList() {
		// 조인 관련 메소드
		List<Member> lists = super.sqlSession.selectList(this.namespace + "GetJoinList");
		super.SessionClose();
		return lists;
	}

	public List<HashMap<String, Object>> JoinGet3Way() {
		// 다중 조인 관련 메소드
		List<HashMap<String, Object>> maplists = null;
		maplists = super.sqlSession.selectList(this.namespace + "JoinGet3Way");
		super.SessionClose();
		return maplists;
	}

	public List<Member> IfCondition(String name) {
		// 동적 sql 관련 메소드
		// name 이 null 일 수도 있기 때문에 먼저 map 구조에 넣어준다.
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", name);

		List<Member> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "IfCondition", map);
		super.SessionClose();
		return lists;
	}

	public List<HashMap<String, String>> SelectJoinList() {
		// 회원과 게시물 조인 _ 실습 문제
		List<HashMap<String, String>> maplists = null;
		maplists = super.sqlSession.selectList(this.namespace + "SelectJoinList");
		super.SessionClose();
		return maplists;
	}

	public Member GetMemberByName(String name) {
		// 입력받은 이름을 가지고 해당하는 아이디를 찾아주는 메소드
		Member member = super.sqlSession.selectOne(this.namespace + "GetMemberByName", name);
		return member;
	}

	public List<HashMap<String, String>> SelectJoinList(String id) {
		// 회원과 게시물 조인 _ 실습 문제 : 아이디에 해당하는 게시물 찾기
		List<HashMap<String, String>> maplists = null;
		maplists = super.sqlSession.selectList(this.namespace + "SelectJoinListById", id);
		super.SessionClose();
		return maplists;
	}

	public List<Member> ForEach1() {
		// for each 구문과 관련된 메소드 (배열)
		String[] item = { "홍길동", "김철수", "심형래" };
		List<Member> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "ForEach1", item);
		super.SessionClose();
		return lists;
	}

	public List<Member> ForEach2() {
		// for each 구문과 관련된 메소드 (List)
		List<String> somelists = new ArrayList<String>();
		somelists.add("홍길동");
		somelists.add("김철수");
		somelists.add("심형래");
		
		List<Member> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "ForEach2", somelists);
		super.SessionClose();

		return lists;

	}

	public List<Member> TrimIfCondition(Map<String, Object> map) {
		// Trim 과 if 구문과 관련된 메소드
		List<Member> lists = this.sqlSession.selectList(this.namespace + "TrimIfCondition", map);
		super.SessionClose();
		return lists;
	}

	public List<HashMap<String, Object>> SelectSQL() {
		// B09 문제 
		List<HashMap<String, Object>> maplists = null;
		maplists = this.sqlSession.selectList(this.namespace + "SelectSQL");
		super.SessionClose();
		return maplists;
	}

}
