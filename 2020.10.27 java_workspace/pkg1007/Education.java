package pkg1007;

public class Education {
	private String name;
	final String sosok = "IT 교육 센터";
	private String subject;
	private double addfee;
	private int add_refund;

	public Education(String name, String subject, double addfee) {
		this.name = name;
		this.subject = subject;
		this.addfee = addfee;
		this.add_refund = 3000;
		this.calc();

	}

	public Education(String name, String subject, double addfee, double rate) {
		this.name = name;
		this.subject = subject;
		this.addfee = addfee;
		if (rate >= 80) {
			this.add_refund = 3000;
		} else {
			this.add_refund = 1000;
		}

		this.calc();

	}

	public double calc() {
		double result = 0.0;

		String str1 = new String("JAVA");
		String str2 = new String("JSP");
		String str3 = new String("JDBC");

		if (str1.equalsIgnoreCase(this.subject)) {
			result = this.addfee * 0.25 + this.add_refund;// java
		} else if (str2.equalsIgnoreCase(this.subject)) {
			result = this.addfee * 0.15 + this.add_refund;// jsp
		} else if (str3.equalsIgnoreCase(this.subject)) {
			result = this.addfee * 0.20 + this.add_refund;// jdbc
		}

		return result;
	}

	public void Display() {
		System.out.println("수강생 : " + this.name);
		System.out.println("교육 센터 : " + this.sosok);
		System.out.println("수강 과목 : " + this.subject);
		System.out.println("교육비 : " + this.addfee);
		System.out.println("환급금 : " + this.calc());
		System.out.println();
	}

}
