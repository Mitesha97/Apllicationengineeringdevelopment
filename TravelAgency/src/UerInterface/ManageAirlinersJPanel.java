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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lzy_1
 */
public class ManageAirlinersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinersJPanel
     */
    private JPanel CardSequenceJPanel;
    private TravelAgency travelagency;
    public ManageAirlinersJPanel(JPanel CardSequenceJPanel, TravelAgency travelagency) {
        initComponents();
        this.CardSequenceJPanel=CardSequenceJPanel;
        this.travelagency=travelagency;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddAirliners = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnViewSchedule = new javax.swing.JButton();
        btnViewSeats = new javax.swing.JButton();
        btnViewFleets = new javax.swing.JButton();

        btnAddAirliners.setText("Add Airliners");
        btnAddAirliners.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAirlinersActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Airliner Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        btnViewSchedule.setText("View Flight Schedule");
        btnViewSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewScheduleActionPerformed(evt);
            }
        });

        btnViewSeats.setText("View Seats");

        btnViewFleets.setText("View Fleets");
        btnViewFleets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFleetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewFleets)
                    .addComponent(btnViewSeats)
                    .addComponent(btnAddAirliners)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnAddAirliners)
                .addGap(27, 27, 27)
                .addComponent(btnViewSchedule)
                .addGap(18, 18, 18)
                .addComponent(btnViewSeats)
                .addGap(18, 18, 18)
                .addComponent(btnViewFleets)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

        private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        for (Airliner a : travelagency.getAirlinerList().getAirlinerDirectory()) {
            Object row[] = new Object[1];
            row[0] = a.getName();
            dtm.addRow(row);
        }
    }
    
    
    private void btnAddAirlinersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAirlinersActionPerformed
        // TODO add your handling code here:
        AddAirlinerJPanel addAirlinerJPanel = new AddAirlinerJPanel(this.CardSequenceJPanel, travelagency);
        this.CardSequenceJPanel.add("AddAirlinerJPanel", addAirlinerJPanel);
        CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_btnAddAirlinersActionPerformed

    private void btnViewScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewScheduleActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            Airliner air = travelagency.getAirlinerList().getAirlinerDirectory().get(selectedRow);
            FlightScheduleJPanel flightScheduleJPanel = new FlightScheduleJPanel(air, this.CardSequenceJPanel, travelagency);
            this.CardSequenceJPanel.add("FlightScheduleJPanel", flightScheduleJPanel);
            CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
    }//GEN-LAST:event_btnViewScheduleActionPerformed

    private void btnViewFleetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFleetsActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow >= 0) {
            Airliner air = travelagency.getAirlinerList().getAirlinerDirectory().get(selectedRow);
            ViewFleetsJPanel viewFleetsJPanel = new ViewFleetsJPanel(air, this.CardSequenceJPanel, travelagency);
            this.CardSequenceJPanel.add("ViewFleetsJPanel", viewFleetsJPanel);
            CardLayout layout = (CardLayout) this.CardSequenceJPanel.getLayout();
            layout.next(CardSequenceJPanel);
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row.");
        }
       
    }//GEN-LAST:event_btnViewFleetsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAirliners;
    private javax.swing.JButton btnViewFleets;
    private javax.swing.JButton btnViewSchedule;
    private javax.swing.JButton btnViewSeats;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}