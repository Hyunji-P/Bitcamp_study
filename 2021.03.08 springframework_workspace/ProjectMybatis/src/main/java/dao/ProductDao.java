package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Product;

public class ProductDao extends SuperDao {
	private final String namespace = "NsProduct.";

	public ProductDao() {
		super();
	}

	public List<Product> Choose(String param) {
		// 동적 sql choose 를 이용한 메소드

		// 파라미터가 여러개인 경우도 있기 때문에 map 으로 설정
		Map<String, String> map = new HashMap<String, String>();
		map.put("somevalue", param);

		List<Product> lists = null;
		lists = super.sqlSession.selectList(this.namespace + "Choose", map);
		super.SessionClose();
		return lists;
	}

	public List<Product> ForEach1() {
		// 동적 sql foreach 를 이용한 메소드
		// 배열로 풀어보기

		String[] item = { "사과", "배" };
		List<Product> lists = this.sqlSession.selectList(this.namespace + "ForEach1", item);
		super.SessionClose();
		return lists;
	}

	public List<Product> ForEach2() {
		// 동적 sql foreach 를 이용한 메소드
		// 컬렉션으로 풀어보기
		List<String> item = new ArrayList<String>();
		item.add("사과");
		item.add("배");
		
		List<Product> lists = this.sqlSession.selectList(this.namespace + "ForEach2", item);
		super.SessionClose();
		return lists;
	}
}
