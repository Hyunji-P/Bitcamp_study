package pkg1023;

public class Person {

	//���� bean Ŭ����
	//bean 
	//�ݺ����� �۾��� ȿ�������� �ϱ� ���� ��� 
	//JAVA ����� ������(�Ӽ�)�� ���(�޼ҵ�)�� �̷���� Ŭ������ ���� 
	//������� , ȸ������ �Խ��� �� ���� ������ ����� �� ������ �����ϰ� �ִ� �ڹٺ� ��ü�� ����ϰ� �ȴ�.
	private String name;
	private int kor;
	private int eng;
	private int math;

	//�����α׷��� �Ҷ��� �� �����ڷ� ó���� 
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
