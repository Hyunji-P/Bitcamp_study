package pkg1006;

public class SaramMain02 {

	public static void main(String[] args) {
		// getter , setter�� ����Ͽ� ���α׷���

		Saram02 hee = new Saram02();

		hee.setName("����");
		hee.setHeight(165.4);
		hee.setWeight(58.7);
		hee.setHobby("����");
		hee.setBlood("O��");
		hee.setBool(false);

		showData(hee);
	}

	private static void showData(Saram02 human) {
		//���� �ι��� ���� �� �ֱ⶧���� ���������� human���� ���°� ����
		//private�� ���� Ŭ���� ���ο����� ��밡���ϱ⶧����  
		//�� Ŭ���� �ȿ����� showData() �޼ҵ带 ������ �� �ֵ��� private���� �ɾ��
		//�ܺ� ������ ���� �뵵�� 
		
		// showData(hee); �޼ҵ�����غ���
		System.out.println(human.getName() + "���� ����");
		System.out.println("�̸�  : " + human.getName());
		System.out.println("Ű  : " + human.getHeight());
		System.out.println("������  : " + human.getWeight());
		System.out.println("���  : " + human.getHobby());
		System.out.println("������  : " + human.getBlood());
		System.out.println("��, ����  : " + human.getBool());

	}

}
