package pkg12;
public class Human{
	private String name; // 이름
	private String gender; //성별 
	private double tall; // 키
	private double weight ; // 몸무게
	public Human() {	}
	public String getName() { 
		return this.name;
	}
	public Human(String name, String gender, double tall, double weight) {
		this.name = name ;
		this.gender = gender.equalsIgnoreCase("M") ? "남자" : "여자"  ;
		this.tall = tall ;
		this.weight = weight ;
		this.output1() ;
	}
	private void output1() {//입력된 멤버 변수 정보를 출력합니다.
		String imsi = "" ;
		imsi += "이름 : " + this.name + ", " ;
		imsi += "성별 : " + this.gender + ", " ;
		imsi += "키 : " + this.tall + ", " ;
		imsi += "몸무게 : " + this.weight ;
		System.out.println( imsi );
	}	
}