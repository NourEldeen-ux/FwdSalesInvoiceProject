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
public class InvLineTableModel extends AbstractTableModel {

     private String [] colsNames = {"Item Name", "Item Price", "Count" , "Line Total"}; 
     private  ArrayList<InvoiceLine> line;
     
     
    public InvLineTableModel(ArrayList<InvoiceLine> line){    
       
        this.line = line;
    
    } 
 
    
    
    @Override
    public int getRowCount() {
       
        return line.size();
       
    }

    @Override
    public int getColumnCount() {
      
        return colsNames.length;
      
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        InvoiceLine row = line.get(rowIndex);
        switch (columnIndex){
            case 0 : return row.getItemName();
            case 1 : return row.getItemPrice();
            case 2 : return row.getCount();
            case 3 : return row.getItemTotal();
        
        }
          return ""; 
    }
    
    @Override  
    public String getColumnName(int column){
        System.out.println("Col Name Called");
        return colsNames[column];
    }

    public ArrayList<InvoiceLine> getLine() {
        return line;
    }



}
