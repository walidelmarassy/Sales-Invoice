
package com.invoice.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class dialogHeader extends JDialog {
    private JTextField customerNameF;
    private JTextField DateF;
    private JLabel customerNameL;
    private JLabel DateL;
    private JButton ok;
    private JButton cancel;

    public dialogHeader(InvoiceFrame invoiceFrame) {
        customerNameL = new JLabel("Customer");
        customerNameF = new JTextField(20);
        DateL = new JLabel("Date:");
        DateF = new JTextField(20);
        ok = new JButton("OK");
        cancel = new JButton("Cancel");
        
        ok.setActionCommand("OKinvoiceH");
        cancel.setActionCommand("CancelinvoiceH");
        
        ok.addActionListener(invoiceFrame.getMenuAction());
        cancel.addActionListener(invoiceFrame.getMenuAction());
        setLayout(new GridLayout(3, 2));
        
        add(DateL);
        add(DateF);
        add(customerNameL);
        add(customerNameF);
        add(ok);
        add(cancel);
        
        pack();
        
    }

    public JTextField getCustomerNameF() {
        return customerNameF;
    }

    public JTextField getDateF() {
        return DateF;
    }
    
}
