package pkg1015;

public class SportTest {

	public static void main(String[] args) {
		// �̸� , ��Ʈ�� , Ÿ��
		Baseball baseball = new Baseball("�߱�", 9, 0.235);
		baseball.Play();
		baseball.Display();

		// �̸� , ��Ʈ�� , ���
		Football football = new Football("�౸", 11, 5);
		football.show();

		// ���� ������ �����ϸ� "�౸�� ��վ�" ��� ������ ��� �ȴٰ� �Ѵ�.
		// toString �������̵� 
		// football�� toString �޼ҵ尡 ���� Ÿ�� �ö󰡼� objectŬ������ �ּ� ���
		System.out.println(football);
	}

}
