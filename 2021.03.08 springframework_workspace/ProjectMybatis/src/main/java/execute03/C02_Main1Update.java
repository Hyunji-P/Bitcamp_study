package execute03;

import bean.Album;
import dao.AlbumDao;

public class C02_Main1Update {

	public static void main(String[] args) {
		System.out.println("앨범 수정하기");
		AlbumDao dao = new AlbumDao();
		int result = -1;
		Album bean = new Album(8, "트로트", "영영", "나훈아", "남진", "김도훈", "21/01/27", "aa.png", "발라드", "lp,cd", "yes");
		
		result = dao.UpdateData(bean);

		if (result == 1) {
			System.out.println("앨범 수정 완료");
		}
	}

}
