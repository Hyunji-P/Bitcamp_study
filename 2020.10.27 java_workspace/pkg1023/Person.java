package pkg1023;

public class Person {

	//실제 bean 클래스
	//bean 
	//반복적인 작업을 효율적으로 하기 위해 사용 
	//JAVA 언어의 데이터(속성)과 기능(메소드)로 이루어진 클래스를 말함 
	//예를들어 , 회원정보 게시판 글 들의 정보를 출력할 때 정보를 저장하고 있는 자바빈 객체를 사용하게 된다.
	private String name;
	private int kor;
	private int eng;
	private int math;

	//웹프로그래밍 할때는 빈 생성자로 처리함 
	public Person() {
	}

	public Person(String name, int kor, int eng, int math) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
