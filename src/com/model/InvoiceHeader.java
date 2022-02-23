/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author M E T R O
 */
public class InvoiceHeader {
    private int invNum;
    private Date invDate;
    private String custName;
    private double invTotal;
    private ArrayList<InvoiceLine> lines ; 


    public InvoiceHeader(int invNum, Date invDate, String custName) {
        this.invNum = invNum;
        this.invDate = invDate;
        this.custName = custName;
    }

    public int getInvNum() {
        return invNum;
    }

    public void setInvNum(int num) {
        this.invNum = invNum;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date date) {
        this.invDate = invDate;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public double getInvTotal() {
        return invTotal;
    }

    public void setInvTotal(double invTotal) {
        this.invTotal = invTotal;
    }

    public ArrayList<InvoiceLine> getLines() {
        if (lines == null)
               lines = new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    
    public void addLine(InvoiceLine line){
        getLines().add(line);
        setInvTotal(getInvTotal() + line.getItemTotal());  
    
    }
    
}
