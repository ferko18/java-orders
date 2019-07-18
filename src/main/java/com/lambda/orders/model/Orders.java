package com.lambda.orders.model;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long ordNum;
    private double ordAmount;
    private double advanceAmount;


    @ManyToOne
    @JoinColumn(name="custCode", nullable=false)
    private Customers customer;

    @ManyToOne
    @JoinColumn(name="agentCode", nullable=false)
    private Agents agent;

    private String orderDescription;

}
