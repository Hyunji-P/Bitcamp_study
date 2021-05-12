// 문제 : PrintMe 클래스를 만들고 이름 , 나이 , 키 , 혈액형을 출력하는 프로그램 작성 할 것 
package pkg0921;

public class PrintMe {

	public static void main(String[] args) {
		String name = " 홍길동 ";
		int age = 27;
		float height = 178.0f;
		double weight = 52.4;
		String blood = "O"; // AB형은 두글자이기 때문에 혈액형을 지정할땐 String을 사용한다.
		boolean bool = true;

		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("혈액형 : " + blood);
		System.out.println("입력 정보가 맞습니까? : " + bool);

	}

}
