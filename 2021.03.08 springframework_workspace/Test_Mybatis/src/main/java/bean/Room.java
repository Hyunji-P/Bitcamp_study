package bean;

public class Room {
	private int rono; // 예약 번호(시퀀스)
	private String bname; // 예약자 이름
	private String btype; // 방 타입
	private int maxp; // 최대 이용 시간
	private int price; // 가격
	private String image1; // 이미지 방1 사진
	private String image2; // 이미지 방2 사진
	private String image3; // 이미지 방3 사진
	private String comments; // 방이름

	// getter , setter , 생성자 , toString 구현
	public Room() {
	}
	
	public Room(int rono, String bname, String btype, int maxp, int price, String image1, String image2, String image3,
			String comments) {
		this.rono = rono;
		this.bname = bname;
		this.btype = btype;
		this.maxp = maxp;
		this.price = price;
		this.image1 = image1;
		this.image2 = image2;
		this.image3 = image3;
		this.comments = comments;
	}

	public int getRono() {
		return rono;
	}

	public void setRono(int rono) {
		this.rono = rono;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public int getMaxp() {
		return maxp;
	}

	public void setMaxp(int maxp) {
		this.maxp = maxp;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage1() {
		return image1;
	}

	public void setImage1(String image1) {
		this.image1 = image1;
	}

	public String getImage2() {
		return image2;
	}

	public void setImage2(String image2) {
		this.image2 = image2;
	}

	public String getImage3() {
		return image3;
	}

	public void setImage3(String image3) {
		this.image3 = image3;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Room [rono=" + rono + ", bname=" + bname + ", btype=" + btype + ", maxp=" + maxp + ", price=" + price
				+ ", image1=" + image1 + ", image2=" + image2 + ", image3=" + image3 + ", comments=" + comments + "]";
	}

}
