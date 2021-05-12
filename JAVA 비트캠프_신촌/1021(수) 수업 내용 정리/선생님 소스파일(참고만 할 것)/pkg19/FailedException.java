package pkg19;

import java.text.DecimalFormat;

public class FailedException extends Exception{
	private int total ;
	public FailedException( int total ) {
		super("��� ���� ����(" + total + "��)") ;
		this.total = total ;
	}
	@Override
	public String getMessage() {	
		DecimalFormat df =  new DecimalFormat("##.000") ;
		return "��� ������ " + df.format(this.total/3) + "�Դϴ�." ;
	}
//	@Override
//	public String toString() {	
//		return "���� ���ڿ� : " + this.total ;
//	}
}