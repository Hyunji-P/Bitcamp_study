package pkg1016;

//ShoesTypeName(한글이름포함)
//1. 관련 private 변수를 정의한다.
//2. private 생성자를 구비한다.
//3. public getter를 구비한다.

public enum ShoesTypeName {
	WALKING("워킹화"), RUNNING("런닝화"), TRACKING("트래킹화"), HIKING("등산화");

	//1
	private String name;

	//2
	private ShoesTypeName(String name) {
		this.name = name;
	}

	//3
	public String getName() {
		return name;
	}
}
