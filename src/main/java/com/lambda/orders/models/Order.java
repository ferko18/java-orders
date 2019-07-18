package com.lambda.orders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long ordNum;

    private double ordAmount, advanceAmount;

    @ManyToOne
    @JoinColumn(name="custCode", nullable=false)
    @JsonIgnoreProperties({"agent", "orders"})
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="agentCode", nullable=false)
    @JsonIgnoreProperties({"orders", "customers"})
    private Agent agent;

    private String ordDescription;

    public Order()
    {
    }

    public Order(double ordAmount, double advanceAmount, Customer customer, Agent agent, String ordDescription)
    {
        this.ordAmount = ordAmount;
        this.advanceAmount = advanceAmount;
        this.customer = customer;
        this.agent = agent;
        this.ordDescription = ordDescription;
    }

    public long getOrdNum()
    {
        return ordNum;
    }

    public void setOrdNum(long ordNum)
    {
        this.ordNum = ordNum;
    }

    public double getOrdAmount()
    {
        return ordAmount;
    }

    public void setOrdAmount(double ordAmount)
    {
        this.ordAmount = ordAmount;
    }

    public double getAdvanceAmount()
    {
        return advanceAmount;
    }

    public void setAdvanceAmount(double advanceAmount)
    {
        this.advanceAmount = advanceAmount;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public Agent getAgent()
    {
        return agent;
    }

    public void setAgent(Agent agent)
    {
        this.agent = agent;
    }

    public String getOrdDescription()
    {
        return ordDescription;
    }

    public void setOrdDescription(String ordDescription)
    {
        this.ordDescription = ordDescription;
    }

    @Override
    public String toString()
    {
        return "Order{" + "ordNum=" + ordNum + ", ordAmount=" + ordAmount + ", advanceAmount=" + advanceAmount + ", ordDescription='" + ordDescription + '\'' + '}';
    }
}