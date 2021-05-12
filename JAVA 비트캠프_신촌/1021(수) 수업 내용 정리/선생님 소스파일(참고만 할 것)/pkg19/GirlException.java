package pkg19;
public class GirlException extends Exception {
	private String message ; //사용자가 넘겨 주는 메시지 문자열
	public GirlException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		String imsi = "메시지 내용 : "+ this.message ;
		return imsi;
	}
	@Override
	public String toString() {	
		String imsi = "문자열 결과 : "+ this.message ;
		return imsi;
	}
}