package com.lambda.orders.services;

import com.lambda.orders.repos.AgentRepository;
import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.models.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;


@Transactional
@Service(value="agentService")
public class AgentServiceImpl implements AgentService
{
    @Autowired
    private AgentRepository agentRepo;

    @Override
    public Customer save(Agent agent)
    {
        return null;
    }

    @Override
    public ArrayList<Agent> findAll()
    {
        ArrayList<Agent> agents = new ArrayList<>();
        agentRepo.findAll().iterator().forEachRemaining(a -> agents.add(a));

        return agents;
    }

    @Override
    public Agent findByCustomer(Customer customer)
    {
        return null;
    }

    @Override
    public Agent findByOrder(Order order)
    {
        return null;
    }

    @Override
    public Customer update(Agent agent, long agentCode)
    {
        return null;
    }

    @Override
    public void delete(long agentCode)
    {

    }
}
