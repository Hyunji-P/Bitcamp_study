package pkg1007;

public class StudentMain {

	public static void main(String[] args) {
		Student jessica = new Student("제시카", 50, 60, 70);
		jessica.Display();

		Student tiffany = new Student("티파니", 60, 50); // 수학 미응시
		tiffany.Display();

		Student taeyeon = new Student("태연", 30); // 영어 수학 미응시
		taeyeon.Display();

	}

}
