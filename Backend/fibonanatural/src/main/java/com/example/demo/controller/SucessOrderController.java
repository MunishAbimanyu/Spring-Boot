package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SucessOrderController {

	@GetMapping("/sucessorder")
	public String sucessOrder()
	{
		return "SucessOrder";
	}
}
