/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.DoctorAdminRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author mansi
 */
public class HealthcareEnterprise extends Enterprise{
     public HealthcareEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Healthcare);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       // role.add(new CommunityAdminRole());
       
        role.add(new DoctorRole());
              
        
       
        return role;
        
    }
}
