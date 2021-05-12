package pkg19;
public class SoshiMain {
	public static void main(String[] args) {
		String[] soshi = {"수영", "효연", "유리"} ;		
		String name = "김철수" ;
		
		//false이면 소시 멤버가 아니라고 가정
		boolean isMember = false ; //flag 변수
		
		try {
			for (int i = 0; i < soshi.length; i++) {
				if (soshi[i].equals(name)) {
					isMember = true ; 
					break ;
				}
			}
			if (isMember == true) {
				System.out.println( name + "은 소시 멤버가 맞아요.");
				
			} else {			
				String message = name + "은 소시 멤버가 아닙니다." ;
				 
				//1회용 객체를 만들어서 throw에 넘겨 줍니다.
				throw new GirlException(message);  
			}
		}catch(GirlException ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			System.out.println();
			ex.printStackTrace();
		}
	}
}











