package pkg09;
public class Hakseng {
	private String name ; //학생 이름 : 홍길동
	private int grade ; //학년
	private int ban ; //반
	private int kor ; //국어
	private int eng ; //영어
	private int math ; //수학
	
	public void Display() { //결과 출력
		System.out.println("이름 : " + this.name);
		System.out.println("학년/반 : " + this.grade + "/" + this.ban);
		System.out.println("국어 : " + this.kor);
		System.out.println("영어 : " + this.eng);
		System.out.println("수학 : " + this.math);
		
		int total = this.kor + this.eng + this.math ;
		double average = (double)total / 3.0 ;
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		
		System.out.println("총점2 : " + this.TotalSum()); 
	}
	
	private int TotalSum() { //총점 구해주는 메소드
		return this.kor + this.eng + this.math ;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}	
}