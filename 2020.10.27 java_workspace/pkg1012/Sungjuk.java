package pkg1012;

//슈퍼 클래스
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
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
		System.out.println("수학 : " + this.math);
		System.out.println();
	}

}
