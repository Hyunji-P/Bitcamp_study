package execute;

import java.util.Scanner;

import dao.RoomDao;

public class Main03_Delete {

	public static void main(String[] args) {
		System.out.println("방 정보 삭제하기");
		int cnt = -1;
		RoomDao dao = new RoomDao();

		Scanner scan = new Scanner(System.in);
		System.out.println("예약자명을 입력하세요.");
		System.out.print("입력 : ");
		String name = scan.next();
		cnt = dao.DeleteData(name);

		if (cnt == 1) {
			System.out.println("방 정보 취소 완료");
		} else if (cnt == 0) {
			System.out.println("방 정보 취소 안됨");
		} else {
			System.out.println("방 정보 취소 실패");
		}
	}

}
