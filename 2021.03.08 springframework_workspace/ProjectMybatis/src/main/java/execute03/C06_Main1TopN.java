package execute03;

import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C06_Main1TopN {

	public static void main(String[] args) {
		System.out.println("TopN 구문 작성하기");

		int pageNumber = 2;
		int pageSize = 3;

		int offset = (pageNumber - 1) * pageSize;
		int limit = pageSize;

		AlbumDao dao = new AlbumDao();
		List<Album> lists = dao.SelectTopN(offset, limit);
		for (Album alb : lists) {
			String imsi = "";
			imsi += alb.getId() + "\t";
			imsi += alb.getAlbumname() + "\t";
			imsi += alb.getSong() + "\t";
			imsi += alb.getWriterdate() + "\t";
			imsi += alb.getLyricist();

			System.out.println(imsi);
		}
	}

}
