package shape.xmlconfig;

import java.util.List;

//원(circle) 기능 구현 클래스
public class Circle implements Shape {
	private ShapeDao shapeDao;

	// for setter injection
	public void setShapeDao(ShapeDao shapeDao) {
		this.shapeDao = shapeDao;
	}

	@Override
	public Object GetShapeOne() {
		return this.shapeDao.GetShapeOne();
	}

	@Override
	public List<Object> GetAllShapes() {
		return this.shapeDao.GetAllShapes();
	}

}
