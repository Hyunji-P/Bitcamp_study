package aa;

public class Welfare {
	// 한 건의 데이터를 처리해주는 Bean 클래스
	private String name; // 이름
	private String gender;// 성별
	private int age;// 나이
	private String ageg;// 연령대
	private String marriage;// 결혼 여부
	private String religion;// 종교 유무
	
	//결측치 데이터에 평균을 넣으려고 하다보니 실수형이 좋을 듯함
	private double income;// 소득
	private String job;// 지역
	private String area;// 권역

	private final String COMMA = ","; // 콤마

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
