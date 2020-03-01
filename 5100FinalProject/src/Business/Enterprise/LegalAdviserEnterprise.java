/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.LawyerRole;
import Business.Role.NGOManagerRole;
import Business.Role.Role;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */
//public class LegalAdviserEnterprise extends Enterprise {
//        public LegalAdviserEnterprise(String name){
//        super(name,Enterprise.EnterpriseType.LegalAdviser);
//    }
//        
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        return null;
//    }
//}
public class LegalAdviserEnterprise extends Enterprise {
    
    public LegalAdviserEnterprise(String name){
        super(name,Enterprise.EnterpriseType.LegalAdviser);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new LawyerRole());
        //role.add(new VolunteerRole());
        return role;
    }
}