package com.example.orderService.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.orderService.Entity.OrderEntity;

public interface OrderRepo extends ReactiveCrudRepository<OrderEntity, String>{
	
}
