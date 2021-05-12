package shape.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//applicationContext.xml 설정 파일에서 annotation.di.* 의 모든 항목을 스캔한다.

@Component("myCircle") //@Component을 사용하게 되면 스캔의 대상이 된다.
public class Circle implements Shape {
	//@Qualifier 어노테이션은
	//@Autowired에 일치하는 타입의 객체가 두개 이상이고 이름이 매칭되는 빈이 없을 경우 Qualifier에 지시한 이름의 빈으로 매칭한다.
	//생성자를 이용한 오토 와이어링에는 @Qualifier를 붙일 수 없다.
	
	//@Autowired 어노테이션에서 required 속성의 기본 값은 true이다.(반드시 Wiring되어야 한다는 의미이다.)
	//true의 의미는 Wiring이 되지 않는 경우에 오류를 발생시킨다. 
	@Autowired(required=true) //자동으로 와이이링되는 CircleDao 항목도 @Component 를 명시해 줘야 된다.	
	@Qualifier("myCircleDao") //@Component("myCircleDao")으로 설정된 항목을 찾는다.
	private ShapeDao shapeDao ;
	
	public Object getProductOne() {		
		return shapeDao.getProductOne() ;
	}
	public List<Object> getAllProducts() {
		return shapeDao.getAllProducts() ;
	}
}