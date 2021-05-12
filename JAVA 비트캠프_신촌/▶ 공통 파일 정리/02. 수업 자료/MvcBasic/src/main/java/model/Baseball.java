package model;

// 좋아하는 야구 팀의 콤보 박스에 채워질 Bean 클래스
public class Baseball {
	private String name ; //팀 이름 
	private String mascot ; //마스코트
	
	// getter, setter, toString(), 생성자를 구현합니다.
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
		return "BaseballBean [name=" + name + ", mascot=" + mascot + "]";
	}
	public Baseball() {	
	}
	public Baseball(String name, String mascot) {
		super();
		this.name = name;
		this.mascot = mascot;
	}
}