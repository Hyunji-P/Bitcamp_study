package mycomputer;

public class MainProgram02 {
	public static void main(String[] args) {
		Programmer02 soo = new Programmer02("김철수", "용산구 도원동") ;
		System.out.println(soo.toString());
		System.out.println("================================");
		OfficeWorker02 hee = new OfficeWorker02("박영희", "마포구 공덕동") ;
		System.out.println(hee.toString());
	}
}

