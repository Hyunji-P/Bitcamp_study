package pkg1006;
// �ٽ� Ǯ���

public class AccountMain05 {

	public static void main(String[] args) {
		//��ö���� ���Ͽ� Account05 Ŭ������
		//getter , setter�� �����ϴ� ���α׷��� �ۼ��ϼ���.
		Account05 soo = new Account05();
		
		soo.setName("��ö��");//����		
		soo.setNo(1234567);//����		
		soo.setBalance(50000);//����	
		
		//����� ���� �־��� �����͸� �״�� �б�
		System.out.println("������ : " + soo.getName());
		System.out.println("���¹�ȣ : " + soo.getNo());
		System.out.println("�ܾ� : " + soo.getBalance());
	}

}
