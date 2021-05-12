package execute;

import java.util.List;

import bean.Room;
import dao.RoomDao;

public class Main04_SelectAll {

	public static void main(String[] args) {
		System.out.println("방 예약 목록보기");

		RoomDao dao = new RoomDao();
		List<Room> lists = dao.SelectAllData();
		if (lists == null) {
			System.out.println("방 예약 목록 보기 실패");
		} else {
			for (Room room : lists) {
				System.out.println(room.toString());
			}

		}
	}

}
