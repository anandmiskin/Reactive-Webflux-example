package com.example.orderService.appUtils;

import org.springframework.beans.BeanUtils;

import com.example.orderService.Entity.OrderEntity;
import com.example.orderService.dto.OrderDto;

public class AppUtils {

	public static OrderDto entityToDto(OrderEntity orderEntity) {
		OrderDto orderDto = new OrderDto();
		BeanUtils.copyProperties(orderEntity, orderDto);
		return orderDto;
	}

	public static OrderEntity DtoToEntity(OrderDto orderDto) {
		OrderEntity orderEntity = new OrderEntity();
		BeanUtils.copyProperties(orderDto, orderEntity);
		return orderEntity;
	}
}
