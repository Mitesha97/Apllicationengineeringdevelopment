/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Supplier;

import Business.Supplier.Supplier;
import Business.Supplier.Supply;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.SupplierOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.NGOSupplyWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mansi
 */
public class SupplierWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form SupplierWorkArea
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private Ecosystem system;
    private Supplier s;

    public SupplierWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,Ecosystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.enterprise=enterprise;
        this.system=system;

         System.out.println("Supplier List size" +((SupplierOrganization) organization).getSupplierList().getSupplyList().size());
          for (Supplier supplier : ((SupplierOrganization)organization).getSupplierList().getSupplyList()) {
              System.out.println("Supplier List" + supplier.getsName());
            if (account.getEmployee().getName().equals(supplier.getsName())) {
                 s=supplier;
                System.out.println("Supplier Name" + s.getsName());
            }
        }

        if (s.getWorkQueue() == null) {
            WorkQueue w = new WorkQueue();
            s.setWorkQueue(w);
        }
        populateSupplyTable();
        populateCreateTable();
        
    }
    
  
    
         public void populateSupplyTable()
         {
             DefaultTableModel model = (DefaultTableModel) providerReqTbl.getModel();
        
        model.setRowCount(0);
        
        
        for (WorkRequest work : system.getWorkQueue().getWorkRequestList()){
           if(work instanceof NGOSupplyWorkRequest){ 
            Object[] row = new Object[10];
            row[0] = ((NGOSupplyWorkRequest) work).getRtype();
            row[1] = ((NGOSupplyWorkRequest) work).getReq();
            row[2] = ((NGOSupplyWorkRequest) work).getQuantity();
            row[3] = work;
            row[4] = work.getSender();
           
            
            model.addRow(row);
           }
        }
         }
         
        public void populateCreateTable(){
        
            DefaultTableModel model = (DefaultTableModel) createTbl.getModel();
        
            model.setRowCount(0);
            for(Supply supply: s.getSupplyDirectory().getSupplyList()){
            Object[] row = new Object[10];
            row[0] = supply.getRequirementType();
            row[1] = supply.getRequirement();
            row[2] = supply.getQuantity();
            model.addRow(row);
            }
            
        }   
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        providerReqTbl = new javax.swing.JTable();
        assignBtn = new javax.swing.JButton();
        completeBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        createTbl = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        reqTxt = new javax.swing.JTextField();
        qtyTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboReqType = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));

        providerReqTbl.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        providerReqTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirements", "Quantity", "Status", "Source"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(providerReqTbl);

        assignBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        assignBtn.setText("Assign");
        assignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignBtnActionPerformed(evt);
            }
        });

        completeBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        completeBtn.setText("Complete");
        completeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeBtnActionPerformed(evt);
            }
        });

        createTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request Type", "Requirement", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(createTbl);

        addBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addBtn.setText("Create");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Requirement: ");

        reqTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reqTxtKeyTyped(evt);
            }
        });

        qtyTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                qtyTxtKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Quantity   :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("CREATE REQUIREMENTS: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Request Type: ");

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SUPPLIER WORK AREA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(737, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        comboReqType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Food", "Clothes", "Medicine", "Education" }));
        comboReqType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboReqTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 744, Short.MAX_VALUE)
                        .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(qtyTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                            .addComponent(reqTxt)
                                            .addComponent(comboReqType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(addBtn)
                                        .addGap(40, 40, 40)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(assignBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(completeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(comboReqType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reqTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtyTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(35, 35, 35)
                        .addComponent(addBtn))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String type = comboReqType.getSelectedItem().toString();
        String req = reqTxt.getText();
        int quantity = Integer.parseInt(qtyTxt.getText());
        
        if(req.equals("") || req.isEmpty())
        
        {
            JOptionPane.showMessageDialog(null, "Please create requirement");
            return;
        }
        
        
       
        Supply supply = s.getSupplyDirectory().addSupply();
        
        supply.setRequirementType(type);
        supply.setRequirement(req);
        supply.setQuantity(quantity);
        
        
       
        
        populateCreateTable();
        
        
        
        
        //reqTypeTxt.setText("");
        reqTxt.setText("");
        qtyTxt.setText("");
        
    }//GEN-LAST:event_addBtnActionPerformed

    private void assignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignBtnActionPerformed
        int selectedRow = providerReqTbl.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            NGOSupplyWorkRequest nswr = (NGOSupplyWorkRequest) providerReqTbl.getValueAt(selectedRow, 3);

            nswr.setStatus("Pending");
            nswr.setReciever(account);

            populateSupplyTable();

        }
        
        
    }//GEN-LAST:event_assignBtnActionPerformed

    private void completeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeBtnActionPerformed
        
        int selectedRow = providerReqTbl.getSelectedRow();
     
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            NGOSupplyWorkRequest p = (NGOSupplyWorkRequest) providerReqTbl.getValueAt(selectedRow, 3);
            if (p.getReciever() != null) {
                if (p.getStatus().equals("Pending")) {
                    UserAccount a = p.getSender();
                    int temp = 0;
                    if (s.getSupplyDirectory().getSupplyList().size() <= 0) {
                        JOptionPane.showMessageDialog(null, "No Stock available. Request from Supplier");
                        return;
                    }
                    for (Supply supply : s.getSupplyDirectory().getSupplyList()) {
                       
                        if (p.getReq().equals(supply.getRequirement())&& p.getRtype().equals(supply.getRequirementType())) {
                            
                            if (supply.getQuantity() - p.getQuantity() < 0) {
                                JOptionPane.showMessageDialog(null, "Not enough supply. Wait for sometime");
                                return;
                            }
                            supply.setQuantity(supply.getQuantity() - p.getQuantity());
                           temp = 1;
                        }   
                    }
                   
                    if(temp==1){
                    p.setStatus("Complete");
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");
                    }else{
                    p.setStatus("Requested");   
                    JOptionPane.showMessageDialog(null, "No Stock Available, Request Failed !!","Warning",JOptionPane.WARNING_MESSAGE);
                    }
                    populateSupplyTable();
                    populateCreateTable();
                } else {
                    JOptionPane.showMessageDialog(null, "You cannot complete it two times.","Warning",JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign first","Warning",JOptionPane.WARNING_MESSAGE);
            }
                
            //}
        
        
        }
        
        

          

        
    }//GEN-LAST:event_completeBtnActionPerformed

    private void reqTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reqTxtKeyTyped
char c= evt.getKeyChar();
        if(!(Character.isAlphabetic(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACKSPACE))
                {
                    evt.consume();
                }
    }//GEN-LAST:event_reqTxtKeyTyped

    private void qtyTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTxtKeyTyped
char c= evt.getKeyChar();
        if(!(Character.isDigit(c)) || (c==KeyEvent.VK_DELETE) || (c==KeyEvent.VK_BACKSPACE))
                {
                    evt.consume();
                }
    }//GEN-LAST:event_qtyTxtKeyTyped

    private void comboReqTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboReqTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboReqTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton assignBtn;
    private javax.swing.JComboBox<String> comboReqType;
    private javax.swing.JButton completeBtn;
    private javax.swing.JTable createTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable providerReqTbl;
    private javax.swing.JTextField qtyTxt;
    private javax.swing.JTextField reqTxt;
    // End of variables declaration//GEN-END:variables
}
