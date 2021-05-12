package pkg1006;

//다음과 같이 출력되도록 Hakseng, HaksengMain 클래스를 구현해 보세요.
//변수 이름 및 메소드의 이름 등은 개발자 임의로 지정하도록 한다.
//단, 변수의 접근 지정자는 private으로 지정합니다.
//getter와 setter는 개발자가 필요한만큼 만드시면 됩니다.
//
//학생 이름 : 홍길동
//학년/반 : 1/3
//국어 : 100
//영어 : 60
//수학 : 76
//총점 : 236
//평균 : 78.67 

public class Hakseng {
	private String name = "홍길동";
	private int schoolyear = 3;
	private int ban = 1;// 반
	private int kor = 80;
	private int eng = 70;
	private int math = 25;
	private int sum;
	private double avg;

	public String getName() {
		return name;
	}

	public int getSchoolyear() {
		return schoolyear;
	}

	public int getBan() {
		return ban;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setSum(int kor, int eng, int math) {
		sum = kor + eng + math;
		System.out.println("총점 : " + sum);
	}

	public void setAvg(int kor, int eng, int math) {
		int cnt = 3;
		avg = (double) sum / cnt;
		System.out.println("평균 : " + avg);
	}

}
