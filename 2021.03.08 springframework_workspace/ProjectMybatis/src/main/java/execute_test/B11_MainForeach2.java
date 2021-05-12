package execute_test;

import java.util.List;

import bean.Product;
import dao.ProductDao;

public class B11_MainForeach2 {

	public static void main(String[] args) {
		System.out.println("컬렉션을 이용한 <foreach> 사용하기");

		ProductDao dao = new ProductDao();
		List<Product> lists = dao.ForEach2();

		System.out.println("상품번호\t상품이름\t재고\t가격");
		for (Product product : lists) {
			String imsi = "";
			imsi += product.getPno() + "\t";
			imsi += product.getPname() + "\t";
			imsi += product.getStock() + "\t";
			imsi += product.getPrice() + "\t";
			
			System.out.println(imsi);
		}

	}

}
