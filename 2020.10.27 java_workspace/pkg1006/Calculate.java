package pkg1006;

//��Ģ ����
//��Ģ ������ �������ִ� Calculate Ŭ���� ���α׷��� �ۼ��ϼ���.
//��, �������� �� �� 0���� ������ ��� ���� 5�� ��ü �ϵ��� �Ѵ�.
//��, ������ ���� �����ڴ� private���� �����մϴ�.
//getter�� setter�� �����ڰ� �ʿ��Ѹ�ŭ ����ø� �˴ϴ�.

public class Calculate {

	private int add;
	private int sub;
	private int mul;
	private double div;

	public void setAdd(int x, int y) {
		add = x + y;
	}

	public int getAdd() {
		return add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int x, int y) {
		sub = x - y;
	}

	public int getMul() {
		return mul;
	}

	public void setMul(int x, int y) {
		mul = x * y;
	}

	public double getDiv() {
		return div;
	}

	public void setDiv(int x, int y) {
		if (y == 0) {
			y = 5;
		}
		div = (double) x / y;

	}

}