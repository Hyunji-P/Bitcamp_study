package execute03;

import java.util.Scanner;

import bean.Album;
import dao.AlbumDao;

public class C05_Main1SelectOne {

	public static void main(String[] args) {
		System.out.println("앨범 1건을 조회합니다.");

		Scanner scan = new Scanner(System.in);
		System.out.print("아이디(정수) 입력 : ");
		int id = scan.nextInt();

		AlbumDao dao = new AlbumDao();
		Album alb = dao.GetAlbumByPk(id);

		if (alb == null) {
			System.out.println("존재하지 않는 앨범입니다.");
		} else {
			System.out.println("앨범 정보");

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
