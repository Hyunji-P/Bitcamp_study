package pkg1016;

//���� Ŭ����
public class EnumTest {

	public static void main(String[] args) {
		Shoes shoe1 = new Shoes("����Ű", 235, ShoesType.RUNNING);
		shoe1.Display();

		System.out.println("======================");
		int[] arr = { 10, 20 };
		for (int item : arr) {
			System.out.println(item);
		}
		System.out.println("======================");
		// values() �޼ҵ� : enum ��ҵ��� ����� ��ȯ���ִ� �޼ҵ�
		// static �޼ҵ� �̱� ������ Ŭ���� �̸����� ������ ������
		// ��ȯŸ�� ShoesType[]
		// �޼ҵ� ���� : ��ȯŸ�� �޼ҵ� �̸� Ŭ�����̸�.�޼ҵ�
		ShoesType[] mylist = ShoesType.values();
		for (ShoesType item : mylist) {
			System.out.println(item);
			System.out.println(item.ordinal());
		}
	}

}
