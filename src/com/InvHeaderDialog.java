/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author M E T R O
 */
public class InvHeaderDialog extends JDialog{
    
    private JTextField custNameField;
    private JTextField invDateField;
    
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    
    private JButton okBtn;
    private JButton cancelBtn;
     
    public InvHeaderDialog(ProjectFrame f){
        
        custNameLbl = new JLabel("CustomerName: ");
        custNameField = new JTextField(20);
        
        invDateLbl = new JLabel("Invoice Date");
        invDateField = new JTextField(20);
        
        okBtn = new JButton("Ok");
        cancelBtn = new JButton("Cancel");
        
        okBtn.setActionCommand("createInvOk");
        cancelBtn.setActionCommand("createInvCancel");
        
        okBtn.addActionListener(f);
        cancelBtn.addActionListener(f);
        
        setLayout(new GridLayout(4, 2));
        
        add(custNameLbl);
        add(custNameField);
        
        add(invDateLbl);
        add(invDateField);
        
        add(okBtn);
        add(cancelBtn);
        
        pack();
     }

    public JTextField getCustNameField() {
        return custNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }
     
}
