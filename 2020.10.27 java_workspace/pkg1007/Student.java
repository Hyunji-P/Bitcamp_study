package pkg1007;

public class Student {
	private String name;
	//���⿡ �⺻�� �ʱ�ȭ�ص���
	private int kor;
	private int eng;
	private int math;

	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = 50;
	}

	public Student(String name, int kor) {
		this.name = name;
		this.kor = kor;
		this.eng = 70;
		this.math = 50;
	}

	void Display() {
		int sum = this.kor + this.eng + this.math;
		double average = (double) sum / 3.0;
		System.out.printf("%s�� ������ %d���̰�, ����� %.2f�� �Դϴ�.\n", this.name, sum, average);
	}

}
