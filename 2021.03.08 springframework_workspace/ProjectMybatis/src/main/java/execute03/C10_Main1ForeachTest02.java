package execute03;

import java.util.ArrayList;
import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C10_Main1ForeachTest02 {

	public static void main(String[] args) {
		System.out.println("list 컬렉션을 이용한 <foreach> 사용하기");
		
		List<String> lyricist = new ArrayList<String>();
		lyricist.add("김이나");
		lyricist.add("최갑원");
		
		AlbumDao dao = new AlbumDao();
		List<Album> lists = dao.Foreach2(lyricist);

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
