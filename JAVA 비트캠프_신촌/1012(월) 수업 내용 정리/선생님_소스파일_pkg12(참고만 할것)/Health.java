package pkg12;
public class Health extends Human{
	private double s_weight = 0.0 ; //ǥ�� ü��
	private double fat = 0.0 ; //�񸸵�
	private String result = null ; //��� ��

	public Health(String name, String gender, double tall, double weight) {
		super(name, gender, tall, weight);
		this.calculate( tall, gender, weight );
		this.output2() ;
	}
	private void output2() {//�񸸵� ���� ����� ����մϴ�
		String imsi = super.getName() + "���� �񸸵��� %.3f�̰�, " + result + "�Դϴ�.\n" ;
		System.out.printf( imsi, this.fat  );
	}
	private void calculate( double tall, String gender, double weight ) {//�񸸵� ���
		//fatrate : �񸸵� ����� �� ���� ��(rate)
		double fatrate = gender.equalsIgnoreCase("M") ? 0.9 : 0.85  ;
		this.s_weight = ( tall - 100.0) * fatrate ;		
		this.fat = weight / s_weight ;//*100 ;
		
		if( this.fat >= 1.5 ){
			this.result = "�� ��" ;
		}else if( this.fat >= 1.31 ){
			this.result = "�ߵ� ��" ;
		}else if( this.fat >= 1.21 ){
			this.result = "�浵 ��" ;
		}else if( this.fat >= 1.11 ){
			this.result = "��ü��" ;
		}else if( this.fat >= 0.91 ){
			this.result = "����(ǥ�� ü��)" ;
		}else{
			this.result = "��ü��" ;
		}
	}	
}