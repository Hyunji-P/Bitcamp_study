package pkg12;
public class Health extends Human{
	private double s_weight = 0.0 ; //표준 체중
	private double fat = 0.0 ; //비만도
	private String result = null ; //결과 값

	public Health(String name, String gender, double tall, double weight) {
		super(name, gender, tall, weight);
		this.calculate( tall, gender, weight );
		this.output2() ;
	}
	private void output2() {//비만도 측정 결과를 출력합니다
		String imsi = super.getName() + "님은 비만도가 %.3f이고, " + result + "입니다.\n" ;
		System.out.printf( imsi, this.fat  );
	}
	private void calculate( double tall, String gender, double weight ) {//비만도 계산
		//fatrate : 비만도 사용할 때 쓰는 률(rate)
		double fatrate = gender.equalsIgnoreCase("M") ? 0.9 : 0.85  ;
		this.s_weight = ( tall - 100.0) * fatrate ;		
		this.fat = weight / s_weight ;//*100 ;
		
		if( this.fat >= 1.5 ){
			this.result = "고도 비만" ;
		}else if( this.fat >= 1.31 ){
			this.result = "중도 비만" ;
		}else if( this.fat >= 1.21 ){
			this.result = "경도 비만" ;
		}else if( this.fat >= 1.11 ){
			this.result = "과체중" ;
		}else if( this.fat >= 0.91 ){
			this.result = "정상(표준 체중)" ;
		}else{
			this.result = "저체중" ;
		}
	}	
}