package pkg0921;

public class Arithmetic01 {

	public static void main(String[] args) {
		int x = 14, y = 5;
		
		//»ê¼ú¿¬»êÀÚ 
		//+ ±âÈ£ÀÇ 2°¡Áö ¿ªÇÒ : 1) µ¡¼À , 2) ¹®ÀÚ¿­ °áÇÕ 
		
		System.out.println("µ¡¼À : " + (x + y));
		System.out.println("»¬¼À : " + (x - y));
		System.out.println("°ö¼À : " + (x * y));
		System.out.println("³ª´°¼À : " + (x / y));
		System.out.println("³ª¸ÓÁö : " + (x % y));
	}

}
