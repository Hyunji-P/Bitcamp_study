package pkg1007;

public class Student {
	private String name;
	//여기에 기본값 초기화해도됨
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
		System.out.printf("%s의 총점은 %d점이고, 평균은 %.2f점 입니다.\n", this.name, sum, average);
	}

}
