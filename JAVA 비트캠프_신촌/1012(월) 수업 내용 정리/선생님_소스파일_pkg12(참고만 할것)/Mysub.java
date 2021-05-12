package pkg12;
public class Mysub extends Mysuper {
	int y = 200 ;
	
	public Mysub() {
		super() ;
		System.out.println("a");
	}
	public Mysub(String name) {
		super(name);
		super.setName(name);
		System.out.println("c");
	}
}