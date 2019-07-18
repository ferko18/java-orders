package com.lambda.orders.services;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;

import java.util.ArrayList;

public interface CustomerService
{

        Customer save(Customer customer);
        Customer findCustomerByName(String custName);
        ArrayList<Customer> findAll();
        ArrayList<Customer> findAllByAgent(Agent agent);
        Customer update(Customer customer, long custCode);
        void delete(long custCode);

}
