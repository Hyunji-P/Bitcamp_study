package controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import bean.Order;
import dao.OrderDao;

@Controller
public class OrderInsertController {
	private final String command = "/insert.or";
	private final String getpage = "orInsertForm";
	private final String postpage = "orList";

	@Autowired
	@Qualifier(value = "odao")
	private OrderDao odao;
	
	@ModelAttribute("order")
	public Order some() {
		return new Order();
	}

	@GetMapping(value = command)
	public String doGet() {
		return getpage;
	}

	@PostMapping(value = command)
	public ModelAndView doPost(@ModelAttribute("order") @Valid Order xxx, BindingResult errors) {

		ModelAndView mav = new ModelAndView();

		if (errors.hasErrors()) {// 유효성 검사 실패
			
			mav.setViewName(getpage);
		} else { // 유효성 검사 성공
			int cnt = -1;
			cnt = this.odao.InsertData(xxx);

			if (cnt > 0) {
				System.out.println("데이터 추가");
				mav.setViewName(postpage);
			} else {
				System.out.println("데이터 추가 실패");
				mav.setViewName(getpage);
			}
		}

		return mav;
	}

}
