package mycomputer;

public class MainProgram01 {
	public static void main(String[] args) {
		//생성자를 이용하여 Constructor Injection을 수행하고 있다.
		Programmer01 soo = new Programmer01("김철수", "용산구 도원동") ;
		
		System.out.println( soo.toString() ); 
	}
}