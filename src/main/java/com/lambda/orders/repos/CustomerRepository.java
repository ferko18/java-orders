package com.lambda.orders.repos;

import com.lambda.orders.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    Customer findCustomerByCustName(String custName);
}
