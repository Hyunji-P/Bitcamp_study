package exam.xmlbeanbind;

// 배송 관련 실제 구현할 클래스 
public class DeliveryDaoImpl implements DeliveryDao {

	@Override
	public void insertAddress() {
		System.out.println("배송지 정보 추가 : insertAddress() 메소드 실행");
	}

	@Override
	public void removeAddress() {
		System.out.println("배송지 정보 삭제 : removeAddress() 메소드 실행");
	}

}
