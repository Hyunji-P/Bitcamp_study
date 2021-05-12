package pkg1023;

import java.util.Vector;

public class MyBoards {

	public static void main(String[] args) {
		Vector<Board> vec = new Vector<Board>();

		Board jaein = new Board(10, "AA", "����", "2020/10/23", 6);
		Board chulsoo = new Board(9, "BB", "ö��", "2020/10/23", 5);
		Board hong = new Board(8, "CC", "�浿", "2020/10/23", 4);

		vec.add(jaein);
		vec.add(chulsoo);
		vec.add(hong);
		vec.add(new Board(7, "DD", "����", "2020/10/22", 3));

		ShowData(vec);

	}

	private static void ShowData(Vector<Board> vec) {
		System.out.println("�۹�ȣ\t����\t�ۼ���\t����\t\t��ȸ��");
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
