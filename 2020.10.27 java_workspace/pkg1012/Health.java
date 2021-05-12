package pkg1012;

//서브클래스
public class Health extends Human {
	private double s_weight = 0.0; // 표준체중
	private double fat = 0.0;// 비만도
	private String result = null;// 결과 값

	// 슈퍼 클래스에 Data를 담기
	public Health(String name, String gender, double tall, double weight) {
		super(name, gender, tall, weight);
		this.calculate();
		this.output2();
	}

	// 비만도 관련 모든 요소들 계산하기
	private void calculate() {
		// 표준 체중 계산
		if (super.getGender().equals("M")) {// 남성
			this.s_weight = (super.getTall() - 100.0) * 0.9;
		} else {// 여성
			this.s_weight = (super.getTall() - 100.0) * 0.85;
		}

		// 비만도 계산
		this.fat = super.getWeight() / this.s_weight * 100;

		if (this.fat > 150.0) {
			this.result = "고도 비만";
		} else if (this.fat > 130.0) {
			this.result = "중도 비만";
		} else if (this.fat > 120.0) {
			this.result = "경도 비만";
		} else if (this.fat > 110.0) {
			this.result = "과체중";
		} else if (this.fat > 90.0) {
			this.result = "정상(표준 체중)";
		} else {
			this.result = "저체중";
		}
	}

	// 비만도 측정 결과 출력하기
	private void output2() {
		String imsi = "%s님은 비만도가 %.3f이고 , %s입니다.";
		System.out.printf(imsi + "\n", super.getName(), this.fat / 100.0, this.result);
	}

}
