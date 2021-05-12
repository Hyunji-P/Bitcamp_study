package pkg1026;

//코딩은 bean 클래스 부터! 
public class Human {
	private String name; // 이름
	private String password; // 비번
	private int age;// 나이

	public Human() {
	}

	public Human(String name, String password, int age) {
		this.name = name;
		this.password = password;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", password=" + password + ", age=" + age + "]";
	}

}
