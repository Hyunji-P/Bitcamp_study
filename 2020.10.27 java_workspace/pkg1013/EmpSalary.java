package pkg1013;

public class EmpSalary {

	public static void main(String[] args) {
		System.out.println("대표 이사 이름 : " + Employee.ceoname);
		// Employee.ceoname은 클래스 이름으로 접근하므로 static 변수
		// tip ) 클래스 이름에 빨간 밑줄 → create 선택 시 자동 클래스 생성

		Employee hong = new Employee("홍길동", 10000, "영업");
		// tip ) new + "띄어쓰기" + ctrl + space → 해당 생성자 선택 가능
		// tip ) 생성자 이름에 빨간 밑줄 → create 선택 시 자동 클래스 생성

		hong.Display();

		Employee hee = new Employee("박영희", 10000, "구매");
		hee.Display();

		Employee soo = new Employee("김철수", "광고");
		soo.Display();
		
		System.out.println(hong.hashCode());
		System.out.println(hee.hashCode());
		System.out.println(soo.hashCode());
		
		System.out.println(hong.getClass());
		System.out.println(hong.toString());
		System.out.println(hong);
	}

}
