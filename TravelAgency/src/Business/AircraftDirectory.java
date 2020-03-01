/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author lzy_1
 */
public class AircraftDirectory {
     private ArrayList<Aircraft> plane;
     public AircraftDirectory(){
     plane= new ArrayList<>();
     //qatar
    Aircraft  Aircraft1=new Aircraft("777","boeing",25,6,150);
    plane.add(Aircraft1);
    //qatar
    Aircraft  Aircraft2=new Aircraft("777","boeing",25,6,150);
    plane.add(Aircraft2);
    //qatar
    Aircraft  Aircraft3=new Aircraft("777","boeing",25,6,150);
    plane.add(Aircraft3);
    //emirates
    Aircraft  Aircraft4=new Aircraft("360","Airbus",25,6,150);
    plane.add(Aircraft4);
    //emirates
    Aircraft  Aircraft5=new Aircraft("360","Airbus",25,6,150);
    plane.add(Aircraft5);
    //canada
    Aircraft  Aircraft6=new Aircraft("321","Boeing",25,6,150);
    plane.add(Aircraft6);
    //canada
    Aircraft  Aircraft7=new Aircraft("321","Boeing",25,6,150);
    plane.add(Aircraft7);
     
     }
     public ArrayList<Aircraft> getAircraftDirectory() {
        return this.plane;
    }

    public void setcus(ArrayList<Customer> cus) {
        this.plane = plane;
    }
    // public void addCustomer(Customer c){
    //   cus.add(c);
    //}

    public Aircraft addplane(String serial,String model,int row ,int column,int totalseat){
        Aircraft a = new Aircraft(serial,model,row,column,totalseat);
        plane.add(a);
        return a;
    }
}
