package com.lambda.orders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="agents")
public class Agent
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long agentCode;
    private String agentName, workingArea;
    private double commission;
    private String phone, country;

    @OneToMany(mappedBy="agent",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties({"agent", "orders"})
    private List<Customer> customers = new ArrayList<>();


    @OneToMany(mappedBy="agent",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties({"customer", "agent"})
    private List<Order> orders = new ArrayList<>();

    public Agent()
    {
    }

    public Agent(String agentName, String workingArea, double commission, String phone, String country)
    {
        this.agentName = agentName;
        this.workingArea = workingArea;
        this.commission = commission;
        this.phone = phone;
        this.country = country;
    }

    public long getAgentCode()
    {
        return agentCode;
    }

    public void setAgentCode(long agentCode)
    {
        this.agentCode = agentCode;
    }

    public String getAgentName()
    {
        return agentName;
    }

    public void setAgentName(String agentName)
    {
        this.agentName = agentName;
    }

    public String getWorkingArea()
    {
        return workingArea;
    }

    public void setWorkingArea(String workingArea)
    {
        this.workingArea = workingArea;
    }

    public double getCommission()
    {
        return commission;
    }

    public void setCommission(double commission)
    {
        this.commission = commission;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public List<Customer> getCustomers()
    {
        return customers;
    }

    public void setCustomers(List<Customer> customers)
    {
        this.customers = customers;
    }

    public List<Order> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Order> orders)
    {
        this.orders = orders;
    }

    @Override
    public String toString()
    {
        return "Agent{" + "agentCode=" + agentCode + ", agentName='" + agentName + '\'' + ", workingArea='" + workingArea + '\'' + ", commission=" + commission + ", phone='" + phone + '\'' + ", country='" + country + '\'' + '}';
    }
}