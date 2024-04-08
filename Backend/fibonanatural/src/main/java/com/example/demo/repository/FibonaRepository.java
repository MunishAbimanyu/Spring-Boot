package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Fibona;

public interface FibonaRepository  extends JpaRepository<Fibona,Integer>{

	
}
