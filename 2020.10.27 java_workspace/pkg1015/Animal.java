package pkg1015;

public abstract class Animal {
//특징) 추상 메소드를 포함하는 클래스는 반드시 추상 클래스이어야 한다.
	private String name; // 이름
	private String location; // 주 활동 무대

	public Animal(String name, String location) {
		this.name = name;
		this.location = location;
	}

//특징)추상 클래스 내에는 일반 변수와 메소드도 사용 가능하다.
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public abstract void move();
//특징) 실제 구현할 내용이 없으므로 메소드 body(중괄호) 대신 세미콜론을 붙여 줘야 한다.

}
