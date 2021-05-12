package myinterface;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import bean.Album;

public interface AlbumMapperInterface {
	public List<Album> GetDataList();
	public int InsertData(Album Album);
	public int UpdateData(Album Album);
	public int DeleteData(int id);
	public Album GetAlbumByPk(int id) ;
	public List<Album> SelectTopN(RowBounds rowBounds);
}
