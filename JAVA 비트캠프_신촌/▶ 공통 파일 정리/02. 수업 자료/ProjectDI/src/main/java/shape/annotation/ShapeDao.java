package shape.annotation;

import java.util.List;

public interface ShapeDao {	
	Object getProductOne(); //도형 1개의 정보 구하기
	
	//여러 개의 도형 정보를 컬렉션으로 리턴해주기
	List<Object> getAllProducts(); 
}