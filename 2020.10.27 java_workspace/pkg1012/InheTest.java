package pkg1012;

public class InheTest {

	public static void main(String[] args) {
		Mysub sub = new Mysub();
		System.out.println(sub.x);//���
		System.out.println(sub.y);//�ڱ� �ڽ�
		sub.sayhello();
		
		Mysub soo = new Mysub("��ö��");
	}

}
