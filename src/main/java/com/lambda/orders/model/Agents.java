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
    private double commission;
    @Column(unique = true, nullable = false)
    private String phone;
    private String country;

    //one agent many customers
    @OneToMany(mappedBy = "agents")
    private List<Customers> customers = new ArrayList<>();

    @OneToMany(mappedBy = "agents")
    private List<Orders> orders = new ArrayList<>();

    public Agents(String agentName, String workingArea, double commission, String phone, String country)
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

    public List<Customers> getCustomers()
    {
        return customers;
    }

    public void setCustomers(List<Customers> customers)
    {
        this.customers = customers;
    }

    public List<Orders> getOrders()
    {
        return orders;
    }

    public void setOrders(List<Orders> orders)
    {
        this.orders = orders;
    }

    @Override
    public String toString()
    {
        return "Agents{" +
                "agentCode=" + agentCode +
                ", agentName='" + agentName + '\'' +
                ", workingArea='" + workingArea + '\'' +
                ", commission=" + commission +
                ", phone='" + phone + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
