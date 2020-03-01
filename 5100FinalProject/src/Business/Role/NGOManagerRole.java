/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.NGOManager.ManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author lzy_1
 */
public class NGOManagerRole extends Role {
        @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system){
        return new ManagerWorkArea(userProcessContainer,account,(NGOOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return RoleType.NGOManagerRole.getValue();
}
}


