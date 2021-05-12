package pkg1021;

public class LottoException extends Exception {
	private int lotto;

	public LottoException(String message, int lotto) {
		super(message);// '�߸��� �ζ� ��ȣ' �� ����Ŭ������ ����
		this.lotto = lotto;
	}

	@Override
	public String toString() {
		String imsi = this.lotto + "��(��) ������ �ִ� ��ȣ �Դϴ�.";
		return super.toString() + "\n" + imsi;
		// super.toString() : throwable �� ó�� , imsi : �������̵��� ó��
	}

	// ���ڿ� : pkg1021.LottoException: �߸��� �ζ� ��ȣ
	// ������� '�߸��� �ζ� ��ȣ'�� ������ ���� : superŬ������ message�� ������ Exception�� ������ �ְ�,
	// Exception�� ���� Ŭ������ throwable Ŭ������ ���� 
	// ����� throwable Ŭ������ message�� �����Ѵ�.
	// toString() �޼ҵ�� ���ܰ�ü�� ������ �ִ� ��� ���ڿ��� �����ϹǷ� ��� + ���ڿ� ������

	// �޼��� : �߸��� �ζ� ��ȣ
	// �� Exception ���� Ŭ������ ó��
	// ����Ŭ������ ���� message���� throwable�� ������ �ְ�
	// throwable Ŭ�������� getMessage() �޼ҵ尡 ���ԵǾ� �����Ƿ�
	// ��Ӱ��迡�� ����Ŭ����(throwable) �޼ҵ尡 ȣ���
}
