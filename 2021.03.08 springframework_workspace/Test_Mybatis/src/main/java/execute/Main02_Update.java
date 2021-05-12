package execute;

import bean.Room;
import dao.RoomDao;

public class Main02_Update {

	public static void main(String[] args) {
		System.out.println("방 정보 수정");
		int cnt = -1;
		RoomDao dao = new RoomDao();
		cnt = dao.UpdateData(new Room(0, "박현지", "기본", 10, 10000000, "noimage.jpg", "noimage.jpg", "noimage.jpg", "비트캠프룸"));
		if (cnt == 1) {
			System.out.println("방 정보 수정 완료");
		} else if (cnt == 0) {
			System.out.println("방 정보 수정 안됨");
		} else {
			System.out.println("방 정보 수정 실패");
		}

	}

}
