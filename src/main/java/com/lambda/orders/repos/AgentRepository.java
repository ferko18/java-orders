package com.lambda.orders.repos;

import com.lambda.orders.model.Agents;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agents, Long>
{


}
