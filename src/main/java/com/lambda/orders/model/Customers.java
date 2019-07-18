package com.lambda.orders.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customers")
public class Customers
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int custcode;

    @Column( nullable = false)
    private String custName;
    private String custCity;
    private String workingArea;
    private String custCountry;
    private String grade;
    private double openingAmt;
    private double recieveAmt;
    private double paymentAmt;
    private double outstandingAmt;
    private String phone;

    //many customers to one agent
    @ManyToOne
    private Agents agent;
    //one customer to many orders
    @OneToMany(mappedBy = "customers")
    private List<Orders> orders = new ArrayList<>();


}
