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
	
	//��� �Ұ����� ����
	private String hello = "�ȳ��ϼ���." ;
	
	public void sayhello() {
		System.out.println("�λ縻 :" + this.hello);
	}
}