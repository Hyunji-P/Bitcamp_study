package pkg1005;

import java.util.Scanner;

public class MonthMain {

	public static void main(String[] args) {
		// 영문 월 출력하기
		Month[] month = new Month[12];

		for (int i = 0; i < month.length; i++) {
			month[i] = new Month();
		}

		month[0].EngMonth = "January";
		month[1].EngMonth = "February";
		month[2].EngMonth = "March";
		month[3].EngMonth = "April";
		month[4].EngMonth = "May";
		month[5].EngMonth = "June";
		month[6].EngMonth = "July";
		month[7].EngMonth = "August";
		month[8].EngMonth = "September";
		month[9].EngMonth = "October";
		month[10].EngMonth = "November";
		month[11].EngMonth = "December";

		Scanner scan = new Scanner(System.in);
		System.out.print("월에 해당하는 숫자를 입력하세요 : ");

		int num = scan.nextInt();
		month[num - 1].show();

	}

}
