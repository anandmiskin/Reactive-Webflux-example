package com.example.orderService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.orderService.appUtils.AppUtils;
import com.example.orderService.dto.OrderDto;
import com.example.orderService.repository.OrderRepo;

import reactor.core.publisher.Mono;

@Service
public class OrderService {

	@Autowired
	private OrderRepo repository;

	public Mono<OrderDto> sendOrder(Mono<OrderDto> orderDtoMono){
		return orderDtoMono.map(AppUtils::DtoToEntity)
				.flatMap(repository::save)
				.map(AppUtils::entityToDto);
	}

}
