package shape.xmlconfig;
import java.util.ArrayList;
import java.util.List;

public class CircleDao implements ShapeDao{
	//실제 이러한 메소드들은 데이터베이스에서 데이터를 추출해와야 한다. 
	public Object getProductOne() {
		//원 객체 1개를 생성하고 있다.
		return new CircleBean(3.0, 4.0, 5.0) ;
	}
	public List<Object> getAllProducts() {
		//원 객체 여러 개를 생성하여 자바의 List 컬렉션에 저장하고 있다.
		List<Object> productLists = new ArrayList<Object>() ;
		productLists.add( new CircleBean(3.0, 4.0, 5.0)) ;
		productLists.add( new CircleBean(5.0, 6.0, 7.0)) ;
		productLists.add( new CircleBean(2.0, 3.0, 4.0)) ;
		
		return productLists ;
	}
}