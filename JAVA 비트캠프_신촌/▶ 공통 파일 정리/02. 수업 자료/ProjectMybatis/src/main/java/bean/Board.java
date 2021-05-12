package bean;

import java.sql.Date;

public class Board {
	private int no;
	private String title;		
	private String writer;
	private String content;
	private java.sql.Date regdate ; 
	private int hitcount ;
	
	// getter, setter 및 생성자, toString() 등을 구현합니다.	
	
	
	public int getNo() {
		return no;
	}
	public Board(int no, String title, String writer, String content, Date regdate, int hitcount) {
		super();
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.hitcount = hitcount;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.sql.Date getRegdate() {
		return regdate;
	}
	public void setRegdate(java.sql.Date regdate) {
		this.regdate = regdate;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	@Override
	public String toString() {
		return "BoardBean [no=" + no + ", title=" + title + ", writer="
				+ writer + ", content=" + content + ", regdate=" + regdate
				+ ", hitcount=" + hitcount + "]";
	}  
}