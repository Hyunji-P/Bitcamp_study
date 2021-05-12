package nopolymorphism;

//Person의 수퍼 클래스 : Object클래스
public class Person {

	private String name; // 차주
	
	// 접근지정자 + 클래스 이름 + 객체이름(Scanner 클래스 만드는 방식과 동일)
	private Tico tico; // 소유한 차량 티코 , 인스턴스 변수
	private Spark spark;
	private Cube cube;

	public Person(String name) {
		this.name = name;
	}

	//단점 : 새차가 나오면 계속 메소드 오버로딩 해야함
	public void ride(Tico tico) { // 지역변수
		this.tico = tico;

		System.out.println("차주 : " + this.name);

//		// 지역 변수를 그대로 출력
//		System.out.println("가격 : " + tico.getPrice() + "원");
//		System.out.println("차량 : " + tico.getName() + "시승");
//		System.out.println("코멘트 : " + tico.getComment());

		// 인스턴스 변수에 담았다가 출력하기
		System.out.println("가격 : " + this.tico.getPrice() + "원");
		System.out.println("차량 : " + this.tico.getName() + " 시승");
		System.out.println("코멘트 : " + this.tico.getComment());

	}

	public void ride(Spark spark) {
		this.spark = spark;

		System.out.println("차주 : " + this.name);

		System.out.println("가격 : " + this.spark.getPrice() + "원");
		System.out.println("차량 : " + this.spark.getName() + " 시승");
		System.out.println("제조사 : " + this.spark.getMaker());

	}

	public void ride(Cube cube) {
		this.cube = cube;

		System.out.println("차주 : " + this.name);

		System.out.println("가격 : " + this.cube.getPrice() + "원");
		System.out.println("차량 : " + this.cube.getName() + " 시승");
		System.out.println("연비 : " + this.cube.getFuelEfficiency());

	}

}
