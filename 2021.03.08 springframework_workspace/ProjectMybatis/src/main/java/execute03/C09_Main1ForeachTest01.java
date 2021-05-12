package execute03;

import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C09_Main1ForeachTest01 {

	public static void main(String[] args) {
		System.out.println("배열을 이용한 <foreach> 사용하기");

		AlbumDao dao = new AlbumDao();
		List<Album> lists = dao.Foreach1();

		System.out.println("<앨범 정보>");
		System.out.println("아이디\t앨범이름\t노래제목\t발매일자\t\t\t작사가");
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
