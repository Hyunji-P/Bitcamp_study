package pkg1019;

public class MyRectMain {

	public static void main(String[] args) {
		Rect recA = new Rect(2, 3);
		Rect recB = new Rect(3, 2);
		Rect recC = new Rect(3, 4);

		System.out.println(recA == recB);
		// recA와 recB가 바라보고 있는곳(참조) 비교

		// 클래스에는 객체간의 비교를 위하여 equals 라는 메소드를 제공한다.
		// 특히 , String 클래스는 object 클래스의 equals 메소드를
		// 갑 비교를 하기 위하여 미리 오버라이딩 해두었다.

		// equals 는 object 내의 메소드 이고
		// Object obj = Rect(2, 3); Rect(2, 3) → recB → Object obj
		// Object 수퍼 클래스(메소드 O) , Rect 서브 클래스 ((메소드 X)
		// 어떤 메소드가 수퍼클래스에만 존재하는 경우 , 상속을 받고 있으므로 수퍼클래스 메소드 실행

		if (recA.equals(recB)) {//승급
			System.out.println("동일 yes");
		} else {
			System.out.println("동일 no");
		}

		if (recA.equals(recC)) {
			System.out.println("동일 yes");
		} else {
			System.out.println("동일 no");
		}

		if (recB.equals(recC)) {
			System.out.println("동일 yes");
		} else {
			System.out.println("동일 no");

		}

	}
}
