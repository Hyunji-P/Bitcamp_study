package exam.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("hohoho")
public class ServiceImpl implements Service{
	@Autowired(required=true)
	@Qualifier("abcd")	
	private OrderDao orderDao ;
	
	@Autowired(required=true)
	@Qualifier("xyz")
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