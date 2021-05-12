package pkg12;
public class Mother05{
	private String name ; //이름
	private int age ; //나이	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Mother05() {
		
	}
	public Mother05(String name, int age) {
		this.name = name ;
		this.age = age ;
	}	
	public void Display() {
		String imsi = "%s는 %d살입니다." ;
		System.out.printf(imsi, this.name, this.age);
		System.out.println();
	}
}