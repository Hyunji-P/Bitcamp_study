package shape.xmlconfig;

import java.util.List;

// 도형과 관련된 인터페이스 
public interface Shape {
	public Object GetShapeOne(); // 도형 1개의 정보 (ex. 상세보기)
	public List<Object> GetAllShapes(); // 도형 여러개의 목록보기 
}
