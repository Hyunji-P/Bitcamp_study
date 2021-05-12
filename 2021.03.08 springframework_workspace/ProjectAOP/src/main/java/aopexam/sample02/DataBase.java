package aopexam.sample02;

public class DataBase {
	// 데이터 베이스 저장과 관련된 기능을 별도로 만들었다.
	public static void save(String msg) {
		System.out.println(msg + " 내역을 데이터 베이스에 저장합니다.");
	}

}
