package pkg1006;

//������ ���� ��µǵ��� Hakseng, HaksengMain Ŭ������ ������ ������.
//���� �̸� �� �޼ҵ��� �̸� ���� ������ ���Ƿ� �����ϵ��� �Ѵ�.
//��, ������ ���� �����ڴ� private���� �����մϴ�.
//getter�� setter�� �����ڰ� �ʿ��Ѹ�ŭ ����ø� �˴ϴ�.
//
//�л� �̸� : ȫ�浿
//�г�/�� : 1/3
//���� : 100
//���� : 60
//���� : 76
//���� : 236
//��� : 78.67 

public class Hakseng {
	private String name = "ȫ�浿";
	private int schoolyear = 3;
	private int ban = 1;// ��
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
		System.out.println("���� : " + sum);
	}

	public void setAvg(int kor, int eng, int math) {
		int cnt = 3;
		avg = (double) sum / cnt;
		System.out.println("��� : " + avg);
	}

}
