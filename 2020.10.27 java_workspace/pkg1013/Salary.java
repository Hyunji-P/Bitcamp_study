package pkg1013;

//������ : 1�� , �Ű����� : 0��
public class Salary {
	private int salay = 3000;// �޿�
	private String department;// �μ��̸�
	private String name; // ��� �̸�

	public Salary() {
		//�����ϰ� �ϳ� �����д�. 
		//why? ����Ŭ������ ��� �����ڴ� super() �Ű������� ���� �����ڰ� ������ ����
		//�ڹٴ� �� ����̱� ������ ����ϴ� ���ϴ� ���������� �ۼ��صδ� �� ���� ��
	}

	public Salary(String name, int salary, String department) {
		this.name = name;
		this.salay = salary;
		this.department = department;
	}

	public Salary(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public void Display() {
		int bae = 0;
		if (this.department.equals("����") || this.department.equals("�Ǹ�")) {
			bae = 15;
		} else {
			bae = 12;
		}

		String imsi = this.name + "(" + this.department + ")";
		imsi += ", �޿� : " + this.salay;
		imsi += ", ���� : " + (bae * this.salay);
		System.out.println(imsi);

	}

}
