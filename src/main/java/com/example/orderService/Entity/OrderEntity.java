package com.example.orderService.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="Orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

	@Id
	private String orderid;
	private String orderItem;
	private String quantity;

}
