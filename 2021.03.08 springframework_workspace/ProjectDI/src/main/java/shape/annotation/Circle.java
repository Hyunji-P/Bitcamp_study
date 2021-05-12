package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//클래스 객체 = new 생성자();
//@Component // Circle circle = new Circle();  ===> 암시적
//@Component 어노테이션은 클래스 이름을 소문자로 만들어서 객체를 생성해준다. 
//→ 객체 명을 안적으면 클래스 이름을 소문자로 만듬

@Component("myCircle") // Circle myCircle = new Circle(); ===> 명시적
public class Circle implements Shape {
	// CircleDao, RectangleDao 모두 ShapeDao 을 상속 받으므로
	// 약한 결합으로 처리
	@Autowired(required = true) // 이 변수는 자동으로 주입을 하도록 하겠습니다.
	@Qualifier("myCircleDao") // ShapeDao 타입 중에서 이름이 "myCircleDao"인 항목을 찾아라.
	// required = true는 반드시 해주셔야합니다. 
	// shapeDao 는 외부에서 주입이 되어야한다. 
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
