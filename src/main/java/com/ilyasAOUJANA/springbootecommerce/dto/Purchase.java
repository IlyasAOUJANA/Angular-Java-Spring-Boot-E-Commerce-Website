package com.ilyasAOUJANA.springbootecommerce.dto;

import com.ilyasAOUJANA.springbootecommerce.entity.Address;
import com.ilyasAOUJANA.springbootecommerce.entity.Customer;
import com.ilyasAOUJANA.springbootecommerce.entity.Order;
import com.ilyasAOUJANA.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
