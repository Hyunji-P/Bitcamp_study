package execute;

import java.util.List;
import java.util.Scanner;

import bean.Product;
import dao.ProductDao;

public class A10_Main1Choose {

	public static void main(String[] args) {
		System.out.println("동적 sql(choose 구문)");
		System.out.println("2배 인상 가격(1), 절반 가격(2), 가격의 30퍼센트(3)");

		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		String param = null;
		if (menu == 1) {
			param = "DOUBLE";
		} else if (menu == 2) {
			param = "HALF";
		} else {
			param = "ETC";
		}
		
		ProductDao dao = new ProductDao();
		List<Product> lists = dao.Choose(param);
		System.out.println("조회된 건수 : "+ lists.size());
		
		System.out.println("상품번호\t상품이름\t재고\t가격");
		for(Product product : lists ) {
			String imsi = "";
			imsi += product.getPno() + "\t";
			imsi += product.getPname() + "\t";
			imsi += product.getStock() + "\t";
			imsi += product.getPrice() + "\t";
			
			System.out.println(imsi);
		}

	}

}
