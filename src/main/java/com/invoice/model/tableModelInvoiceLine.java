
package com.invoice.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class tableModelInvoiceLine extends AbstractTableModel {
        private ArrayList<Line> arrInvoiceLine;

    public tableModelInvoiceLine(ArrayList<Line> arrInvoiceLine) {
        this.arrInvoiceLine = arrInvoiceLine;
    }
        
        


    @Override
    public int getRowCount() {
        return arrInvoiceLine == null ? 0 :  arrInvoiceLine.size();
    }

    @Override
    public int getColumnCount() {
        return  5;
    }

    @Override
    public String getColumnName(int c) {
         switch(c){
            case 0: return "No.";
            case 1: return "Item Name";
            case 2: return "Item Price";
            case 3: return "Count";
            case 4: return "Item Total";
        
        }
        return "";
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
          Line invLine = arrInvoiceLine.get(rowIndex);
        switch (columnIndex){
            case 0:return  invLine.getNumber().getNumber();
            case 1:return  invLine.getNameItems();
            case 2:return  invLine.getPriceItems();
            case 3:return  invLine.getCount();
            case 4:return  invLine.getTotalLine();
        
        }
        
        return "";
    }

    public ArrayList<Line> getArrInvoiceLine() {
        return arrInvoiceLine;
    }

    public void setArrInvoiceLine(ArrayList<Line> arrInvoiceLine) {
        this.arrInvoiceLine = arrInvoiceLine;
    }
    
}
