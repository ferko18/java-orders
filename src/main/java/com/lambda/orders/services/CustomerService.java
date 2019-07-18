package com.lambda.orders.services;

import com.lambda.orders.model.Agents;
import com.lambda.orders.model.Customers;

import java.util.ArrayList;

public interface CustomerService
{

        Customers save(Customers customer);
        Customers findCustomerByName(String custName);
        ArrayList<Customers> findAll();
        ArrayList<Customers> findAllByAgent(Agents agent);
        Customers update(Customers customer, long custCode);
        void delete(long custCode);

}
