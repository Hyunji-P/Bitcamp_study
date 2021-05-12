package myunicon;

public class Animal {
	private String name; // 유니콘 이름
	private int age; // 나이


	public Animal() {
		
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
