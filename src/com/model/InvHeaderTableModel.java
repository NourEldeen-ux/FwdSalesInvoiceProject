/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author M E T R O
 */
public class InvHeaderTableModel extends AbstractTableModel{
    
    private String [] colsNames = {"Inv Num", "Invoice Date", "Customer name" , "Total"};
    private ArrayList<InvoiceHeader> invoices;
    
    public InvHeaderTableModel(ArrayList<InvoiceHeader> invoices){
        this.colsNames = colsNames;
        this.invoices = invoices;
    
    } 

    @Override
    public int getColumnCount() {
        return colsNames.length;
    
    }

    @Override
    public String getColumnName(int column) {
        return colsNames[column];
    }
    
    

    @Override
    public int getRowCount() {
        if(this.invoices == null){
            invoices = new ArrayList<>();
        }
       
        return invoices.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        InvoiceHeader inv = invoices.get(row);
        
        switch(column){
            case 0: return inv.getInvNum();
            case 1: return inv.getCustName();
            case 2: return inv.getInvDate();
            case 3: return inv.getInvTotal();
        }
        
        return null;
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }
    
    
    
}
