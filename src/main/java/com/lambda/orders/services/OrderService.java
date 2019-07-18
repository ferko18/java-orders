package com.lambda.orders.services;

import com.lambda.orders.model.Agents;
import com.lambda.orders.model.Customers;
import com.lambda.orders.model.Orders;

import java.util.ArrayList;

public interface OrderService
{
    Customers save(Orders order);
    ArrayList<Orders> findAll();
    ArrayList<Orders> findAllByAgent(Agents agent);
    ArrayList<Orders> findAllByCustomer(Customers customer);
    Customers update(Orders order, long ordCode);
    void delete(long ordCode);
}
