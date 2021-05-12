package pkg1023;

import java.text.DecimalFormat;
import java.util.List;

public class HaksengHtml {
	private List<Hakseng> hakseng;
	DecimalFormat df;
	private int total;
	private double average;

	public HaksengHtml() {
	}

	public HaksengHtml(List<Hakseng> hakseng) {
		String patten = "###.0";
		df = new DecimalFormat(patten);
		this.hakseng = hakseng;

	}

	public void Display() {
		System.out.println("============================출력 결과============================");
		System.out.println("이름\t학년\t반\t국어\t영어\t수학\t총점\t평균");

		for (Hakseng person : hakseng) {
			String imsi = person.getName() + "\t";
			imsi += person.getNo() + "\t";
			imsi += person.getBan() + "\t";
			imsi += person.getKor() + "\t";
			imsi += person.getEng() + "\t";
			imsi += person.getMath() + "\t";

			int total = person.getKor() + person.getEng() + person.getMath();
			double average = (double) total / 3.0;

			imsi += total + "\t";
			imsi += df.format(average) + "\t";

			System.out.println(imsi);
		}
		System.out.println("===============================================================");

	}

}
