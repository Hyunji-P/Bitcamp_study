package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import bean.Board;
import bean.Member;

public class BoardDao extends SuperDao {
	private final String namespace = "NsBoard.";

	public BoardDao() {
		super();
	}

	public List<Board> SelectTopN(int offset, int limit) {
		// 페이징 처리를 구현한 게시물 목록
		List<Board> lists = null;

		RowBounds rowBounds = new RowBounds(offset, limit);

		// 페이징 처리 시 파라미터는 넘길 필요가 없기 떄문에 null 로 처리
		lists = super.sqlSession.selectList(this.namespace + "SelectTopN", null, rowBounds);

		super.SessionClose();
		return lists;
	}

	public int InsertData(Board board) {
		// 게시물 추가 관련 메소드
		int cnt = super.sqlSession.insert(this.namespace + "InsertData", board);
		super.SessionClose();
		return cnt;
	}

	public int UpdateData(Board board) {
		// 게시물 수정 관련 메소드
		int cnt = super.sqlSession.update(this.namespace + "UpdateData", board);
		super.SessionClose();
		return cnt;
	}

	public int DeleteData(int num) {
		// 게시물 삭제 관련 메소드
		int cnt = super.sqlSession.delete(this.namespace + "DeleteData", num);
		super.SessionClose();
		return cnt;
	}

	public List<Board> SelectAllData() {
		// 게시물 목록 조회 관련 메소드
		List<Board> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "SelectAllData");
		super.SessionClose();
		return lists;
	}

	public Board SelectOneData(int num) {
		// 게시물 상세 보기 관련 메소드
		Board bean = null;
		bean = super.sqlSession.selectOne(this.namespace + "SelectOneData", num);
		super.SessionClose();
		return bean;
	}

	public List<Board> SelectByPkId(String writer) {
		List<Board> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "SelectByPkId" , writer);
		super.SessionClose();
		return lists;
	}

	public List<Board> TrimIf1(Map<String, Object> map) {
		// trim 태그와 if 태그에 관련된 메소드 
		List<Board> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "TrimIf1" , map);
		super.SessionClose();
		return lists;
	}

	

	

}
