package pkg1023;

public class Board {
	private int no;// �۹�ȣ
	private String title;// ����
	private String writer;// �ۼ���
	private String regdate;// ����
	private int readcount;// ��ȸ��

	public Board() {
	}

	public Board(int no, String title, String writer, String regdate, int readcount) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.regdate = regdate;
		this.readcount = readcount;
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public int getReadcount() {
		return readcount;
	}

}
