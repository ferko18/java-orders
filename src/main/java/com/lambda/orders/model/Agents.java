package com.lambda.orders.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="agents")
public class Agents
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentCode;

    @Column(unique = true, nullable = false)
    private String agentName;
    private String workingArea;
    private double commision;
    @Column(unique = true, nullable = false)
    private String phone;
    private String country;

    //one agent many customers
    @OneToMany(mappedBy = "agents")
    private List<Customers> customers = new ArrayList<>();

    @OneToMany(mappedBy = "agents")
    private List<Orders> orders = new ArrayList<>();


}
