package mycomputer;

public class MainProgram {
	public static void main(String[] args) {
		//컴퓨터를 구성하기 위한 기본 정보들을 변수로 설정 합니다.
		String cpu = "인텔 CPU" ; //시피유
		String hdd = "삼성 HDD" ; //하드 디스크
		String mainboard = "엘지 MainBoard" ;//메인 보드
		
		//컴퓨터 객체 생성
		Computer computer = new Computer() ;
		
		//setter을 이용하여 데이터를 입력하고 있습니다.
		//이러한 개념을 setter Injection이라고 부릅니다.
		computer.setCpu(cpu) ;
		computer.setHdd(hdd);
		computer.setMainboard(mainboard) ;
		
		//생성자를 이용하여 Constructor Injection을 수행하고 있습니다.
		Programmer soo = new Programmer("김철수", "용산구 도원동", computer) ;
		
		System.out.println( soo.toString() ); 
	}
}

