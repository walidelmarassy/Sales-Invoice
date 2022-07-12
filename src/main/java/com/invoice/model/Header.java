package com.invoice.model;

import java.util.ArrayList;
import java.util.Date;


public class Header {
    private int Number;
    private String customerName;
    private Date invoiceDate;
    private ArrayList<Line> invoiceLines  ;

    public Header(int Number, String customerName, Date invoiceDate) {
        this.Number = Number;
        this.customerName = customerName;
        this.invoiceDate = invoiceDate;
    }

    public Header() {
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
    
    public ArrayList<Line> getInvoiceLines() {
        if(invoiceLines==null){
            invoiceLines=new ArrayList<>();
  
        }
        return invoiceLines;
    }

    public void setInvoiceLines(ArrayList<Line> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }
    
     public double getInvoiceTotalPrice(){
        double totalPrice=0.0;
        int counter;
        for( counter = 0; counter  <getInvoiceLines().size(); counter++){
            totalPrice+=getInvoiceLines().get(counter).getTotalLine();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return  Number+","+invoiceDate+","+customerName;
    }
     
     
}
