/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LeagalAdviser;

import Business.WorkQueue.WorkQueue;

/**
 *
 * @author lzy_1
 */
public class LegalAdviser {
    private String Name;
    private static int Count=0;
    private String LegalAdviserId;
    private WorkQueue workQueue;
//    private LegalAdviserDirectory LegalAdviserDirectory;
    
       public LegalAdviser() {
        
        LegalAdviserId = "Legal"+(++Count);
        workQueue= new WorkQueue();
//        LegalAdviserDirectory = new LegalAdviserDirectory();
    }

//    public LegalAdviserDirectory getLegalAdviserDirectory() {
//        return LegalAdviserDirectory;
//    }
//
//    public void setLegalAdviserDirectory(LegalAdviserDirectory LegalAdviserDirectory) {
//        this.LegalAdviserDirectory = LegalAdviserDirectory;
//    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        LegalAdviser.Count = Count;
    }

    public String getLegalAdviserId() {
        return LegalAdviserId;
    }

    public void setLegalAdviserId(String LegalAdviserId) {
        this.LegalAdviserId = LegalAdviserId;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
       
    
        @Override
    public String toString(){
        return Name;
    }
       
}
