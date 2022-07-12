
package com.invoice.model;
import com.invoice.view.InvoiceFrame;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class tableModelInvoiceHead extends AbstractTableModel{
    private ArrayList<Header> arrInvoiceHeader;

    public tableModelInvoiceHead(ArrayList<Header> arrInvoiceHeader) {
        this.arrInvoiceHeader = arrInvoiceHeader;
    }


    @Override
    public int getRowCount() {
        return arrInvoiceHeader.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Header invHeaders = arrInvoiceHeader.get(rowIndex);
        switch (columnIndex){
            case 0:return  invHeaders.getNumber();
            case 1:return  InvoiceFrame.dateformat.format(invHeaders.getInvoiceDate());
            case 2:return  invHeaders.getCustomerName();
            case 3:return  invHeaders.getInvoiceTotalPrice();
        
        }
        
        return "";
    }

    @Override
    public String getColumnName(int c) {
        switch(c){
            case 0: return "No.";
            case 1: return "Date";
            case 2: return "Customer";
            case 3: return "Total";
        
        }
        return "";
    }
    
    
}
