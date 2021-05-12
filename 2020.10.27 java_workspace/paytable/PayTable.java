package paytable;

import java.text.DecimalFormat;

//main 클래스
public class PayTable extends MySalary implements Output, Calculate {

	public static void main(String[] args) {
		PayTable[] pt = new PayTable[3];

		pt[0] = new PayTable("소서노", 750000, 2, 3);
		pt[1] = new PayTable("고주몽", 800000, 1, 4);
		pt[2] = new PayTable("모팔모", 650000, 6, 2);

		MySalary.incentive = 0.7;

		for (int i = 0; i < pt.length; i++) {
			System.out.println("========================");
			pt[i].calc();
			pt[i].out();
		}

	}

	public PayTable() {
	}

	public PayTable(String name, int pay, int family, int overtime) {
		super(name, pay, family, overtime);

	}

	@Override
	public void calc() {
		double imsi = 0.0;
		if (super.getFamily() < 3) {
			imsi = super.getFamily() * 20000;
		} else {
			imsi = 60000;
		}
		super.setFamily_p(imsi);

		imsi = 0.0;
		imsi += super.getOvertime() * 5000;
		super.setOvertime_p(imsi);

		imsi = 0.0;
		imsi += super.getPay() * 0.1;
		super.setTax(imsi);

		imsi = 0.0;
		imsi += this.incentive * super.getPay();
		super.setIncen_p(imsi);

		imsi = 0.0;
		imsi += super.getPay() + super.getFamily_p();
		imsi += super.getIncen_p() + super.getOvertime_p(); 
		imsi -= super.getTax();
		super.setTotal_pay(imsi);

	}

	@Override
	public void out() {
		String pattern = ",000";
		DecimalFormat dec = new DecimalFormat(pattern);

		System.out.println("[\'"+ this.getName() + "\'님의 급여 명세서]");
		System.out.println("이름 : " + this.getName());
		System.out.println("기본급 : " + dec.format(this.getPay()) + "원");
		System.out.println("가족수 : " + this.getFamily()+"명");
		System.out.println("가족 수당 : " + dec.format(this.getFamily_p()) + "원");
		System.out.println("시간 외 근무 : " + this.getOvertime()+"시간");
		System.out.println("시간 외 수당 : " + dec.format(this.getOvertime_p()) + "원");
		System.out.println("세금 : " + dec.format(this.getTax()) + "원");
		System.out.println("성과금 : " + dec.format(this.getIncen_p())+ "원");
		System.out.println("실수령액 : " + dec.format(this.getTotal_pay())+ "원");

	}

}
