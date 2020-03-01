/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.LeagalAdviser.LegalAdviserDirectory;

import Business.Role.LawyerRole;
import Business.Role.NGOManagerRole;
import Business.Role.Role;
import static Business.Role.Role.RoleType.LawyerRole;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */


public class LegalFirmOrganization extends Organization {
   
    LegalAdviserDirectory legellist;
    
    public LegalFirmOrganization(String name)
    {
        super(Organization.Type.LegalFirm.getValue());
        legellist=new LegalAdviserDirectory();
    }


    public LegalAdviserDirectory getLegellist() {
        return legellist;
    }

    public void setLegellist(LegalAdviserDirectory legellist) {
        this.legellist = legellist;
    }



   
    
    
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new LawyerRole());
       return role;
       
    }   
}