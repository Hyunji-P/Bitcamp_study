package aa;

public class Welfare {
	// �� ���� �����͸� ó�����ִ� Bean Ŭ����
	private String name; // �̸�
	private String gender;// ����
	private int age;// ����
	private String ageg;// ���ɴ�
	private String marriage;// ��ȥ ����
	private String religion;// ���� ����
	
	//����ġ �����Ϳ� ����� �������� �ϴٺ��� �Ǽ����� ���� ����
	private double income;// �ҵ�
	private String job;// ����
	private String area;// �ǿ�

	private final String COMMA = ","; // �޸�

	public Welfare() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAgeg() {
		return ageg;
	}

	public void setAgeg(String ageg) {
		this.ageg = ageg;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		String imsi = "";
		imsi += name + COMMA;
		imsi += gender + COMMA;
		imsi += age + COMMA;
		imsi += ageg + COMMA;
		imsi += marriage + COMMA;
		imsi += religion + COMMA;
		imsi += income + COMMA;
		imsi += job + COMMA;
		imsi += area;
		return imsi;
	}

}
