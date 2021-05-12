package mycomputer;

public class Computer02 {
	private String cpu; // cpu
	private String hdd; // 하드 디스크
	private String mainboard; // 메인 보드

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public void setHdd(String hdd) {
		this.hdd = hdd;
	}

	public void setMainboard(String mainboard) {
		this.mainboard = mainboard;
	}

	@Override
	public String toString() {
		return "Computer02 [cpu=" + cpu + ", hdd=" + hdd + ", mainboard=" + mainboard + "]";
	}
	
	

}
