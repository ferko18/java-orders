package com.lambda.orders.repos;

import com.lambda.orders.model.Customers;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customers, Long>
{
}
