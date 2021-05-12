package pkg1019;

//사각형 
public class Rect {
	int width;// 가로
	int height;// 세로

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	// 면적을 구하여 값을 비교해야하므로
	// equals() 메소드를 오버라이딩 하여 내 입맛 대로 바꾸겠다.

	@Override
	public boolean equals(Object obj) {
		// 두 객체의 면적이 동일하면 true 를 반환
		// obj = recB , recA는 실행 주체이기 때문에 this
		Rect target = (Rect) obj;// 강등
		boolean result = (this.width * this.height == target.width * target.height);
		return result;
	}

}
