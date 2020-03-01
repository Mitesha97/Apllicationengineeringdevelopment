/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthCare;

import java.util.ArrayList;

/**
 *
 * @author mansi
 */
public class HealthcareDirectory {
    private ArrayList<Healthcare> healthcaredirectory;
    
    public HealthcareDirectory() {
    healthcaredirectory= new ArrayList();
    }

    public ArrayList<Healthcare> getHealthcareDirectory() {
        return healthcaredirectory;
    }

    public void setHealthcareDirectory(ArrayList<Healthcare> healthcaredirectory) {
        this.healthcaredirectory = healthcaredirectory;
    }
    
    public Healthcare addHealthCare(){
        Healthcare h =new Healthcare();
        healthcaredirectory.add(h);
        return h;
    }
    
    public void removeHealthCare(Healthcare healthcare){
        healthcaredirectory.remove(healthcare);   
    }
    
}
