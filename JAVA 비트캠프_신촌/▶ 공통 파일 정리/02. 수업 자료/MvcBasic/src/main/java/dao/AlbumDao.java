package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bean.Album;
import bean.CheckBean;
import utility.Paging;

@Component("dao")
public class AlbumDao {	
	// mapper 파일의 네임 스페이스 이름과 동일해야 합니다.
	private final String namespace = "MyAlbum" ;

	// 이 메소드를 스프링 설정 파일에서 setter injection 시키고 있다.
	@Autowired
	SqlSessionTemplate abcd;
	
//	@Autowired //AlbumMapper 인터페이스 
//	AlbumMapper mapper;	
	
	public int GetTotalCount(Map<String, String> map) {
		int cnt = -1;
		cnt = this.abcd.selectOne(namespace + ".getTotalCount", map);
		return cnt;
	}

	public List<Album> getAlbumList( Paging pageInfo,  Map<String, String> map ) {
		System.out.println(this.getClass() + ".getAlbumList 들어옴");
		List<Album> lists = new ArrayList<Album>();
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit() );
		lists = this.abcd.selectList(namespace + ".getAlbumList", map, rowBounds);
		return lists;
	}  

	// 앨범 정보 저장하기.
	public void insert(Album album) {
		System.out.println(this.getClass() + "insert 들어옴");
		this.abcd.insert(namespace + ".insert", album);
	}

	// 앨범 한 개의 정보 얻어오기
	public Album getAlbumById(int id) {
		System.out.println(this.getClass() + ".getAlbumById 들어옴");
		return this.abcd.selectOne(namespace + ".getAlbumById", id);
	}

	// 앨범 정보 수정하기
	public void update(Album album) {
		System.out.println(this.getClass() + ".update 들어옴");
		this.abcd.update(namespace + ".update", album);
	}

	// 앨범 정보 삭제하기. xml 파일 대신, Mapper Interface를 이용하는 방식
	public void delete(int id) {
		System.out.println(this.getClass() + ".delete 들어옴");
		this.abcd.delete(namespace + ".delete", id);
	}

	public List<CheckBean> GetList(String module, String field) {		
		// 체크 박스, 라디오 버튼, 콤보 박스의 내용들을 가져옵니다.
		Map<String, String> map = new HashMap<String, String>() ;
		map.put("module", module) ;
		map.put("field", field) ;
		return this.abcd.selectList(namespace + ".GetList", map);	
	}	
}