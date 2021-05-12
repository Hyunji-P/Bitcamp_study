package pkg1021;

public class LottoException extends Exception {
	private int lotto;

	public LottoException(String message, int lotto) {
		super(message);// '잘못된 로또 번호' 를 수퍼클래스에 던짐
		this.lotto = lotto;
	}

	@Override
	public String toString() {
		String imsi = this.lotto + "는(은) 문제가 있는 번호 입니다.";
		return super.toString() + "\n" + imsi;
		// super.toString() : throwable 이 처리 , imsi : 오버라이딩이 처리
	}

	// 문자열 : pkg1021.LottoException: 잘못된 로또 번호
	// 결과값이 '잘못된 로또 번호'가 나오는 이유 : super클래스로 message를 던져서 Exception이 가지고 있고,
	// Exception은 상위 클래스인 throwable 클래스로 던짐 
	// 결론은 throwable 클래스에 message가 존재한다.
	// toString() 메소드는 예외객체가 가지고 있는 모든 문자열을 추출하므로 경로 + 문자열 추출함

	// 메세지 : 잘못된 로또 번호
	// ↑ Exception 수퍼 클래스가 처리
	// 수퍼클래스에 던진 message값을 throwable이 가지고 있고
	// throwable 클래스내에 getMessage() 메소드가 포함되어 있으므로
	// 상속관계에서 수퍼클래스(throwable) 메소드가 호출됨
}
