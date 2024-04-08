package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.demo.dto.Account;
import com.example.demo.dto.Email;
import com.example.demo.dto.Fibona;
import com.example.demo.dto.FibonaOrder;
import com.example.demo.service.FibonaService;

@Controller
public class FibonaController {

	@Autowired
	FibonaService service;
	
	@PostMapping("/login")
	public String fibSave(@ModelAttribute Fibona fibona)
	{
		service.fibSave(fibona);
		return "redirect:/Order";
	}
	 @GetMapping("/login") // Handle GET requests for the login page
	    public String Login() {
	        return "Order"; // Assuming "Loginpage.html" is the login page
	    }
	 @PostMapping("/order")
	 public String saveOrder(@ModelAttribute FibonaOrder fibonaOrder, @ModelAttribute Email email) {
	     service.saveOrder(fibonaOrder);
	     String toEmail = fibonaOrder.getEmail();
	     String toSubject = email.getSubject();
	     String toBody = email.getBody();
	     service.sendEmail(toEmail, toSubject, toBody);
	     return "SucessOrder";
	 }

	 @GetMapping("/order")
	 public String saveOrder()
	 {
		 return "sucessOrder";
	 }
	@PostMapping("/account")
	public String saveAccount(@ModelAttribute Account account)
	{
		service.saveAccount(account);
		return "index";
	}
	@GetMapping("/account")
	public String saveAccount()
	{
		return "Account";
	}
	@PostMapping("/forgot")
	public String forgot(@ModelAttribute Account account )
	{
		service.forgot(account);
		return "Loginpage";
	}
	@GetMapping("/forgot")
	public String forgot( )
	{
		return "login";
	}
	@GetMapping("/index")
	public String index()
	{
		return "index";
	}
}
