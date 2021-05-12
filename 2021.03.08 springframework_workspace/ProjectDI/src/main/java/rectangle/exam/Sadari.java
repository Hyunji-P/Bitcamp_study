package rectangle.exam;

public class Sadari implements Rectangle {

	private int base_lower; // 밑변 길이
	private int base_upper; // 윗변 길이
	private int height; // 높이

	
	
	public void setBase_lower(int base_lower) {
		this.base_lower = base_lower;
	}

	public void setBase_upper(int base_upper) {
		this.base_upper = base_upper;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void Print() {
		int area = (this.base_lower + this.base_upper) / 2 * this.height;
		System.out.println("면적 : " + area);

	}

	@Override
	public void Diagonal() {
		// TODO Auto-generated method stub

	}

}
