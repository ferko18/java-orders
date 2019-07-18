package com.lambda.orders.services;

import com.lambda.orders.model.Agents;
import com.lambda.orders.model.Customers;
import com.lambda.orders.repos.CustomerRepository;
import com.lambda.orders.repos.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Transactional
@Service(value="customerService")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository customerRepo;
    @Autowired
    private OrderRepository orderRepo;

    @Override
    public ArrayList<Customers> findAll()
    {
        ArrayList<Customers> customers = new ArrayList<>();
        customerRepo.findAll().iterator().forEachRemaining(c -> customers.add(c));

        for (Customers c: customers) {
            c.setOrders(orderRepo.findAllByCustomer(c));
        }

        return customers;
    }

    @Override
    public Customers findCustomerByName(String custName)
    {
        return customerRepo.findCustomerByCustName(custName);
    }

    @Override
    public ArrayList<Customers> findAllByAgent(Agents agent)
    {
        return null;
    }

    @Transactional
    @Override
    public Customers save(Customers customer)
    {
        customerRepo.save(customer);

        return customerRepo.findCustomerByCustName(customer.getCustName());
    }

    @Transactional
    @Override
    public Customers update(Customers customer, long custCode)
    {
        return null;
    }

    @Override
    public void delete(long custCode)
    {

    }
}
