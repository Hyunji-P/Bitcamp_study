package pkg1023;

import java.util.Vector;

public class MyBoards {

	public static void main(String[] args) {
		Vector<Board> vec = new Vector<Board>();

		Board jaein = new Board(10, "AA", "재인", "2020/10/23", 6);
		Board chulsoo = new Board(9, "BB", "철수", "2020/10/23", 5);
		Board hong = new Board(8, "CC", "길동", "2020/10/23", 4);

		vec.add(jaein);
		vec.add(chulsoo);
		vec.add(hong);
		vec.add(new Board(7, "DD", "현지", "2020/10/22", 3));

		ShowData(vec);

	}

	private static void ShowData(Vector<Board> vec) {
		System.out.println("글번호\t제목\t작성자\t일자\t\t조회수");
		System.out.println("============================================");
		for (Board board : vec) {
			String imsi = board.getNo() + "\t";
			imsi += board.getTitle() + "\t";
			imsi += board.getWriter() + "\t";
			imsi += board.getRegdate() + "\t";
			imsi += board.getReadcount() + "\t";
			System.out.println(imsi);
		}

	}

}
