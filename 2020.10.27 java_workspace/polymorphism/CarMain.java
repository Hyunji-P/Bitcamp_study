package polymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("김철수");

		// 배열 선언 - new 연산자
		Car[] carlist = new Car[3];

		// 승급에 의한 객체 생성
		carlist[0] = new Tico("NEW 티코", 400, "단종됨");
		carlist[1] = new Spark("NEW 스파크", 500, "현대");
		carlist[2] = new Cube("NEW 큐브", 600, 12.3);

		System.out.println("=========================");

		for (int i = 0; i < carlist.length; i++) {
			soo.ride(carlist[i]);
			System.out.println();
		}

		System.out.println("=========================");

		// 배열 선언 - 초기화 기법
		Car[] cararray = 
			{
				new Tico("NEW 티코", 700, "추억의 명차"), //승급 1
				new Spark("NEW 스파크", 800, "삼성"), //승급 2
				new Cube("NEW 큐브", 900, 12.4)//승급 3
		    };  

		for (int i = 0; i < cararray.length; i++) {
			soo.ride(cararray[i]);
			System.out.println();
		}

	}

}
