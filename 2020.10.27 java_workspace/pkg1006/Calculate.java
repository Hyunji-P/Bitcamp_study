package pkg1006;

//사칙 연산
//사칙 연산을 수행해주는 Calculate 클래스 프로그램을 작성하세요.
//단, 나눗셈을 할 때 0으로 나누는 경우 숫자 5로 대체 하도록 한다.
//단, 변수의 접근 지정자는 private으로 지정합니다.
//getter와 setter는 개발자가 필요한만큼 만드시면 됩니다.

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