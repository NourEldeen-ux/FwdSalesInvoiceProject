/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

/**
 *
 * @author M E T R O
 */
public class InvoiceLine {
    private String itemName;
    private double itemPrice;
    private int count;
    private double itemTotal;
    private InvoiceHeader inoviceHeader;

    public InvoiceLine(String itemName, double itemPrice, int count, InvoiceHeader inoviceHeader) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
        this.inoviceHeader = inoviceHeader;
        this.setItemTotal(this.count * this.itemPrice);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double price) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public InvoiceHeader getInovice() {
        return inoviceHeader;
    }

    public void setInovice(InvoiceHeader inovice) {
        this.inoviceHeader = inoviceHeader;
    }

    
}
