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
    @JoinColumn(name="agentCode", nullable=false)
    private Agents agent;
    //one customer to many orders
    @OneToMany(mappedBy = "customers")
    private List<Orders> orders = new ArrayList<>();

    public Customers(String custName, String custCity, String workingArea, String custCountry, String grade, double openingAmt, double recieveAmt, double paymentAmt, double outstandingAmt, String phone)
    {
        this.custName = custName;
        this.custCity = custCity;
        this.workingArea = workingArea;
        this.custCountry = custCountry;
        this.grade = grade;
        this.openingAmt = openingAmt;
        this.recieveAmt = recieveAmt;
        this.paymentAmt = paymentAmt;
        this.outstandingAmt = outstandingAmt;
        this.phone = phone;
    }

    public int getCustcode()
    {
        return custcode;
    }

    public void setCustcode(int custcode)
    {
        this.custcode = custcode;
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

    public double getRecieveAmt()
    {
        return recieveAmt;
    }

    public void setRecieveAmt(double recieveAmt)
    {
        this.recieveAmt = recieveAmt;
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

    public Agents getAgent()
    {
        return agent;
    }

    public void setAgent(Agents agent)
    {
        this.agent = agent;
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
        return "Customers{" +
                "custcode=" + custcode +
                ", custName='" + custName + '\'' +
                ", custCity='" + custCity + '\'' +
                ", workingArea='" + workingArea + '\'' +
                ", custCountry='" + custCountry + '\'' +
                ", grade='" + grade + '\'' +
                ", openingAmt=" + openingAmt +
                ", recieveAmt=" + recieveAmt +
                ", paymentAmt=" + paymentAmt +
                ", outstandingAmt=" + outstandingAmt +
                ", phone='" + phone + '\'' +
                '}';
    }
}
