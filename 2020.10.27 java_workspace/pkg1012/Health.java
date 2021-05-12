package pkg1012;

//����Ŭ����
public class Health extends Human {
	private double s_weight = 0.0; // ǥ��ü��
	private double fat = 0.0;// �񸸵�
	private String result = null;// ��� ��

	// ���� Ŭ������ Data�� ���
	public Health(String name, String gender, double tall, double weight) {
		super(name, gender, tall, weight);
		this.calculate();
		this.output2();
	}

	// �񸸵� ���� ��� ��ҵ� ����ϱ�
	private void calculate() {
		// ǥ�� ü�� ���
		if (super.getGender().equals("M")) {// ����
			this.s_weight = (super.getTall() - 100.0) * 0.9;
		} else {// ����
			this.s_weight = (super.getTall() - 100.0) * 0.85;
		}

		// �񸸵� ���
		this.fat = super.getWeight() / this.s_weight * 100;

		if (this.fat > 150.0) {
			this.result = "�� ��";
		} else if (this.fat > 130.0) {
			this.result = "�ߵ� ��";
		} else if (this.fat > 120.0) {
			this.result = "�浵 ��";
		} else if (this.fat > 110.0) {
			this.result = "��ü��";
		} else if (this.fat > 90.0) {
			this.result = "����(ǥ�� ü��)";
		} else {
			this.result = "��ü��";
		}
	}

	// �񸸵� ���� ��� ����ϱ�
	private void output2() {
		String imsi = "%s���� �񸸵��� %.3f�̰� , %s�Դϴ�.";
		System.out.printf(imsi + "\n", super.getName(), this.fat / 100.0, this.result);
	}

}
