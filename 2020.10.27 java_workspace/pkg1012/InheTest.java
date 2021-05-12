package pkg1012;

public class InheTest {

	public static void main(String[] args) {
		Mysub sub = new Mysub();
		System.out.println(sub.x);//»ó¼Ó
		System.out.println(sub.y);//ÀÚ±â ÀÚ½Å
		sub.sayhello();
		
		Mysub soo = new Mysub("±èÃ¶¼ö");
	}

}
