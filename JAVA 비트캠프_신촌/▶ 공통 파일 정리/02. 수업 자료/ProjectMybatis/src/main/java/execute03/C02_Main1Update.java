package execute03;

import bean.Album;
import dao.AlbumDao;

public class C02_Main1Update {
	public static void main(String[] args) {		
		System.out.println("앨범 정보 수정");
		AlbumDao dao = new AlbumDao();
		
		int result4 = -1 ; 
		result4 = dao.UpdateData(new Album(5, "REAL", "beat it", "김건모", "마이클 잭슨", "티나 터너", "21/01/10", "aa.jpg", "발라드", "lp,mp3", "yes")) ;
		if (result4 != -1) {
			System.out.println("앨범 정보가 수정되었습니다.");
		}
	}
}