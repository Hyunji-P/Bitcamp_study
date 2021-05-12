package mypkg.mypet;

public class MainTest {
	public static void main(String[] args) {
		Animal dog = new Dog("강아지", "치와와", "멍멍") ;

		Animal cat = new Cat() ;
		cat.setType("고양이") ;
		cat.setName("나비") ;
		cat.setAge( 10 ) ;

		Saram hong = new Saram( dog, "홍길동", cat ) ;
		System.out.println( hong.toString() );
	}
}
