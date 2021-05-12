package exam.annotation;

import org.springframework.stereotype.Component;

@Component("xyz")
public class DeliveryDaoImpl implements DeliveryDao {
	public void insertAddress() {		
		System.out.println("배송지 정보 추가 : insertAddress() 메소드 실행");
	}
	public void removeAddress() {		
		System.out.println("배송지 정보 취소 : removeAddress() 메소드 실행");
	}
}