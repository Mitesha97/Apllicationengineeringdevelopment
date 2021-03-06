/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.VolunteerRole;
import Business.Volunteer.VolunteerDirectory;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */
public class VolunteerOrganization extends Organization {
    VolunteerDirectory volunteerList;

    public VolunteerOrganization(String name) {
        super(Organization.Type.Volunteer.getValue());
        volunteerList= new VolunteerDirectory();
    }

    public VolunteerDirectory getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(VolunteerDirectory volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VolunteerRole());
       return role;
    }
    
}




