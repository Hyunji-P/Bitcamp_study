
public class PersonMain {

	public static void main(String[] args) {
		Person[] saram = { 
							new Student("��ö��", 30, "���� ������", "01012345678", 3, 2, "A"),
							new Teacher("�ڿ���", 40, "��� ������", "01033334444", 2, "�ڹ�"),
							new Staff("������", 50, "���� ���ﵿ", "01055556666", 1, "�ѹ�") 
						};

		for (int i = 0; i < saram.length; i++) {
			System.out.println();
			System.out.println(saram[i].toString());
		}

	}

}
