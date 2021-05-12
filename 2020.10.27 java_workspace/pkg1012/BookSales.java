package pkg1012;
//입력 예시 

//품목 : 자바
//수량 : 2
//단가 : 30000

//품목 : JSP
//수량 : 4
//단가 : 20000

//할인율 : 15%

//출력 예시
//총 판매 권수 : 6
//1번째 서적
//자바 : 51000.0원
//2번째 서적
//JSP : 68000.0원

public class BookSales {

	public static void main(String[] args) {
		Sales[] mybook = new Sales[2]; // 배열 정의

		Book.discount = 0.15;

		for (int i = 0; i < mybook.length; i++) {
			mybook[i] = new Sales(); // 객체 생성
		}

		System.out.println("총 판매 권 수 : " + Book.count);

		for (int i = 0; i < mybook.length; i++) {
			mybook[i].Display();
		}

	}

}
