package pkg1006;

public class AccountMain06 {

	public static void main(String[] args) {
		Account06 soo = new Account06();
		//soo ��ü�� �����ϸ� heap �޸𸮿� this.������ �ڵ����� ����

		soo.setName("��ö��");
		soo.setAge(30);
		soo.Display();
		
		Account06 hee = new Account06();
		//hee ��ü�� �����ϸ� heap �޸𸮿� this.������ �ڵ����� ����


		hee.setName("�ڿ���");
		hee.setAge(40);
		hee.Display();
		
	}

}
