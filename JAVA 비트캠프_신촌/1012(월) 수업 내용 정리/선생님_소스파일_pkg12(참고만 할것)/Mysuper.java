package pkg12;
public class Mysuper {
	int x = 100 ;
	private String name ; 
	
	public void setName(String name) {
		this.name = name;
	}
	public Mysuper(String name) {
		this.name = name ;
	}

	public Mysuper() {
		System.out.println("b");
	}
	
	//상속 불가능한 변수
	private String hello = "안녕하세요." ;
	
	public void sayhello() {
		System.out.println("인사말 :" + this.hello);
	}
}