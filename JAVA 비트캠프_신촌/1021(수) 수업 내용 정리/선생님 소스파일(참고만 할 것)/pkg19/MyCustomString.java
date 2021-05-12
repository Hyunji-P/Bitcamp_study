package pkg19;

public class MyCustomString{
	private String sometext ;
	public MyCustomString(String sometext) {
		this.sometext = sometext ;
	}
	public String mysubstring(int start, int end) { 
		return this.sometext.substring( start - 1, end  )  ;
	}
	public int mycount(String findtext) {
		int counter = 0 ; 
		for (int i = 0; i < this.sometext.length(); i++) {
			if ( this.sometext.charAt( i ) == findtext.charAt( 0 ) ) {
				counter++; 
			}
		}
		return counter ;
	}
	public String myreverse(int start, int end) {
		String imsi = this.mysubstring(start, end) ;
		String temp = ""; 
		for (int i = 0; i < imsi.length(); i++) {
			temp = imsi.charAt( i ) + temp ; 
		}
		return temp ;
	}
}