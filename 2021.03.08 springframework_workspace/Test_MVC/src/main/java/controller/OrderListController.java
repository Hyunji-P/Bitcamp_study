package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import bean.Order;
import dao.OrderDao;

@Controller
public class OrderListController {
	private final String command = "/list.or";
	
	@Autowired
	@Qualifier("odao")
	private OrderDao odao ;

	@RequestMapping(value = command, method = RequestMethod.GET)
	public ModelAndView doGet() {
		ModelAndView mav = new ModelAndView();
		
		List<Order> lists = odao.SelectAllData();
		
		mav.addObject("lists", lists);
		
		mav.setViewName("orList");
		return mav;
	}

}
