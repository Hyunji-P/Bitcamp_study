package exam.xmlbeanbind;

// 주문 관련 실제 구현할 클래스 
public class OrderDaoImpl implements OrderDao {

	@Override
	public void insertOrder() {
		System.out.println("주문 정보 추가 : insertOrder() 메소드 실행");
	}

	@Override
	public void removeOrder() {
		System.out.println("주문 정보 삭제 : removeOrder() 메소드 실행");
	}

}
