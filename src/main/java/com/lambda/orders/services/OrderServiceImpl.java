package com.lambda.orders.services;

import com.lambda.orders.model.Agents;
import com.lambda.orders.model.Customers;
import com.lambda.orders.model.Orders;
import com.lambda.orders.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
@Service(value="orderService")
public class OrderServiceImpl implements OrderService
{
    @Autowired
    private OrderRepository orderRepo;

    @Override
    public Customers save(Orders order)
    {
        return null;
    }

    @Override
    public ArrayList<Orders> findAll()
    {
        ArrayList<Orders> orders = new ArrayList<>();
        orderRepo.findAll().iterator().forEachRemaining(o -> orders.add(o));

        return orders;
    }

    @Override
    public ArrayList<Orders> findAllByAgent(Agents agent)
    {
        return null;
    }

    @Override
    public ArrayList<Orders> findAllByCustomer(Customers customer)
    {
        return null;
    }

    @Override
    public Customers update(Orders order, long ordCode)
    {
        return null;
    }

    @Override
    public void delete(long ordCode)
    {

    }
}

