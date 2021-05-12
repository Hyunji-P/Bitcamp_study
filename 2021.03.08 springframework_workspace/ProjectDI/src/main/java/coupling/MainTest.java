package coupling;

public class MainTest {

	public static void main(String[] args) {
		Sport sprot = new Baseball(); //  야구 
		Human soo = new Human(sprot);
		soo.play();
		soo.stop();

	}

}
