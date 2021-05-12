package dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Product;

public class ProductDao extends SuperDao {
	static final String namespace = "NsProduct." ;
	
	public ProductDao(){ }
	public List<Product> Choose( String param ) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("somevalue", param) ;
		
		List<Product> lists = null;
		lists = super.sqlSession.selectList( namespace + "Choose", map);
		super.SessionClose();
		return lists;
	}
}