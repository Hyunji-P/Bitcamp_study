package pkg19;
public class GirlException extends Exception {
	private String message ; //����ڰ� �Ѱ� �ִ� �޽��� ���ڿ�
	public GirlException(String message) {
		super();
		this.message = message;
	}
	@Override
	public String getMessage() {
		String imsi = "�޽��� ���� : "+ this.message ;
		return imsi;
	}
	@Override
	public String toString() {	
		String imsi = "���ڿ� ��� : "+ this.message ;
		return imsi;
	}
}