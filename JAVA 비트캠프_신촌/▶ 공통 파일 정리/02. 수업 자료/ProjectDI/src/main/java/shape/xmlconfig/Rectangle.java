package shape.xmlconfig;
import java.util.List;

public class Rectangle implements Shape {
	private ShapeDao shapeDao ; 	

	public void setShapeDao(ShapeDao shapeDao) {
		this.shapeDao = shapeDao;
	}
	public Object getProductOne() {
		return this.shapeDao.getProductOne(); 
	}
	public List<Object> getAllProducts() {		
		return this.shapeDao.getAllProducts() ;
	}
}