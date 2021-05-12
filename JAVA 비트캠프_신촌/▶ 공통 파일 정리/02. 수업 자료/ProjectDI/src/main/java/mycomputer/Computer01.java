package mycomputer;

public class Computer01 {
	private String cpu ; //시피유
	private String hdd ; //하드 디스크
	private String mainboard ;	//메인 보드
	
	// 외부에서 데이터를 입력할 수 있도록 setter를 구현합니다.	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}
	
	@Override // 결과물을 출력해주는 toString() 메소드를 오버라이딩합니다.
	public String toString() {
		String imsi = ""; 
		imsi += "cpu 정보 : " + this.cpu + "\n" ;
		imsi += "hdd 정보 : " + this.hdd + "\n" ;
		imsi += "mainboard 정보 : " + this.mainboard + "\n" ;
		
		return imsi ; 
	}	
}