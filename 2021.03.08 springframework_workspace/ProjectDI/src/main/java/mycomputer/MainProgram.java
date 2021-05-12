package mycomputer;

public class MainProgram {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		// setter 를 이용하여 데이터를 주입 
		computer.setCpu("인텔 시피유");
		computer.setHdd("삼성 하드");
		computer.setMainboard("엘지 메인 보드");
		
		// 생성자를 통한 데이터가 주입된다.
		// 생성자 injection
		Programmer soo = new Programmer("김철수","서대문구 신촌동", computer);
		System.out.println(soo.toString());
	}

}