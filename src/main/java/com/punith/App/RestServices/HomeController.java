package com.punith.App.RestServices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.punith.App.Domain.ListOfItems;
import com.punith.App.Repository.ItemRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	ItemRepository itemRepo;
	
	@Autowired
	public HomeController(ItemRepository itemRepo) {
		super();
		this.itemRepo = itemRepo;
	}

	@GetMapping
	public String getList(Model m) {
		
		List<ListOfItems> itemList=new ArrayList<>();
		itemList= itemRepo.findAll();
		m.addAttribute("items",itemList);
		return "home";
	}
	
	@PostMapping
	public String userInfo() {
		return "user";
	}
	

}
