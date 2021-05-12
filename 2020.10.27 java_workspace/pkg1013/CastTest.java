package pkg1013;

public class CastTest {

	// 기본 자료형 예시
	public static void main(String[] args) {

		// implicit casting(암시적 형변환)
		// 시스템이 정수 5를 실수형 변수 d에 대입하기 전에 스스로 알아서 5.0으로 형변환
		double d = 5;
		System.out.println(d);

		// explicit casting(명시적 형변환)
		// 큰 범주의 데이터를 작은 범주의 데이터로 변경시에는 반드시 명시적 형변환을 해줘야 한다.
		// 소수점 부분은 무조건 버린다.
		int i = (int) 3.14;

		System.out.println(i);

	}

}
