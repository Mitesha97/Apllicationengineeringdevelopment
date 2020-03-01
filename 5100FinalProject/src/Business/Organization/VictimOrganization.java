/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;


import Business.Victim.VictimDirectory;
import Business.Role.VictimRole;
import Business.Role.Role;
import java.util.HashSet;

/**
 *
 * @author lzy_1
 */
public class VictimOrganization extends Organization{
   VictimDirectory changeseekerlist;
    public VictimOrganization()
    {
        super(Organization.Type.Victim.getValue());
        changeseekerlist=new VictimDirectory();
    }

    public VictimDirectory getChangeseekerlist() {
        return changeseekerlist;
    }

    public void setChangeseekerlist(VictimDirectory changeseekerlist) {
        this.changeseekerlist = changeseekerlist;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new VictimRole());
        return role;
        
    }
    
}





