package execute;

import bean.Room;
import dao.RoomDao;

public class Main01_Insert {

	public static void main(String[] args) {
		System.out.println("방 정보 추가하기");
		int cnt = -1;
		RoomDao dao = new RoomDao();
		cnt = dao.InsertData(new Room(0, "박현지", "기본", 5, 50000, "noimage.jpg", "noimage.jpg", "noimage.jpg", "가족룸"));
		if (cnt == 1) {
			System.out.println("룸 추가 성공");
		} else if (cnt == 0) {
			System.out.println("룸 추가 없음");
		} else {
			System.out.println("룸 추가 실패");
		}
	}

}
