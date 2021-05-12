package pkg19;

import java.text.DecimalFormat;

public class FailedException extends Exception{
	private int total ;
	public FailedException( int total ) {
		super("평균 이하 점수(" + total + "점)") ;
		this.total = total ;
	}
	@Override
	public String getMessage() {	
		DecimalFormat df =  new DecimalFormat("##.000") ;
		return "평균 점수가 " + df.format(this.total/3) + "입니다." ;
	}
//	@Override
//	public String toString() {	
//		return "예외 문자열 : " + this.total ;
//	}
}