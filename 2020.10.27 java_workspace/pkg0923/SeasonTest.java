package pkg0923;

public class SeasonTest {

	public static void main(String[] args) {
		// 계절 출력하기
		// 9월은 "가을"입니다.

		int month = 8;
		String Season = "";

		if (month >= 9 && month <= 11) {
			Season = "가을";

		} else if (month >= 12 && month <= 2) {
			Season = "겨울";

		} else if (month >= 3 && month <= 5) {
			Season = "봄";

		} else {
			Season = "여름";

		}

		System.out.println(month + "월은 \"" + Season + "\"입니다.");

		// switch case로 계절 출력하기
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		default:
			System.out.println("존재하지 않는 월입니다.");
			break;
		}

	}
}
