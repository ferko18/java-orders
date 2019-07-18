package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;

import java.util.ArrayList;

public interface OrderService
{
    Customer save(Order order);
    ArrayList<Order> findAll();
    ArrayList<Order> findAllByAgent(Agent agent);
    ArrayList<Order> findAllByCustomer(Customer customer);
    Customer update(Order order, long ordCode);
    void delete(long ordCode);
}
