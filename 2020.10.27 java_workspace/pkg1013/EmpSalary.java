package pkg1013;

public class EmpSalary {

	public static void main(String[] args) {
		System.out.println("��ǥ �̻� �̸� : " + Employee.ceoname);
		// Employee.ceoname�� Ŭ���� �̸����� �����ϹǷ� static ����
		// tip ) Ŭ���� �̸��� ���� ���� �� create ���� �� �ڵ� Ŭ���� ����

		Employee hong = new Employee("ȫ�浿", 10000, "����");
		// tip ) new + "����" + ctrl + space �� �ش� ������ ���� ����
		// tip ) ������ �̸��� ���� ���� �� create ���� �� �ڵ� Ŭ���� ����

		hong.Display();

		Employee hee = new Employee("�ڿ���", 10000, "����");
		hee.Display();

		Employee soo = new Employee("��ö��", "����");
		soo.Display();
		
		System.out.println(hong.hashCode());
		System.out.println(hee.hashCode());
		System.out.println(soo.hashCode());
		
		System.out.println(hong.getClass());
		System.out.println(hong.toString());
		System.out.println(hong);
	}

}
