package pkg0923;

public class Test_StringSwitch {
//	숫자를 이용하여 다음과 같이 출력하는 프로그램을 작성하세요. 
//	int month = 2 ; 
//
//	파일 이름 : StringSwitch.java
//
//	출력 예시) 2월은 'february'입니다.

	public static void main(String[] args) {
		int month = 10;
		String M = "";

		switch (month) {
		case 1:
			M = "January";
			break;
		case 2:
			M = "February";
			break;
		case 3:
			M = "March";
			break;
		case 4:
			M = "April";
			break;
		case 5:
			M = "May";
			break;
		case 6:
			M = "June";
			break;
		case 7:
			M = "July";
			break;
		case 8:
			M = "August";
			break;
		case 9:
			M = "September";
			break;
		case 10:
			M = "October";
			break;
		case 11:
			M = "November";
			break;
		case 12:
			M = "December";
			break;
		default : 
			M = "Error";
			break;
		}

		System.out.println(month + "월은 \'" + M + "\'입니다.");

	}

}
