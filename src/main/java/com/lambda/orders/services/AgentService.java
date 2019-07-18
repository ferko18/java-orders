package com.lambda.orders.services;

import com.lambda.orders.model.Agents;
import com.lambda.orders.model.Customers;
import com.lambda.orders.model.Orders;

import java.util.ArrayList;

public interface AgentService
{
    Customers save(Agents agent);
    ArrayList<Agents> findAll();
    Agents findByCustomer(Customers customer);
    Agents findByOrder(Orders order);
    Customers update(Agents agent, long agentCode);
    void delete(long agentCode);

}
