package execute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Board;
import dao.BoardDao;

public class A13_MainTrimIf1 {

	public static void main(String[] args) {
		System.out.println("trim과 if 구문을 이용한 동적 sql");

		Scanner scan = new Scanner(System.in);

		final int HITCOUNT = 7;

		System.out.println("모든 게시물 조회(1)");
		System.out.println("홍길동 정보만 조회(2)");
		System.out.println("홍길동 정보 중에서 hitcount >= " + HITCOUNT + " 이상인 것만 조회(3)");
		System.out.println("hitcount >= " + HITCOUNT + " 이상인 것만 조회(4)");

		String writer = null; // 작성자
		int hitcount = 0; // 조회수

		int menu = scan.nextInt();

		Map<String, Object> map = new HashMap<String, Object>();

		if (menu == 1) {
			// writer 와 hitcount를 모두 지정하지 않는 경우
		} else if (menu == 2) {
			writer = "hong";

			map.put("writer", writer);
		} else if (menu == 3) {
			writer = "hong";
			hitcount = HITCOUNT;

			map.put("writer", writer);
			map.put("hitcount", hitcount);
		} else if (menu == 4) {
			hitcount = HITCOUNT;

			map.put("hitcount", hitcount);
		} else {
			System.exit(0); // 프로그램을 빠져나감
		}

		BoardDao dao = new BoardDao();
		List<Board> lists = dao.TrimIf1(map);

		System.out.println("작성자\t글제목\t조회수");
		for (Board borad : lists) {
			String imsi = "";
			imsi += borad.getWriter() + "\t";
			imsi += borad.getTitle() + "\t";
			imsi += borad.getHitcount() + "\t";

			System.out.println(imsi);

		}

	}

}
