package pkg19;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Utility02 {
	public static void main(String[] args) {
		String str = "¼Ò³à½Ã´ë ºò¹ð ¿ø´õ°É½º exid °É½ºµ¥ÀÌ" ;
		
		StringTokenizer st1 = new StringTokenizer(str) ;
		
		int cnttoken = st1.countTokens() ;
		
		String[] groups = new String[cnttoken] ;
		
		for (int i = 0; i < cnttoken ; i++) {
			groups[i] = st1.nextToken() ;
		}
		System.out.println(Arrays.toString(groups));
		
		Arrays.sort(groups);
		System.out.println(Arrays.toString(groups));
	}
}











