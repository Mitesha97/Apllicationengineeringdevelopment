/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LeagalAdviser;

import java.util.ArrayList;

/**
 *
 * @author lzy_1
 */
public class LegalAdviserDirectory {
        private ArrayList<LegalAdviser> legaladviserList;

    public LegalAdviserDirectory() {
        legaladviserList=new ArrayList();
        
    }

    public ArrayList<LegalAdviser> getLegaladviserList() {
        return legaladviserList;
    }

    public void setLegaladviserList(ArrayList<LegalAdviser> legaladviserList) {
        this.legaladviserList = legaladviserList;
    }
    
        public LegalAdviser addLegalAdviser(){
        LegalAdviser l= new LegalAdviser();
        legaladviserList.add(l);
        return l;
    }
    
    public void removeLegalAdviser(LegalAdviser l){
        legaladviserList.remove(l);
    }
}

