package pkg19;
import java.util.Random;
public class Utility01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int total = 0 ;
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1 ;
			System.out.println("arr[" + i + "] = " + arr[i]);
			total += arr[i] ;
		}
		System.out.println("รัวี : " + total);
	}
}