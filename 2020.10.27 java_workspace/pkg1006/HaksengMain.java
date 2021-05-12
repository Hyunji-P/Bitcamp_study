package pkg1006;

public class HaksengMain {

	public static void main(String[] args) {
		Hakseng jumsu = new Hakseng();

		System.out.println("학년이름 : " + jumsu.getName());
		System.out.println("학년/반 : " + jumsu.getSchoolyear() + "/" + jumsu.getBan());
		System.out.println("국어 : " + jumsu.getKor());
		System.out.println("영어 : " + jumsu.getEng());
		System.out.println("수학 : " + jumsu.getMath());
		jumsu.setSum(80, 70, 25);
		jumsu.setAvg(80, 70, 25);
		
		

	}

}
