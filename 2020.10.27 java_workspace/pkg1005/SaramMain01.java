package pkg1005;

public class SaramMain01 {

	public static void main(String[] args) {
//		Saram01 soo = new Saram01();
//
//		soo.nationality = "´ëÇÑ ¹Î±¹";
//		soo.name = "±èÃ¶¼ö";
//		soo.height = 172.5;
//		soo.weight = 72.5;
//		soo.hobby = "´ç±¸";
//		soo.blood = "AB";
//
//		soo.show();

		Saram01[] arr = new Saram01[1];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Saram01();
		}
		
		arr[0].nationality = "´ëÇÑ¹Î±¹";
		arr[0].name = "±èÃ¶¼ö";
		arr[0].height = 172.5;
		arr[0].weight = 72.5;
		arr[0].hobby = "´ç±¸";
		arr[0].blood = "AB";
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].show();
		}

	}

}
