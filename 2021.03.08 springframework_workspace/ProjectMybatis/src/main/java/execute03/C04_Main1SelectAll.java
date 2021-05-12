package execute03;

import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C04_Main1SelectAll {

	public static void main(String[] args) {
		System.out.println("모든 데이터를 조회합니다.");
		AlbumDao dao = new AlbumDao();

		List<Album> lists = dao.GetDataList();
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
