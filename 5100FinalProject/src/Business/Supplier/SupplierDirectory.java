/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author lzy_1
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
        supplierList=new ArrayList<>();
        
    }

    public ArrayList<Supplier> getSupplyList() {
        return supplierList;
    }

    public void setSupplyList(ArrayList<Supplier> supplyList) {
        this.supplierList = supplyList;
    }
    
    public Supplier addSupplier(){
        Supplier s= new Supplier();
        supplierList.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }
    
}



