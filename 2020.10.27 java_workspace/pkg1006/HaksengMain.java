package pkg1006;

public class HaksengMain {

	public static void main(String[] args) {
		Hakseng jumsu = new Hakseng();

		System.out.println("�г��̸� : " + jumsu.getName());
		System.out.println("�г�/�� : " + jumsu.getSchoolyear() + "/" + jumsu.getBan());
		System.out.println("���� : " + jumsu.getKor());
		System.out.println("���� : " + jumsu.getEng());
		System.out.println("���� : " + jumsu.getMath());
		jumsu.setSum(80, 70, 25);
		jumsu.setAvg(80, 70, 25);
		
		

	}

}
