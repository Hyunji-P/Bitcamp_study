package execute03;

import bean.Album;
import dao.AlbumDao;

public class C01_Main1Insert {

	public static void main(String[] args) {
		System.out.println("앨범 추가하기");
		AlbumDao dao = new AlbumDao();
		int result = -1;
		Album bean = new Album(0, "발라드", "호호호", "박현지", "이수만", "김도훈", "21/01/27", "aa.png", "발라드", "lp,cd", "yes");
		
		result = dao.InsertData(bean);

		if (result == 1) {
			System.out.println("앨범 추가하기");
		}
	}

}
