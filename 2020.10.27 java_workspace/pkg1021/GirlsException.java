package pkg1021;

public class GirlsException extends Exception {
	private String message; // ����ڰ� �Ѱ��ִ� �޼��� ���ڿ�

	public GirlsException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		String imsi = "�޼��� ���� : " + this.message;
		return imsi;
	}

	@Override
	public String toString() {
		String imsi = "���ڿ� ��� : " + this.message;
		return imsi;
	}

}
