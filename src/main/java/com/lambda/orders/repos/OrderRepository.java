package com.lambda.orders.repos;

import com.lambda.orders.model.Orders;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Orders, Long>
{
}
