package com.punith.App.RestServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.punith.App.Domain.CustomerDetails;
import com.punith.App.Domain.ListOfItems;
import com.punith.App.Repository.CustomerRepository;
import com.punith.App.Repository.ItemRepository;

@Controller
@RequestMapping
@SessionAttributes("user")
public class UserController {
	
	CustomerRepository custRepo;
	
	ItemRepository itemRepo;
	
	@Autowired
	public UserController(CustomerRepository custRepo, ItemRepository itemRepo) {
		super();
		this.custRepo = custRepo;
		this.itemRepo = itemRepo;
	}
	
	@ModelAttribute(name="user")
	public CustomerDetails user() {
		return new CustomerDetails();
	}

	@PostMapping("getData")
	public String userData(@ModelAttribute("user") CustomerDetails c, Model m) {
		
		custRepo.save(c);
		
		List<ListOfItems> itemList=new ArrayList<>();
		itemList= itemRepo.findAll();
		m.addAttribute("items",itemList);
		return "display";
	}
	
}
