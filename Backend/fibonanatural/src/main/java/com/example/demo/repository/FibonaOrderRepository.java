package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.FibonaOrder;

public interface FibonaOrderRepository extends JpaRepository<FibonaOrder, Integer> {

}
