package pkg12;
public class Human{
	private String name; // �̸�
	private String gender; //���� 
	private double tall; // Ű
	private double weight ; // ������
	public Human() {	}
	public String getName() { 
		return this.name;
	}
	public Human(String name, String gender, double tall, double weight) {
		this.name = name ;
		this.gender = gender.equalsIgnoreCase("M") ? "����" : "����"  ;
		this.tall = tall ;
		this.weight = weight ;
		this.output1() ;
	}
	private void output1() {//�Էµ� ��� ���� ������ ����մϴ�.
		String imsi = "" ;
		imsi += "�̸� : " + this.name + ", " ;
		imsi += "���� : " + this.gender + ", " ;
		imsi += "Ű : " + this.tall + ", " ;
		imsi += "������ : " + this.weight ;
		System.out.println( imsi );
	}	
}