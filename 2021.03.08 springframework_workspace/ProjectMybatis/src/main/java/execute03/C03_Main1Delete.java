package execute03;

import dao.AlbumDao;

public class C03_Main1Delete {

	public static void main(String[] args) {
		System.out.println("앨범 삭제하기");
		AlbumDao dao = new AlbumDao();
		int id = 8;
		int result = -1;

		result = dao.DeleteData(id);

		if (result == 0) {
			System.out.println(id + "번 앨범은 존재하지 않습니다.");
		} else if (result == -1) {
			System.out.println(id + "번 앨범 삭제를 실패했습니다.");
		} else {
			System.out.println(id + "번 앨범이 삭제되었습니다.");
		}
	}

}
