package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FibonaDao;
import com.example.demo.dto.Account;
import com.example.demo.dto.Fibona;
import com.example.demo.dto.FibonaOrder;

@Service
public class FibonaService {

	@Autowired
	FibonaDao dao;
	
	@Autowired
	JavaMailSender mailSender;
	
	public Fibona fibSave(Fibona fibona)
	{
		 Fibona fib = dao.fibSave(fibona);
		return fib;
	}

	public FibonaOrder saveOrder(FibonaOrder fibonaOrder) {
		FibonaOrder fib = dao.saveOrder(fibonaOrder);
		return fib;	
	}

	public Account saveAccount(Account account) {
		Account acc = dao.saveAccount(account);
		return acc;
	}

	public Account forgot(Account account) {
		return dao.forgot(account);
	}
	
	public void sendEmail(String toEmail,String subject,String body)
	{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("munishabimanyu2002@gmail.com");
		message.setTo(toEmail);
		message.setText("Your Order Placed");
		message.setSubject("Informing for the Order");
		mailSender.send(message);
	}
	
}
