package com.lambda.orders.controllers;

import com.lambda.orders.models.Agent;
import com.lambda.orders.models.Customer;
import com.lambda.orders.services.AgentService;
import com.lambda.orders.services.CustomerService;
import com.lambda.orders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class controller
{
    @Autowired
    AgentService as;
    @Autowired
    CustomerService cs;
    @Autowired
    OrderService os;

    @GetMapping(value="/home")
    public ResponseEntity<?> doTesting()
    {
        return new ResponseEntity<>("welcome to home page", HttpStatus.OK);
    }

    // /customer/order - Returns all customers with their orders
    @GetMapping(value="customer/order")
    public ResponseEntity<?> getAllCustomer()
    {
        ArrayList<Customer> customers = new ArrayList<>(cs.findAll());
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    ///customer/name/{custname} - Returns all orders for a particular based on name
    @GetMapping(value="customer/name/{custname}")
    public ResponseEntity<?> getOrdersByCustomerName(@PathVariable String custname)
    {
        Customer c = cs.findCustomerByName(custname);
        if (c == null) return new ResponseEntity<>("resource not found", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(c, HttpStatus.OK);
    }

    ///data/customer/new - Adds a new customer
    @PostMapping(value="data/customer/new", consumes={"application/json"}, produces="application/json")
    public ResponseEntity<?> addNewCustomer(@Valid @RequestBody Customer customer)
    {
        ArrayList<Agent> agents = as.findAll();

        agents.sort((a1, a2) -> a1.getCustomers().size() - a2.getCustomers().size());
        Agent a = agents.get(0);

        Customer cust = new Customer(customer);
        cust.setAgent(a);
        Customer rtn = cs.save(cust);
        return new ResponseEntity<>(rtn, HttpStatus.OK);
    }


}
