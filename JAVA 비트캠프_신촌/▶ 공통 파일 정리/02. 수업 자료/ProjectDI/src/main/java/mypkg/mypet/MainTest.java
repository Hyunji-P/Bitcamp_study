package mypkg.mypet;

public class MainTest {
	public static void main(String[] args) {
		Animal dog = new Dog("������", "ġ�Ϳ�", "�۸�") ;

		Animal cat = new Cat() ;
		cat.setType("�����") ;
		cat.setName("����") ;
		cat.setAge( 10 ) ;

		Saram hong = new Saram( dog, "ȫ�浿", cat ) ;
		System.out.println( hong.toString() );
	}
}
