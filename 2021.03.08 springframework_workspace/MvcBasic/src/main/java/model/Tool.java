package model;

public class Tool {
	
	private String English; // 파라미터 값
	private String Korea; // 사용자에게 보여줄 값 
	
	public String getEnglish() {
		return English;
	}
	public void setEnglish(String english) {
		English = english;
	}
	public String getKorea() {
		return Korea;
	}
	public void setKorea(String korea) {
		Korea = korea;
	}
	
	@Override
	public String toString() {
		return "Tool [English=" + English + ", Korea=" + Korea + "]";
	}
	
	public Tool(String english, String korea) {
		super();
		English = english;
		Korea = korea;
	}
	
	public Tool() {
		// TODO Auto-generated constructor stub
	}

}
