/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HealthCare;

/**
 *
 * @author mansi
 */
public class Healthcare {
    private String Dname;
    private String Did;
    private static int count;

    public Healthcare() {
        
        
        Did="ORG"+(++count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Healthcare.count = count;
    }
    
    
     
    public String getDname() {
        return Dname;
    }

    public void setDname(String Dname) {
        this.Dname = Dname;
    }

    public String getDid() {
        return Did;
    }

    public void setDid(String Did) {
        this.Did = Did;
    }

   

    @Override
    public String toString(){
    return Dname;
    
    }
    
}
