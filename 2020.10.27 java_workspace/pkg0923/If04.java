package pkg0923;

public class If04 {

	public static void main(String[] args) {
		// ���� ���� ����
		// ���� ó�� �ϱ�

		int score = 75;
		String grade = "";

		if (score >= 90) {
			grade = "A";

		} else if (score >= 80) {
			grade = "B";

		} else if (score >= 70) {
			grade = "C";

		} else if (score >= 60) {
			grade = "D";

		} else {
			grade = "F";

		}
		String imsi = "���� : " + grade;
		System.out.println(imsi);

	}

}
