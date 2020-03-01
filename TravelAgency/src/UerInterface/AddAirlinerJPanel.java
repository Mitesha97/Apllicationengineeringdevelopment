/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UerInterface;

import Business.Airliner;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author lzy_1
 */
public class AddAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddAirlinerJPanel
     */
    
    private JPanel CardSequenceJPanel;
    private JPanel addAirlinerJPanel;
    private TravelAgency travelagency;
    public AddAirlinerJPanel(JPanel CardSequenceJPanel, TravelAgency travelagency) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.travelagency=travelagency;
        //this.addAirlinerJPanel=addAirlinerJPanel;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAddAirliners = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        jLabel1.setText("Airliner Name:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSave)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtAddAirliners, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSave)
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtAddAirliners.getText();
        if (!name.equals("")){
        Airliner airliner = travelagency.addAirliners(name);
        airliner.setName(name);
        ManageAirlinersJPanel majpanel = new ManageAirlinersJPanel(this.CardSequenceJPanel, travelagency);
        this.CardSequenceJPanel.add("ManageAirlinersJPanel", majpanel);
            CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
        JOptionPane.showMessageDialog(null,"Airliner created successfully");
        }else {
            JOptionPane.showMessageDialog(null, "Please enter a name.");
        }
        
    
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtAddAirliners;
    // End of variables declaration//GEN-END:variables
}
