package pkg1007;

public class EqualsTest {

	public static void main(String[] args) {
		String str = "java";
		String str1 = new String("JAVA");
		String str2 = new String("java");

		if(str1 == str2){//���� ��
			System.out.println("���� ����");
		}else {
			System.out.println("���� �ٸ�");
		}
		
		if(str1.equals(str2)){//�� ��
			System.out.println("�� ����");
		}else {
			System.out.println("�� �ٸ�");
		}
		
		if(str1.equalsIgnoreCase(str2)){//�� �� 
			System.out.println("�� ����");
		}else {
			System.out.println("�� �ٸ�");
		}

	}

}
