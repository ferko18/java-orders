package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;

import java.util.ArrayList;

public interface AgentService
{
    Customer save(Agent agent);
    ArrayList<Agent> findAll();
    Agent findByCustomer(Customer customer);
    Agent findByOrder(Order order);
    Customer update(Agent agent, long agentCode);
    void delete(long agentCode);

}
