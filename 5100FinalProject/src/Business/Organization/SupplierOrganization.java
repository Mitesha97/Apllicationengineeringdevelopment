/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Supplier.Supplier;
import Business.Supplier.SupplierDirectory;
import Business.Role.SupplierManagerRole;
import Business.Role.Role;
import Business.Role.SupplierRole;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */
public class SupplierOrganization extends Organization {
    SupplierDirectory supplierList;

    //Supplier supplier;
    public SupplierOrganization(String name) {
        super(Organization.Type.Supplier.getValue());
        supplierList= new SupplierDirectory();
      
    }

    public SupplierDirectory getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(SupplierDirectory supplierList) {
        this.supplierList = supplierList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new SupplierRole());
        return role;
    }
    
    
    
}








