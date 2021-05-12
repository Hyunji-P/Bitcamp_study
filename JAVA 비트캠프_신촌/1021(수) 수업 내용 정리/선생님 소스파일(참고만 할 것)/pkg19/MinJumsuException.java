package pkg19;

public class MinJumsuException extends Exception{
	private String subject ; //���� ����
	private int jumsu ; //������ ���� ����
	
	public MinJumsuException(String subject, int jumsu) {
		this.subject = subject ;
		this.jumsu = jumsu ;
	}
	@Override
	public String getMessage() {	
		return this.subject + " ���� ������ �ϼ���." ;
	}
	@Override
	public String toString() {	
		return this.subject + " " + this.jumsu + "�� �����̱���.\n���� �й��ϼ���." ;
	}
}