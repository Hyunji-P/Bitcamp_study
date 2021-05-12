package mycomputer;

public class OfficeWorker02 {
	private String name;
	private String address;
	private Computer02 computer;

	public OfficeWorker02(String name, String address) {
		this.name = name;
		this.address = address;
		this.computer = new Computer02();

		this.computer.setCpu("인텔 시피유");
		this.computer.setHdd("삼성 하드");
		this.computer.setMainboard("엘지 메인보드");
	}

	@Override
	public String toString() {
		return "OfficeWorker02 [name=" + name + ", address=" + address + ", computer=" + computer + "]";
	}

}
