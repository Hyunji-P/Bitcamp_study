package exam.xmlbeanbind;

public class OrderDaoImpl implements OrderDao {
	public void insertOrder() {
		System.out.println("주문 정보 추가 : insertOrder() 메소드 실행");
	}
	public void removeOrder() {
		System.out.println("주문 정보 취소 : removeOrder() 메소드 실행");
	}
}