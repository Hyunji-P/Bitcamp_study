package mycomputer;

public class Programmer { // 프로그래머
	private String name;
	private String address;

	
	private Computer computer = null;

	// 생성자 매개 변수에 Computer 객체가 존재한다.
	// 생성자를 이용하여 데이터가 주입된다.(생성자 주입)
	public Programmer(String name, String address , Computer computer) { // 생성자
		this.name = name;
		this.address = address;
		this.computer = computer;

	}

	@Override
	public String toString() {
		return "Programmer [name=" + name + ", address=" + address + ", computer=" + computer + "]";
	}
	

}
