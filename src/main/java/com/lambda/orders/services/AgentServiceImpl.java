package com.lambda.orders.services;

import com.lambda.orders.model.Agents;
import com.lambda.orders.model.Customers;
import com.lambda.orders.model.Orders;
import com.lambda.orders.repos.AgentRepository;
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
    public Customers save(Agents agent)
    {
        return null;
    }

    @Override
    public ArrayList<Agents> findAll()
    {
        ArrayList<Agents> agents = new ArrayList<>();
        agentRepo.findAll().iterator().forEachRemaining(agent -> agents.add(agent));

        return agents;
    }

    @Override
    public Agents findByCustomer(Customers customer)
    {
        return null;
    }

    @Override
    public Agents findByOrder(Orders order)
    {
        return null;
    }

    @Override
    public Customers update(Agents agent, long agentCode)
    {
        return null;
    }

    @Override
    public void delete(long agentCode)
    {

    }
}
