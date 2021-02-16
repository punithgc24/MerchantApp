package com.punith.App.RestServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.punith.App.Domain.CustomerDetails;
import com.punith.App.Domain.CustomerOrder;
import com.punith.App.Domain.ListOfItems;
import com.punith.App.Repository.CustomerOrderRepository;

@Controller
public class OrderController {
	
	
	@Autowired
	CustomerOrderRepository coRepo;
	
	public OrderController(CustomerOrderRepository coRepo) {
		super();
		this.coRepo = coRepo;
	}

	@PostMapping("displayList")
	public String orderData() {
		System.out.println("Hello Bharath");
		return "display";
	}
	
	@PostMapping("goCart")
	public String goToCart(@ModelAttribute("item") CustomerOrder order, @SessionAttribute CustomerDetails user,Model m) {
		
		order.addUser(user);
		m.addAttribute("cartList",coRepo.save(order));	
		return "cart";
	}
	
}
