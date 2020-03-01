/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.HealthCare.HealthcareDirectory;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author mansi
 */
public class DoctorOrganization extends Organization {
    HealthcareDirectory doctorList;
    
    public DoctorOrganization()
    {
        super(Organization.Type.Doctor.getValue());
        doctorList= new HealthcareDirectory();
    }

    public HealthcareDirectory getChangemakerlist() {
        return doctorList;
    }

    public void setChangemakerlist(HealthcareDirectory doctorList) {
        this.doctorList = doctorList;
    }
    
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DoctorRole());
       return role;
    }
    
}
