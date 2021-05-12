package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import bean.Board;

public class BoardDao extends SuperDao {
	// namespace 맵퍼를 위한 네임 스페이스 이름	
	static final String namespace = "NsBoard." ; 
	
	public BoardDao(){ }
	
	public List<Board> SelectTopN(int offset, int limit) {
		List<Board> lists = null;
		
		RowBounds rowBounds = new RowBounds(offset, limit);
		
		lists = super.sqlSession.selectList(namespace + "SelectTopN", null, rowBounds);
		super.SessionClose();
		return lists;
	}
	
	public List<Board> TrimIf1(Map<String, Object> map){
		List<Board> lists = null;
		lists = super.sqlSession.selectList(namespace + "TrimIf1", map);
		super.SessionClose();
		return lists;	
	}

	public int InsertData(Board board) {
		int cnt = -1 ;	
		cnt = super.sqlSession.insert(namespace + "InsertData", board);
		super.SessionClose();	
		return cnt;
	}

	public int UpdateData(Board bean) {
		int cnt = -1 ;		
		cnt = super.sqlSession.insert(namespace + "UpdateData", bean);
		super.SessionClose();
		return cnt;
	}
	
	public int DeleteData(int no) {
		int cnt = -1 ;		
		cnt = super.sqlSession.delete(namespace + "DeleteData", no);
		super.SessionClose();		
		return cnt;
	}	
	
	public List<Board> GetDataList(){
		List<Board> lists = null;
		lists = super.sqlSession.selectList(namespace + "GetDataList");
		super.SessionClose();
		return lists;
	}

	public Board GetDataByPk(int no) {
		Board bean = null;			
		bean = (Board)super.sqlSession.selectOne(namespace + "GetDataByPk", no);
		super.SessionClose();			
		return bean;
	}

	public List<HashMap<String, Object>> JoinTest() {
		List<HashMap<String, Object>> maplists = null;		
		maplists = super.sqlSession.selectList(namespace + "JoinTest");
		super.SessionClose();
		return maplists;
	}

	public List<HashMap<String, Object>> IfCondition(String name) {
		Map<String, String> map = new HashMap<String, String>() ;
		map.put("name", name) ;
		
		List<HashMap<String, Object>> lists = null;
		lists = super.sqlSession.selectList(namespace + "IfCondition", map);
		super.SessionClose();
		return lists ;
	}

	public List<Board> IfCondition2(String writer) {
		Map<String, String> map = new HashMap<String, String>() ;
		map.put("writer", writer) ;
		
		List<Board> lists = null;
		lists = super.sqlSession.selectList(namespace + "IfCondition2", map);
		super.SessionClose();
		return lists ;
	}
}
