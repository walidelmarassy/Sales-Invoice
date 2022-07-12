
package com.invoice.model;
 

public class Line {
    
    private String nameItems;
    private double priceItems;
    private int count;
    private Header number;

    public Line(String nameItems, double priceItems, int count, Header number) {
        this.nameItems = nameItems;
        this.priceItems = priceItems;
        this.count = count;
        this.number = number;
    }

    public Line() {
    }

    

    public Header getNumber() {
        return number;
    }

    public void setNumber(Header number) {
        this.number = number;
    }

    public String getNameItems() {
        return nameItems;
    }

    public void setNameItems(String nameItems) {
        this.nameItems = nameItems;
    }

    public double getPriceItems() {
        return priceItems;
    }

    public void setPriceItems(double priceItems) {
        this.priceItems = priceItems;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
     public double getTotalLine(){
         return count*priceItems; 
     }
     

    @Override
    public String toString() {
        return number.getNumber()+","+nameItems+","+priceItems+","+count;
    }
    
    

   
    
}
