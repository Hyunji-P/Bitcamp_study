package nopolymorphism;

public class CarMain {

	public static void main(String[] args) {
		Person soo = new Person("김철수");

		Tico tico = new Tico("티코", 100, "쪼맨해요.");

		soo.ride(tico); // 철수가 티코를 타다(ride())
		System.out.println("==========================");

		//변수를 만드는 이유 : 여러번 사용하기 위해
		Person hee = new Person("박영희");
		Spark spark = new Spark("스파크", 200, "GM 대우");
		hee.ride(spark);// spark 는 14번 줄을 의미
		System.out.println("==========================");

		Person minsik = new Person("최민식");
		// 1번만 만들어서 사용하는 1회용 객체 생성
		// 생성자를 만들어서 바로 넘김
		minsik.ride(new Cube("큐브", 300, 24.1));

	}

}
