package pkg1012;

//���� Ŭ����
public class Sungjuk {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getKor() {
		return kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getEng() {
		return eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getMath() {
		return math;
	}

	public void Display() {
		System.out.println("�̸� : " + this.name);
		System.out.println("���� : " + this.kor);
		System.out.println("���� : " + this.eng);
		System.out.println("���� : " + this.math);
		System.out.println();
	}

}
