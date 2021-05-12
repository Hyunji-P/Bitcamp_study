package mycomputer;

public class Programmer02 {
	private String name ; //이름
	private String address ; //주소	
	private Computer02 computer = null ;
	
	// 생성자를 구현합니다.
	public Programmer02(String name, String address) {
		this.name = name ;
		this.address = address ;
		this.computer = new Computer02() ; //컴퓨터 객체
		
		String cpu = "인텔 CPU" ; //시피유
		String hdd = "삼성 HDD" ; //하드 디스크
		String mainboard = "엘지 MainBoard" ;//메인 보드
		
		this.computer.setCpu(cpu) ;
		this.computer.setHdd(hdd);
		this.computer.setMainboard(mainboard) ;
	}

	@Override // 결과물을 출력해주는 toString() 메소드를 오버라이딩합니다.
	public String toString() {
		String imsi = ""; 
		imsi += "=== 사원 정보 ===" + "\n" ;
		imsi += "이름 : " + this.name + "\n" ;
		imsi += "주소 : " + this.address + "\n" ;
		
		imsi += "\n=== 컴퓨터 정보 ===" + "\n" ;
		imsi += this.computer.toString() ;
		
		return imsi ;
	}	
}