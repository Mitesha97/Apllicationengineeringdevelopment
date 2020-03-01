/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author lzy_1
 */
public class Aircraft {
    private String serial;
    private String model;
    private int row;
    private int column;
   //private Seat seat;
     private int totalseat;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

   

    

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    

    

    public int getTotalseat() {
        return totalseat;
    }

    public void setTotalseat(int totalseat) {
        this.totalseat = totalseat;
    }

   

  
   
    
     public Aircraft() {
       // seat = new Seat();
       
    }
      public Aircraft(String serial,String model,int row ,int column, int totalseat) {
        this.model = model;
        this.serial = serial;
         this.column = column;
        this.row = row;
        this.totalseat= row * column;
        
        
        
        //this.seat = new Seat(25, 6);
        
        
    }
}
