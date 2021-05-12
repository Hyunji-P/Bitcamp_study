package execute;

import java.util.Scanner;

import bean.Room;
import dao.RoomDao;

public class Main05_SelectOne {

	public static void main(String[] args) {
		System.out.println("한 예약정보 조회");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("예약 번호를 입력하세요.");
		System.out.print("입력 : ");
		int rono = scan.nextInt();
		
		RoomDao dao = new RoomDao();
		Room room = dao.SelectOneData(rono);
		
		System.out.println(room.toString());
	}

}
