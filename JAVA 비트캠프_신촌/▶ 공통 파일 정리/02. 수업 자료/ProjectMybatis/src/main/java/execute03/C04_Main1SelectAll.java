package execute03;

import java.util.List;

import bean.Album;
import dao.AlbumDao;

public class C04_Main1SelectAll {
	public static void main(String[] args) {
		System.out.println("모든 회원을 조회합니다.");
		AlbumDao dao = new AlbumDao();
		
		List<Album> lists = dao.GetDataList() ;
		System.out.println("아이디\t이름\t나이\t성별");
		for(Album alb : lists){
			String imsi = 
					alb.getId() + "\t" +
					alb.getAlbumname() + "\t" +
					alb.getSong() + "\t" + 
					alb.getLyricist()  ; 
			
			System.out.println( imsi );		
		}
	}
}