package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Account;
import com.example.demo.dto.Fibona;
import com.example.demo.dto.FibonaOrder;
import com.example.demo.repository.FibonaAccountRepository;
import com.example.demo.repository.FibonaOrderRepository;
import com.example.demo.repository.FibonaRepository;
@Repository
public class FibonaDao {

	@Autowired
	FibonaRepository repository;
	
	@Autowired
	FibonaOrderRepository orderRepository;
	
	@Autowired
	FibonaAccountRepository accountRepository;
	
	public Fibona fibSave(Fibona fibona)
	{
		  Fibona fib = repository.save(fibona);
		 return fib;
	}

	public FibonaOrder saveOrder(FibonaOrder fibonaOrder) {
		
		FibonaOrder fib = orderRepository.save(fibonaOrder);
		return fib;
	}

	public Account saveAccount(Account account) {
		Account acc = accountRepository.save(account);
		return acc;
	}

	public Account forgot(Account account) {
		 return accountRepository.save(account);
	}
	
}
