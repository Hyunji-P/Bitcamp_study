package dao;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import bean.Album;
import myinterface.AlbumMapperInterface;

public class AlbumDao extends SuperDao {
	// namespace 맵퍼를 위한 네임 스페이스 이름	
	//static final String namespace = "NsAlbum." ;
	AlbumMapperInterface ami = null ;
	
	public AlbumDao(){ 
		this.ami = super.sqlSession.getMapper(AlbumMapperInterface.class);
	}

	public List<Album> GetDataList(){
		List<Album> lists = this.ami.GetDataList() ;
		super.SessionClose();
		return lists;
	}	
	
	public int InsertData(Album Album) {
		int cnt = -1 ;		
		//insert 메소드 : 	
		cnt = this.ami.InsertData(Album);
		super.SessionClose();	
		return cnt;
	}

	public int UpdateData(Album Album) {
		int cnt = -1 ;		
		cnt = this.ami.UpdateData(Album);
		super.SessionClose();
		return cnt;
	}
	
	public int DeleteData(int id) {
		int cnt = -1 ;		
		cnt = this.ami.DeleteData(id);
		super.SessionClose();		
		return cnt;
	}		

	
	public Album GetAlbumByPk(int id){
		Album Album = this.ami.GetAlbumByPk(id);
		super.SessionClose();			
		return Album;
	}	
	
	public List<Album> SelectTopN(int offset, int limit) {
		RowBounds rowBounds = new RowBounds(offset, limit);		
		List<Album> lists = this.ami.SelectTopN(rowBounds);
		super.SessionClose();
		return lists;
	}	
	
//	public List<Album> GetJoinList() {
//		List<Album> lists = null;
//		lists = super.sqlSession.selectList(namespace + "GetJoinList");
//		super.SessionClose();
//		return lists;
//	}	
//	
//	public List<HashMap<String, Object>> JoinGet3Way() {
//		List<HashMap<String, Object>> maplists = null;
//		
//		maplists = super.sqlSession.selectList(namespace + "JoinGet3Way");
//		super.SessionClose();
//		return maplists;		
//	}
//	
//	public List<Album> IfCondition(String irum) {//동적 sql if 사용
//		Map<String, String> map = new HashMap<String, String>() ;
//		map.put("name", irum) ;
//		List<Album> lists = null;
//		lists = super.sqlSession.selectList(namespace + "IfCondition", map);
//		super.SessionClose();
//		return lists ;
//	}	
//	
//	public List<Album> Foreach1() {//배열을 이용한 예시
//		String[] item = {"홍길동", "김철수", "심형래" };
//		
//		List<Album> lists = null;
//		lists = super.sqlSession.selectList(namespace + "Foreach1", item);
//		super.SessionClose();
//		return lists;
//	}	
//	
//	public List<Album> Foreach2() {
//		List<String> somelists = new ArrayList<String>() ;
//		somelists.add("박영희") ;
//		somelists.add("강감찬") ;
//		
//		List<Album> lists = null;
//		lists = super.sqlSession.selectList(namespace + "Foreach2", somelists);
//		super.SessionClose();
//		return lists;		
//	}	
}