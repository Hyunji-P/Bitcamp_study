package pkg19;

public class MyStringTest02 {
	public static void main(String[] args) {
		String sometext = "abcdefghaa" ;
		
		MyCustomString mystr = new MyCustomString( sometext ) ;
		
		//사람 기준 : 3번째 부터 5번째 까지 이므로 문자열
		String result = mystr.mysubstring(3, 5) ; 
		System.out.println( result ); //정답 : cde
		
		//문자열 a는 몇개?
		int count  = mystr.mycount("a") ; 
		System.out.println( count ); //정답 : 3		
		
		//사람 기준 : 3번째 부터 5번째 까지의 문자열을 뒤집기
		String myrev = mystr.myreverse(3, 5) ; 
		System.out.println( myrev ); //edc
	}
}