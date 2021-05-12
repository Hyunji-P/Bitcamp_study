package myinterface;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;

import bean.Album;

public interface AlbumMapperInterface {

	public int InsertData(Album album); // 앨범 추가하기

	public int UpdateData(Album album); // 앨범 수정하기

	public int DeleteData(int id); // 앨범 삭제하기

	public List<Album> GetDataList(); // 전체 목록 보기

	public Album GetAlbumByPk(int id); // 앨범 정보 1건 조회하기

	public List<Album> SelectTopN(RowBounds rowBounds); // 페이징 처리를 구현한 전체 목록 보기

	// (완료)입력 값이 1이면 작사가(LYRICIST 컬럼)가 '김이나', 이외의 값이면 모든 앨범을 조회해 보세요.
	public List<Album> IfCondition(Map<String, String> map);

	// (완료)입력 값이 1이면 작사가가 '김이나'인 앨범들을, 2이면 작사가가 '최갑원'인 앨범들을, 이외의 값이면 모든 앨범을 조회해 보세요.
	public List<Album> Choose(Map<String, String> map);

	// (완료)작사가가 '김이나', '최갑원'인 앨범들을 조회하되, foreach와 배열을 사용해 보세요.
	public List<Album> Foreach1(String[] item);

	// (완료)작사가가 '김이나', '최갑원'인 앨범들을 조회하되, foreach와 List 컬렉션을 사용해 보세요.
	public List<Album> Foreach2(List<String> somelists);

}
