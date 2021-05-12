package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("myRectangleDao") 
public class RectangleDao implements ShapeDao{
	public RectangleBean getProductOne() {
		return new RectangleBean(10.0, 20.0) ;
	}
	public List<Object> getAllProducts() {
		List<Object> productLists = new ArrayList<Object>() ;
		productLists.add( new RectangleBean(10.0, 20.0)) ;
		productLists.add( new RectangleBean(10.0, 10.0)) ;
		return productLists ;
	}
}