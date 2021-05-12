package execute03;

import bean.Album;
import dao.AlbumDao;
public class C01_Main1Insert {
	public static void main(String[] args) {		
		AlbumDao dao = new AlbumDao();
		System.out.println("앨범 추가하기");
		int result3 = dao.InsertData(new Album(0, "REAL", "beat it", "김건모", "마이클 잭슨", "티나 터너", "21/01/10", "aa.jpg", "발라드", "lp,mp3", "yes")) ;
		if (result3 == 1) {
			System.out.println("앨범이 추가되었습니다.");
		}
	}
}