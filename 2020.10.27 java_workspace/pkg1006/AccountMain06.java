package pkg1006;

public class AccountMain06 {

	public static void main(String[] args) {
		Account06 soo = new Account06();
		//soo 객체를 생성하면 heap 메모리에 this.변수가 자동으로 적재

		soo.setName("김철수");
		soo.setAge(30);
		soo.Display();
		
		Account06 hee = new Account06();
		//hee 객체를 생성하면 heap 메모리에 this.변수가 자동으로 적재


		hee.setName("박영희");
		hee.setAge(40);
		hee.Display();
		
	}

}
