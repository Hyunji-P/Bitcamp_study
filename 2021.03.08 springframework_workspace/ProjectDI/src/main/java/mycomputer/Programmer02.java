package mycomputer;

public class Programmer02 { // 프로그래머
	private String name;
	private String address;
	
	// 프로그래머가 컴퓨터에 의존한다. 
	private Computer02 computer = null;

	public Programmer02(String name, String address) { // 생성자
		this.name = name;
		this.address = address;
		this.computer = new Computer02();

		// setter 를 이용하여 데이터를 쓴다 ==> setter injection
		computer.setCpu("인텔 cpu");
		computer.setHdd("삼성 HDD");
		computer.setMainboard("엘지 MainBoard");
	}

	@Override
	public String toString() {
		return "Programmer02 [name=" + name + ", address=" + address + ", computer=" + computer + "]";
	}

}
