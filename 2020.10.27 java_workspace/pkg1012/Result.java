package pkg1012;

//¼­ºê Å¬·¡½º
public class Result extends Sungjuk {
	public Result(String name, int kor, int eng, int math) {
		super.setName(name);
		super.setKor(kor);
		super.setEng(eng);
		super.setMath(math);
	}

	public void getData() {
		int total = super.getKor() + super.getEng() + super.getMath();
		double average = (double) total / 3.0;

		System.out.println("ÃÑÁ¡ : " + total);
		System.out.println("Æò±Õ : " + average);

	}

}
