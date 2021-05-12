package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bean.Order;

@Component("odao")
public class OrderDao {
	private final String namespace = "NsOrder.";

	@Autowired
	SqlSession ssfb;

	public List<Order> SelectAllData() {
		// 결제 목록을 담당하는 메소드
		List<Order> lists = this.ssfb.selectList(namespace + "SelectAllData");
		return lists;
	}

	public int InsertData(Order bean) {
		// 결제 목록 추가 담당 메소드
		int cnt = -1;
		cnt = this.ssfb.insert(namespace + "InsertData", bean);
		return cnt;
	}

}
