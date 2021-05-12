package pkg0922;

public class Test_ArithmeticOperator {

	public static void main(String[] args) {
		/*
		 * 산술 연산자로 시각 구하기 4000초는 1시간, 6분, 40초입니다.(8000초 2시간 13분 20초)) 4000초를 시간, 분, 초를
		 * 구하여 출력해주는 프로그램을 작성하세요.
		 */

		int TIME = 4000; // 상수 선언
		int second;
		int minute;
		int hour;

//		hour = TIME / (60 * 60);
//		minute = (TIME % (60 * 60)) / 60;
//		second = (TIME % (60 * 60)) % 60;
		
		hour = TIME / 3600 ; 
		minute = (TIME % 3600) / 60 ; // 초에서 시간을 제외 
		second = TIME % 60 ;

		System.out.println(TIME + "초는 " + hour + "시간, " + minute + "분, " + second + "초입니다.");
	}

}
