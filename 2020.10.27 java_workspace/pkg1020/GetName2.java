package pkg1020;

public class GetName2 {
//풀이 절차
//카운트 변수(cnt)를 선언하고 초기화한다.
//찾고자 하는 단어가 발견된 위치(idx) 변수를 정의하고 초기화 한다.
//찾고자 하는 단어의 길이에 대한 변수를 정의하고 초기화 한다.
//무한 루프 while 반복문을 사용하여 찾을 단어 검색을 한다.(indexOf()메소드)
//발견이 되었다면 카운트 변수를 1 더해 준다.
//	발견된 문자열은 잘라서 없애 버린다.(subString()메소드)
//발견이 안되었다면 break 구문으로 빠져 나간다.

	public static void main(String[] args) {
		final String what = "강호동";

		String str = "강호동강호동유재석김철수강호동";
		System.out.println("문자열 원본 : " + str);

		int cnt = 0; // 카운트 변수
		int len = what.length();// 찾고자 하는 문자열 길이
		int idx = 0; // 발견된 위치

		while (true) {
			idx = str.indexOf(what);
//			System.out.println(idx);
			if (idx == -1) {
				System.out.println("더 이상 존재하지 않습니다.");
				break;
			} else {
				//idx + len 
				//1. "강호동강호동유재석김철수강호동" ---> 강호동은 0번째부터 나옴 , idx = 0;
				//2. index 가 3번째 부터 다시 문자열나오게 해야함(즉 , 0부터 2번째는 버림)
				//3. idx + len = 0 + 3; (ex, 안녕안녕이면 0 + 4(len)전까지 버림)
				//4. 따라서 substring메소드를 이용하여 글자 추출 
				str = str.substring(idx + len);
				System.out.println(str);
				cnt++;
				
				
			}

		}
		System.out.println("문자열 \'" + what + "\'은 " + cnt + "번 발견 되었습니다.");

	}

}
