package com.lambda.orders.services;

import com.lambda.orders.repos.CustomerRepository;
import com.lambda.orders.repos.OrderRepository;
import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
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
    public ArrayList<Customer> findAll()
    {
        ArrayList<Customer> customers = new ArrayList<>();
        customerRepo.findAll().iterator().forEachRemaining(c -> customers.add(c));

        for (Customer c: customers) {
            c.setOrders(orderRepo.findAllByCustomer(c));
        }

        return customers;
    }

    @Override
    public Customer findCustomerByName(String custName)
    {
        return customerRepo.findCustomerByCustName(custName);
    }

    @Override
    public ArrayList<Customer> findAllByAgent(Agent agent)
    {
        return null;
    }

    @Transactional
    @Override
    public Customer save(Customer customer)
    {
        customerRepo.save(customer);

        return customerRepo.findCustomerByCustName(customer.getCustName());
    }

    @Transactional
    @Override
    public Customer update(Customer customer, long custCode)
    {
        return null;
    }

    @Override
    public void delete(long custCode)
    {

    }
}
