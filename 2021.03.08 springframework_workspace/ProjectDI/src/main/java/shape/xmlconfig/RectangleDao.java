package shape.xmlconfig;

import java.util.ArrayList;
import java.util.List;

public class RectangleDao implements ShapeDao {

	@Override
	public Object GetShapeOne() {
		// 원 객체 1개를 생성하여 반환해준다.
		// 원칙은 데이터 베이스에서 읽어와야한다.
		RectangleBean bean = new RectangleBean(4.0, 3.0);
		return bean;
	}

	@Override
	public List<Object> GetAllShapes() {
		// 원칙은 데이터 베이스에서 읽어 와야 한다.
		// 원 데이터를 컬렉션 형태로 반환해 준다.
		List<Object> lists = new ArrayList<Object>();
		lists.add(new RectangleBean(4.0, 3.0));
		lists.add(new RectangleBean(6.0, 5.0));
		return lists;
	}

}
