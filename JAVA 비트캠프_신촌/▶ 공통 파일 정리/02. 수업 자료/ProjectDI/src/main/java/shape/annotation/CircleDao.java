package shape.annotation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

// 기본 값으로 객체의 이름은 클래스 이름의 첫 글자를 소문자로 바꿔서 인식합니다.
// 하지만, 개발자가 명시적으로 명명할 수 있습니다.
// 예시에서는 "myCircleDao"라는 이름으로 명명했습니다.
// 등가의 자바 코드는 다음과 같습니다.
// CircleDao myCircleDao = new CircleDao() ; 입니다.
@Component("myCircleDao")
public class CircleDao implements ShapeDao{
	public CircleBean getProductOne() {
		//실제 프로그램에서는 데이터베이스와 직접 연동을 해야 합니다.
		//예시에서는 단순 객체 1개만을 리턴하도록 합니다.
		return new CircleBean(3.0, 4.0, 5.0) ;
	}
	public List<Object> getAllProducts() {
		List<Object> productLists = new ArrayList<Object>() ;
		productLists.add( new CircleBean(3.0, 4.0, 5.0)) ;
		productLists.add( new CircleBean(5.0, 6.0, 7.0)) ;
		productLists.add( new CircleBean(2.0, 3.0, 4.0)) ;
		
		return productLists ;
	}
}