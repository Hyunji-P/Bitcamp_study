package pkg1013;

public class Employee extends Salary {
	public static String ceoname = "������";

	public Employee(String name, int salary, String department) {
		super(name, salary, department);

	}

	public Employee(String name, String department) {
		super(name, department);
	}

}
