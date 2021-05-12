package pkg12;
public class BookSales {
	public static void main(String[] args) {
		Sales[] mybook = new Sales[2];
		
		Book.discount = 0.15 ; 
		
		for (int i = 0; i < mybook.length; i++) {
			mybook[i] = new Sales() ;
		}
		 
		System.out.println("ÃÑ ÆÇ¸Å ±Ç¼ö : " + Book.count );
		
		for (int i = 0; i < mybook.length; i++) {
			mybook[i].Display();
		}
	}
} 