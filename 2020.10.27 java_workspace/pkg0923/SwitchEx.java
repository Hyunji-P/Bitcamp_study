package pkg0923;

public class SwitchEx {
// 다시 풀어볼 것 
	public static void main(String[] args) {

		String name = "홍길동";
		String grade = "C";

		String temp = ""; // 경품

//		switch (grade) {
//		case "A":
//			System.out.println("등급 : " + grade);
//			System.out.println(name + "님 축하합니다.\n강남빌딩, 고급승용차, 노트북을 드립니다!");
//
//			break;
//
//		case "B":
//			System.out.println("등급 : " + grade);
//			System.out.println(name + "님 축하합니다.\n고급승용차, 노트북을 드립니다!");
//			break;
//		case "C":
//			System.out.println("등급 : " + grade);
//			System.out.println(name + "님 축하합니다.\n노트북을 드립니다!");
//			break;

//		switch (grade) {
//		case "A":
//			temp = "강남빌딩 , 고급승용차 , 노트북";
//			break;
//
//		case "B":
//			temp = "고급승용차 , 노트북";
//			break;
//
//		case "C":
//			temp = "노트북";
//			break;
//
//		}
//		System.out.println(temp);

		System.out.println("케이스 02");
		temp = ""; // 경품

		switch (grade) {
		case "A":
			temp += "강남빌딩 , ";
		case "B":
			temp += "고급 승용차 , ";
		case "C":
			temp += "노트북";

		}
		System.out.println("경품 : " + temp); // 각 CASE 마다 break 를 실행하지않기때문에 
											 // 해당하는 CASE를 만나면 밑에 있는 구문까지 모두 다 실행된다.
	}
}
