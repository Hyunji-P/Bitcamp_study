package pkg0924;

public class Test_Sum03 {

	public static void main(String[] args) {
//		2/1 + 3/2 + 4/3 + ..... + 101/100   
//		รัวี : ??
		
		double total = 0;
		
		for(int i = 1; i<101 ; i++) {
			total += (double)(i+1)/i;
		}
		
		System.out.println("รัวี : " + total);
	}

}
