package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Account;

public interface FibonaAccountRepository  extends JpaRepository<Account, Integer>{

}
