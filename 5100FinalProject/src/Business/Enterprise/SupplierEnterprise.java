/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;



import Business.Role.Role;
import Business.Role.SupplierManagerRole;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */
public class SupplierEnterprise extends Enterprise {
    public SupplierEnterprise(String name){
        super(name, Enterprise.EnterpriseType.Supplier);
        
    } 
    @Override
    public HashSet<Role> getSupportedRole(){
        new SupplierManagerRole();
        return role;
        
    }
}





