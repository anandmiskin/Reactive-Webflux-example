package com.example.orderService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderService.dto.OrderDto;
import com.example.orderService.service.OrderService;

import reactor.core.publisher.Mono;

@RequestMapping("/orders")
@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;

	@PostMapping("/AddOrder")
	public Mono<ResponseEntity<OrderDto>> createOrder(@RequestBody Mono<OrderDto> orderDtoMono) {
        return service.sendOrder(orderDtoMono)
                .map(orderDto -> ResponseEntity.status(HttpStatus.CREATED).body(orderDto))
                .defaultIfEmpty(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }
}
