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
	private final String namespace = "NsAlbum";

	@Autowired
	SqlSessionTemplate abcd;

	// 앨범 목록 건수 확인 관련 메소드
	public int GetTotalCount(Map<String, String> map) {
		int cnt = -1;
		cnt = this.abcd.selectOne(namespace + ".getTotalCount" , map);

		return cnt;

	}

	// 앨범 목록 관련 메소드
	// 매개변수가 pageInfo , map 두개 인 이유는 ?
	// pageInfo : RowBounds 클래스 생성자에 offset 과 limit 매개변수를 넘겨줘야 하기 때문이다.
	// jsp 파일에서 pageInfo 를 가지고 값을 셋팅 해줘야되기 때문에
	// map : 키워드 검색 조건 때문에 넘겨준다. (AlbumListController 참고 할 것)
	public List<Album> getAlbumList(Paging pageInfo, Map<String, String> map) {
		System.out.println(this.getClass() + " getAlbumLists 메소드 호출됨");
		List<Album> lists = new ArrayList<Album>();

		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		lists = this.abcd.selectList(namespace + ".getAlbumList", map, rowBounds);
		return lists;
	}

	public void insert(Album album) {
		// 앨범 등록 관련 메소드
		System.out.println(this.getClass() + " insert 메소드 들어옴");
		this.abcd.insert(namespace + ".insert", album);
	}

	public List<CheckBean> GetList(String module, String field) {
		// 체크 박스 , 라디오 버튼 , 콤보 박스들의 내용을 가져온다.
		// module : 모듈 이름(회원_member , 상품_product , 앨범_album)
		// field : 테이블에 특정 컬럼 이름을 지정한다.
		Map<String, String> map = new HashMap<String, String>();
		map.put("module", module);
		map.put("field", field);
		return this.abcd.selectList(namespace + ".GetList", map);
	}
	
	public Album getAlbumById(int id) {
		System.out.println(this.getClass() + " getAlbumById 메소드 호출됨");
		return this.abcd.selectOne(namespace + ".getAlbumById", id);
	}
	
	public void update(Album album) {
		System.out.println(this.getClass() + " update 메소드 호출됨");
		this.abcd.update(namespace + ".update", album);
	}

	public void delete(int id) {
		System.out.println(this.getClass() + " delete 메소드 호출됨");
		this.abcd.delete(namespace + ".delete", id);
	}

}
