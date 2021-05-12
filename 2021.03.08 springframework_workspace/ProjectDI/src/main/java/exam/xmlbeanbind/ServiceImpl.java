package exam.xmlbeanbind;

// 서비스와 관련된 실제 구현할 클래스
public class ServiceImpl implements Service {
	// 배송지 담당자는 DeliveryDao
	// 주문 담당자는 OrderDao
	private OrderDao orderdao; // 현재 null
	private DeliveryDao deliverydao; // 현재 null

	public void setOrderdao(OrderDao orderdao) {
		this.orderdao = orderdao;
	}

	public void setDeliverydao(DeliveryDao deliverydao) {
		this.deliverydao = deliverydao;
	}

	@Override
	public void order() {// 주문
		// 배송지 정보 추가
		this.deliverydao.insertAddress();
		// 주문 정보 추가
		this.orderdao.insertOrder();

	}

	@Override
	public void cancle() {// 주문 취소
		// 배송지 정보 삭제
		this.deliverydao.removeAddress();

		// 주문 정보 삭제
		this.orderdao.removeOrder();

	}

}
