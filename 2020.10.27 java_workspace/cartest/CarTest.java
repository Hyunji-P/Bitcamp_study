package cartest;

import java.util.Random;

//main 클래스
public class CarTest {
	public static void main(String[] args) {
		Car[] carlist = new Car[2];
		
		

		carlist[0] = new Tico("티코", 100, "작은 차");
		carlist[1] = new Cube("큐브", 200, 12.5);

		for (int i = 0; i < carlist.length; i++) {
			System.out.println("==========================");
			carlist[i].speedup(50);
			carlist[i].display();

			carlist[i].speedup(20); 
			carlist[i].display();

			carlist[i].speeddown(10);
			carlist[i].display();
			System.out.println(carlist[i]);

		}

	}

}
