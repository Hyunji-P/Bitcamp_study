package shape.xmlconfig;
import java.util.ArrayList;
import java.util.List;

public class RectangleDao implements ShapeDao{
	//실제 이러한 메소드들은 데이터베이스에서 데이터를 추출해와야 한다. 
	public Object getProductOne() {
		RectangleBean rect1 = new RectangleBean() ;
		rect1.setHeight( 3.0 );
		rect1.setWidth( 4.0 );
		return rect1 ; 
	}
	public List<Object> getAllProducts() {
		//원 객체 여러 개를 생성하여 자바의 List 컬렉션에 저장하고 있다.
		List<Object> productLists = new ArrayList<Object>() ;
		
		RectangleBean rect1 = new RectangleBean() ;
		rect1.setHeight( 3.0 );
		rect1.setWidth( 4.0 );
		productLists.add( rect1 ) ;
		
		RectangleBean rect2 = new RectangleBean() ;
		rect2.setHeight( 5.0 );
		rect2.setWidth( 6.0 );
		productLists.add( rect2 ) ;
		
		return productLists ;
	}
}