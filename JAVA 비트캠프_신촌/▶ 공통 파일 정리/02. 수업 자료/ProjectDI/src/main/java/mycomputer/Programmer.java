package mycomputer;

public class Programmer {
	private String name ; //이름
	private String address ; //주소
	
	//개발자는 컴퓨터 객체인 computer를 사용하고 있습니다.
	//이러한 개념을 Dependency Relationship(의존 관계)라고 부릅니다.
	private Computer computer ; //컴퓨터 객체
	
	// 생성자를 구현합니다.
	public Programmer(String name, String address, Computer computer) {
		this.name = name ;
		this.address = address ;
		this.computer = computer ;
	}
	
	@Override //결과물을 출력해주는 toString() 메소드를 오버라이딩합니다.
	public String toString() {
		String imsi = ""; 
		imsi += "=== 프로그래머 정보 ===" + "\n" ;
		imsi += "이름 : " + this.name + "\n" ;
		imsi += "주소 : " + this.address + "\n" ;
		imsi += "=== 컴퓨터 정보 ===" + "\n" ;
		imsi += this.computer.toString() ;
		
		return imsi ;
	}	
}