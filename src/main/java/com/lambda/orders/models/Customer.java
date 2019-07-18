package com.lambda.orders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customers")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long custCode;

    @Column(unique=true)
    private String custName;

    private String custCity, workingArea, custCountry, grade;
    private double openingAmt, receiveAmt, paymentAmt, outstandingAmt;
    private String phone;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="agentCode", nullable=false)
    @JsonIgnoreProperties({"customers", "orders", "hibernateLazyInitializer"})
    private Agent agent;

    @OneToMany(mappedBy="customer")
    @JsonIgnoreProperties({"customer", "agent", "hibernateLazyInitialiaer"})
    private List<Order> orders = new ArrayList<>();

    public Customer()
    {
    }

    public Customer(String custName, String custCity, String workingArea, String custCountry, String grade, double openingAmt, double receiveAmt, double paymentAmt, double outstandingAmt, String phone, Agent agent)
    {
        this.custName = custName;
        this.custCity = custCity;
        this.workingArea = workingArea;
        this.custCountry = custCountry;
        this.grade = grade;
        this.openingAmt = openingAmt;
        this.receiveAmt = receiveAmt;
        this.paymentAmt = paymentAmt;
        this.outstandingAmt = outstandingAmt;
        this.phone = phone;
        this.agent = agent;
    }

    public Customer(String custName, String custCity, String workingArea, String custCountry, String grade, double openingAmt, double receiveAmt, double paymentAmt, double outstandingAmt, String phone)
    {
        this.custName = custName;
        this.custCity = custCity;
        this.workingArea = workingArea;
        this.custCountry = custCountry;
        this.grade = grade;
        this.openingAmt = openingAmt;
        this.receiveAmt = receiveAmt;
        this.paymentAmt = paymentAmt;
        this.outstandingAmt = outstandingAmt;
        this.phone = phone;
    }

    public Customer(Customer c)
    {
        this.custName = c.getCustName();
        this.custCity = c.getCustCity();
        this.workingArea = c.getWorkingArea();
        this.custCountry = c.getCustCountry();
        this.grade = c.getGrade();
        this.openingAmt = c.getOpeningAmt();
        this.receiveAmt = c.getReceiveAmt();
        this.paymentAmt = c.getPaymentAmt();
        this.outstandingAmt = c.getOutstandingAmt();
        this.phone = c.getPhone();
        this.agent = c.getAgent();
        this.orders = c.getOrders();
    }

    public long getCustCode()
    {
        return custCode;
    }

    public void setCustCode(long custCode)
    {
        this.custCode = custCode;
    }

    public String getCustName()
    {
        return custName;
    }

    public void setCustName(String custName)
    {
        this.custName = custName;
    }

    public String getCustCity()
    {
        return custCity;
    }

    public void setCustCity(String custCity)
    {
        this.custCity = custCity;
    }

    public String getWorkingArea()
    {
        return workingArea;
    }

    public void setWorkingArea(String workingArea)
    {
        this.workingArea = workingArea;
    }

    public String getCustCountry()
    {
        return custCountry;
    }

    public void setCustCountry(String custCountry)
    {
        this.custCountry = custCountry;
    }

    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public double getOpeningAmt()
    {
        return openingAmt;
    }

    public void setOpeningAmt(double openingAmt)
    {
        this.openingAmt = openingAmt;
    }

    public double getReceiveAmt()
    {
        return receiveAmt;
    }

    public void setReceiveAmt(double receiveAmt)
    {
        this.receiveAmt = receiveAmt;
    }

    public double getPaymentAmt()
    {
        return paymentAmt;
    }

    public void setPaymentAmt(double paymentAmt)
    {
        this.paymentAmt = paymentAmt;
    }

    public double getOutstandingAmt()
    {
        return outstandingAmt;
    }

    public void setOutstandingAmt(double outstandingAmt)
    {
        this.outstandingAmt = outstandingAmt;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public Agent getAgent()
    {
        return agent;
    }

    public void setAgent(Agent agent)
    {
        this.agent = agent;
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
        return "Customer{" + "custCode=" + custCode + ", custName='" + custName + '\'' + ", custCity='" + custCity + '\'' + ", workingArea='" + workingArea + '\'' + ", custCountry='" + custCountry + '\'' + ", grade='" + grade + '\'' + ", openingAmt=" + openingAmt + ", receiveAmt=" + receiveAmt + ", paymentAmt=" + paymentAmt + ", outstandingAmt=" + outstandingAmt + ", phone='" + phone + '\'' + '}';
    }
}