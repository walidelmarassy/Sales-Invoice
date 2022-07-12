
package com.invoice.view;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class dialogLine extends JDialog{
    private JTextField itemNameF;
    private JTextField itemCountF;
    private JTextField itemPriceF;
    private JLabel itemNameL;
    private JLabel itemCountL;
    private JLabel itemPriceL;
    private JButton okBtn;
    private JButton cancelBtn;
    
    public dialogLine(InvoiceFrame invoiceFrame) {
        itemNameF = new JTextField(20);
        itemNameL = new JLabel("item Name");
        itemCountF = new JTextField(20);
        itemCountL = new JLabel("item Count");
        itemPriceF = new JTextField(20);
        itemPriceL = new JLabel("item Price");
        okBtn = new JButton("OK");
        cancelBtn = new JButton("Cancel");
        okBtn.setActionCommand("OKinvoiceL");
        cancelBtn.setActionCommand("CancelinvoiceL");
        okBtn.addActionListener(invoiceFrame.getMenuAction());
        cancelBtn.addActionListener(invoiceFrame.getMenuAction());
        setLayout(new GridLayout(4, 2));
        
        add(itemNameL);
        add(itemNameF);
        add(itemCountL);
        add(itemCountF);
        add(itemPriceL);
        add(itemPriceF);
        add(okBtn);
        add(cancelBtn);
        
        pack();
    }

    public JTextField getItemNameF() {
        return itemNameF;
    }

    public JTextField getItemCountF() {
        return itemCountF;
    }

    public JTextField getItemPriceF() {
        return itemPriceF;
    }
}
