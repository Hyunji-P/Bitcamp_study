package paytable;

import java.text.DecimalFormat;

//main Ŭ����
public class PayTable extends MySalary implements Output, Calculate {

	public static void main(String[] args) {
		PayTable[] pt = new PayTable[3];

		pt[0] = new PayTable("�Ҽ���", 750000, 2, 3);
		pt[1] = new PayTable("���ָ�", 800000, 1, 4);
		pt[2] = new PayTable("���ȸ�", 650000, 6, 2);

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

		System.out.println("[\'"+ this.getName() + "\'���� �޿� ����]");
		System.out.println("�̸� : " + this.getName());
		System.out.println("�⺻�� : " + dec.format(this.getPay()) + "��");
		System.out.println("������ : " + this.getFamily()+"��");
		System.out.println("���� ���� : " + dec.format(this.getFamily_p()) + "��");
		System.out.println("�ð� �� �ٹ� : " + this.getOvertime()+"�ð�");
		System.out.println("�ð� �� ���� : " + dec.format(this.getOvertime_p()) + "��");
		System.out.println("���� : " + dec.format(this.getTax()) + "��");
		System.out.println("������ : " + dec.format(this.getIncen_p())+ "��");
		System.out.println("�Ǽ��ɾ� : " + dec.format(this.getTotal_pay())+ "��");

	}

}
