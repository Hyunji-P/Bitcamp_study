package pkg0923;

public class SwitchEx {
// �ٽ� Ǯ� �� 
	public static void main(String[] args) {

		String name = "ȫ�浿";
		String grade = "C";

		String temp = ""; // ��ǰ

//		switch (grade) {
//		case "A":
//			System.out.println("��� : " + grade);
//			System.out.println(name + "�� �����մϴ�.\n��������, ��޽¿���, ��Ʈ���� �帳�ϴ�!");
//
//			break;
//
//		case "B":
//			System.out.println("��� : " + grade);
//			System.out.println(name + "�� �����մϴ�.\n��޽¿���, ��Ʈ���� �帳�ϴ�!");
//			break;
//		case "C":
//			System.out.println("��� : " + grade);
//			System.out.println(name + "�� �����մϴ�.\n��Ʈ���� �帳�ϴ�!");
//			break;

//		switch (grade) {
//		case "A":
//			temp = "�������� , ��޽¿��� , ��Ʈ��";
//			break;
//
//		case "B":
//			temp = "��޽¿��� , ��Ʈ��";
//			break;
//
//		case "C":
//			temp = "��Ʈ��";
//			break;
//
//		}
//		System.out.println(temp);

		System.out.println("���̽� 02");
		temp = ""; // ��ǰ

		switch (grade) {
		case "A":
			temp += "�������� , ";
		case "B":
			temp += "��� �¿��� , ";
		case "C":
			temp += "��Ʈ��";

		}
		System.out.println("��ǰ : " + temp); // �� CASE ���� break �� ���������ʱ⶧���� 
											 // �ش��ϴ� CASE�� ������ �ؿ� �ִ� �������� ��� �� ����ȴ�.
	}
}
