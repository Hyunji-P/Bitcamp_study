package execute03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Album;
import dao.AlbumDao;

public class C07_Main1IfTest {

	public static void main(String[] args) {
		System.out.println("<if> 사용하기");

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 1이면 작사가가 '김이나' , 이외의 숫자면 전체 앨범을 조회합니다.");
		System.out.println("숫자(정수)를 입력하세요.");
		System.out.print("입력 : ");

		int num = scan.nextInt();
		Map<String, String> map = new HashMap<String, String>();

		if (num == 1) {
			String lyricist = "김이나";
			map.put("lyricist", lyricist);

		} else {
			// 입력 값이 1이 아니면 모든 데이터가 조회
		}

		AlbumDao dao = new AlbumDao();
		List<Album> lists = dao.IfCondition(map);

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
