package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myRectangle")
public class Rectangle implements Shape {
	// CircleDao, RectangleDao 모두 ShapeDao 을 상속 받으므로
	// 약한 결합으로 처리
	@Autowired(required = true)
	@Qualifier("myRectangleDao")
	private ShapeDao shapeDao;

	@Override
	public Object GetShapeOne() {
		return this.shapeDao.GetShapeOne();
	}

	@Override
	public List<Object> GetShapeAll() {
		return this.shapeDao.GetShapeAll();
	}

}
