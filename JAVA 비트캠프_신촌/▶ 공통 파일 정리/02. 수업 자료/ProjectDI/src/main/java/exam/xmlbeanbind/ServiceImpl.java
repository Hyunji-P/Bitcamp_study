package exam.xmlbeanbind;

public class ServiceImpl implements Service {
	private OrderDao orderDao ;
	private DeliveryDao deliveryDao ;
	
	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}
	public void setDeliveryDao(DeliveryDao deliveryDao) {
		this.deliveryDao = deliveryDao;
	}
	public void order() {
		this.deliveryDao.insertAddress() ;
		this.orderDao.insertOrder() ;
	}
	public void cancel() {
		this.deliveryDao.removeAddress();
		this.orderDao.removeOrder();
	}
}