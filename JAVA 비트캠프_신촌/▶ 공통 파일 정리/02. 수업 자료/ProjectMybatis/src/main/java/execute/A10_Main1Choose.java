package execute;

import java.util.List;
import java.util.Scanner;

import bean.Product;
import dao.ProductDao;

public class A10_Main1Choose {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		System.out.println( "동적 sql(choose ... when 구문)문을 이용하여 제품의 가격 정보를 출력해 봅니다." );
		ProductDao dao = new ProductDao();	

		String param = null ; 
		
		System.out.println("2배 인상 가격(1), 절반 가격(2), 가격의 30퍼센트(3)");
		int menu = scan.nextInt() ;
		if (menu == 1) {
			param = "DOUBLE" ;
		} else if (menu == 2) {
			param = "HALF" ;
		} else if (menu == 3) {
			param = "ETC" ;
		}
		
		List<Product> lists = dao.Choose( param ) ;
		System.out.println( "조회된 건수 : " + lists.size() );
		for(Product product : lists){
			String imsi = 
					product.getPno() + "\t" +
					product.getPname() + "\t" + 
					product.getPrice() + "\t" +
					product.getStock() + "\t"  ;
			
			System.out.println( imsi );		
		}
		scan.close(); 
	}
}