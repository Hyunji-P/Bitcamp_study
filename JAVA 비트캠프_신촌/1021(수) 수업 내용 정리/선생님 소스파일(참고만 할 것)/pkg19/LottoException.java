package pkg19;
public class LottoException extends Exception {
	private int lotto ;
	
	public LottoException(String message, int lotto) {		
		super(message) ;
		this.lotto = lotto ;
	}
	@Override
	public String toString() {
		String imsi = this.lotto + "��(��) ������ �ִ� ��ȣ�Դϴ�."   ;
		return super.toString() + "\n" + imsi  ;
	}
}