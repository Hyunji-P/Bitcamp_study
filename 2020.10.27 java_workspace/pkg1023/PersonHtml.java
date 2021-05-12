package pkg1023;

import java.text.DecimalFormat;
import java.util.List;

public class PersonHtml {
	// persons�� ����� ������ �� ����
	private List<Person> persons;
	private DecimalFormat df = null;

	// �������� ���� : ���𰡸� �ʱ�ȭ
	public PersonHtml(List<Person> persons) {
		String pattern = "###.00";
		this.df = new DecimalFormat(pattern);
		
		this.persons = persons;
	}

	// ���� html
	public void SelectAll() {
		System.out.println("Ȯ�� for�� ��� ��� ����ϱ�");
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
