package model;

public class Baseball {

	private String name; //팀명 , 사용자에게 보여줄 값
	private String mascot; //마스코트 , 파라미터 값

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMascot() {
		return mascot;
	}
	public void setMascot(String mascot) {
		this.mascot = mascot;
	}
	
	@Override
	public String toString() {
		return "Baseball [name=" + name + ", mascot=" + mascot + "]";
	}
	
	public Baseball(String name, String mascot) {
		super();
		this.name = name;
		this.mascot = mascot;
	}
	
	public Baseball() {
		// TODO Auto-generated constructor stub
	}
	
}
