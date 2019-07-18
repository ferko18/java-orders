package com.lambda.orders.repos;

import com.lambda.orders.model.Customers;
import com.lambda.orders.model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders, Long>
{
    List<Orders> findAllByCustomer(Customers customer);
}
