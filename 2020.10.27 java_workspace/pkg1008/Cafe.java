package pkg1008;

import java.util.Scanner;

public class Cafe {

	private double totalSum = 0.0; // 총 가격
	private int menuNum;// 메뉴 번호
	private int inOut; // 매장식사인지 테이크 아웃인지 숫자를 나타냄
	private String inOutKorea; // 매장식사인지 테이크 아웃인지 글자를 나타냄
	// 메뉴 이름
	private String[] menuName = { "아메리카노", "카페라떼", "카푸치노", "두유라떼", "샌드위치", "오늘의 추천 메뉴" };
	// 메뉴 정가 가격
	private int[] menuPrice = { 3500, 4000, 4500, 4300, 6000, 3000 };
	Scanner select;

	public Cafe() {
		this.select = new Scanner(System.in);
		this.inputMenu();
		this.calc();

	}

	private void inputMenu() {// 메뉴와 식사방법을 입력받는 메소드
		System.out.println("************<Menu>************");
		System.out.println("1. 아메리카노	      3,500원");
		System.out.println("2. 카페라떼             4,000원");
		System.out.println("3. 카푸치노             4,500원");
		System.out.println("4. 두유라떼             4,300원");
		System.out.println("5. 샌드위치	      6,000원");
		System.out.println("6. 오늘의 추천 메뉴      3,000원");
		System.out.println("******************************");

		System.out.println("어서오세요! 메뉴를 선택하세요.");
		this.menuNum = select.nextInt();
		System.out.println();
		System.out.println("매장식사이면 1번,Take Out이면 2번을 선택하세요.");
		System.out.println("1. 매장식사 , 2. Take Out (15% 할인)");
		System.out.println();
		this.inOut = select.nextInt();

	}

	private void calc() {// 가격을 결정하는 메소드
		if (this.inOut == 1) { // 매장식사
			this.inOutKorea = "매장식사";
			this.totalSum += (double) this.menuPrice[this.menuNum - 1];
		} else if (this.inOut == 2) {// 테이크 아웃
			this.inOutKorea = "테이크 아웃";
			this.totalSum += (double) this.menuPrice[this.menuNum - 1] * (1.0 - 0.15);
		}

	}

	public void Display() {
		System.out.println("[출력 결과]");
		System.out.println("고객님");
		if (this.menuNum == 6) {
			this.menuName[this.menuNum - 1] = "오렌지 주스";
		} else {

		}
		System.out.println("주문 하신 \"" + this.menuName[this.menuNum - 1] + "\" 나왔습니다.");
		System.out.print(this.inOutKorea + "이므로 총 가격은 ");
		System.out.printf("%d원 입니다.\n", (int) this.totalSum / 10 * 10);
		System.out.println("감사합니다.");

	}

}
