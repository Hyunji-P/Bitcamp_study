package pkg1005;

public class Variable {
	static int x ; //static 변수 
	int y = 200;//인스턴스 변수
	final double pi = 3.14;// 상수
	
	void hohoho(String msg) {
		//매개변수 msg = 지역변수
		int z; //지역 변수 
		z = 300;//기본값이 없기 떄문에 반드시 초기화 필요 
		System.out.println(z);
		System.out.println(msg);
		
		//pi = 5.14; // 오류 
		System.out.println(5.14);
	}

}
