package pkg1023;

import java.text.DecimalFormat;
import java.util.List;

public class PersonHtml {
	// persons에 세사람 정보가 들어가 있음
	private List<Person> persons;
	private DecimalFormat df = null;

	// 생성자의 목적 : 무언가를 초기화
	public PersonHtml(List<Person> persons) {
		String pattern = "###.00";
		this.df = new DecimalFormat(pattern);
		
		this.persons = persons;
	}

	// 실제 html
	public void SelectAll() {
		System.out.println("확장 for로 모든 멤버 출력하기");
		for (Person saram : persons) {
			String name = saram.getName();
			int kor = saram.getKor();
			int eng = saram.getEng();
			int math = saram.getMath();

			double total = kor + eng + math;
			double average = total / 3.0;

			String imsi = name + "/" + kor;
			imsi += "/" + eng;
			imsi += "/" + math;
			imsi += "/" + this.df.format(total) + "/" + this.df.format(average);
			System.out.println(imsi);

		}

	}

}
