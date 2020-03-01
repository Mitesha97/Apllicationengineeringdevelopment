/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Organization.Organization;
import Business.Role.ChangeMakerAdminRole;
import Business.Role.VictimAdminRole;
import Business.Role.CommunityAdminRole;

import Business.Role.Role;
import Business.Role.VolunteerAdminRole;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */
public class CommunityEnterprise extends Enterprise {
    public CommunityEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Community);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
       // role.add(new CommunityAdminRole());
       
        role.add(new ChangeMakerAdminRole());
              
        role.add(new VictimAdminRole());
        
        role.add(new VolunteerAdminRole());
       
        return role;
        
    }
}











