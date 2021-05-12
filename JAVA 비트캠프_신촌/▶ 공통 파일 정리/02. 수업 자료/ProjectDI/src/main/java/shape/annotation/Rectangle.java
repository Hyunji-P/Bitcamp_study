package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//applicationContext.xml 설정 파일에서 annotation.di.* 의 모든 항목을 스캔한다.

@Component("myRectangle") //@Component을 사용하게 되면 스캔의 대상이 된다.
public class Rectangle implements Shape {
	@Autowired //자동으로 와이이링되는 CircleDao 항목도 @Component 를 명시해 줘야 된다.
	@Qualifier("myRectangleDao")
	private ShapeDao shapeDao ;

	public Object getProductOne() {		
		return shapeDao.getProductOne() ;
	}
	public List<Object> getAllProducts() {
		return shapeDao.getAllProducts() ;
	}
}