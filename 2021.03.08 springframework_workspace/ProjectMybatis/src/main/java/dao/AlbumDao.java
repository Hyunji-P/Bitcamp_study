package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import bean.Album;
import myinterface.AlbumMapperInterface;

public class AlbumDao extends SuperDao {
	// 매퍼 인터페이스를 사용하므로 , 네임 스페이스를 명시하지 않습니다.

	// ami : 매퍼 인터페이스 객체
	AlbumMapperInterface ami = null;

	public AlbumDao() {
		// ami 객체를 만들기 위해 AlbumMapperInterface 클래스를 가져와서 객체를 만듬
		this.ami = super.sqlSession.getMapper(AlbumMapperInterface.class);
	}

	public int InsertData(Album bean) {
		// 앨범 추가하기
		int cnt = this.ami.InsertData(bean);
		super.SessionClose();
		return cnt;
	}

	public int UpdateData(Album bean) {
		// 앨범 수정하기
		int cnt = this.ami.UpdateData(bean);
		super.SessionClose();
		return cnt;
	}

	public int DeleteData(int id) {
		// 앨범 삭제하기
		int cnt = this.ami.DeleteData(id);
		super.SessionClose();
		return cnt;
	}

	public List<Album> GetDataList() {
		// 앨범 목록 조회하기
		List<Album> lists = this.ami.GetDataList();
		super.SessionClose();
		return lists;
	}

	public Album GetAlbumByPk(int id) {
		// 앨범 1건 조회하기
		Album bean = this.ami.GetAlbumByPk(id);
		super.SessionClose();
		return bean;
	}

	public List<Album> SelectTopN(int offset, int limit) {
		// 페이징 처리를 구현한 목록 보기
		RowBounds rowBounds = new RowBounds(offset, limit);

		List<Album> lists = this.ami.SelectTopN(rowBounds);
		super.SessionClose();
		return lists;
	}

	public List<Album> IfCondition(Map<String, String> map) {
		// if문 사용 관련 메소드
		List<Album> lists = this.ami.IfCondition(map);
		super.SessionClose();
		return lists;
	}

	public List<Album> Choose(Map<String, String> map) {
		// choose문 사용 관련 메소드
		List<Album> lists = this.ami.Choose(map);
		super.SessionClose();
		return lists;
	}

	public List<Album> Foreach1() {
		// 배열을 이용한 foreach문 사용 관련 메소드
		String[] item = { "김이나", "최갑원" };

		List<Album> lists = this.ami.Foreach1(item);
		super.SessionClose();
		return lists;
	}

	public List<Album> Foreach2(List<String> lyricist) {
		// 리스트 컬렉션을 이용한 foreach문 사용 관련 메소드
		List<Album> lists = this.ami.Foreach2(lyricist);
		super.SessionClose();
		return lists;
	}

}
