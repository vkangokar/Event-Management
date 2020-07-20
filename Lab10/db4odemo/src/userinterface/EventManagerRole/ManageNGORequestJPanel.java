/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CatererOrganization;
import Business.Organization.EventManagementOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.CustomerRole.CustomerRequestJPanel;

/**
 *
 * @author THISPC
 */
public class ManageNGORequestJPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private EventManagementOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;


    /**
     * Creates new form ManageNGORequestJPanel
     */
    public ManageNGORequestJPanel(JPanel userProcessContainer, UserAccount account, EventManagementOrganization emOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = emOrganization;
        this.enterprise = enterprise;
        this.business = business;
        populateRequestTable();
     //   populateCatererLeftFoodTable();
        
     
    }
    
     public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) NGOJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[6];
            
            row[0] = request.getSender();
            row[1] = request.getReceiver();
            row[2] = request.getQuantity();
            row[3] = request.getStatus();
            
            String result = ((LabTestWorkRequest) request).getTestResult();
            row[4] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
     }
      
   //  public void populateCatererLeftFoodTable(){
    //    DefaultTableModel model = (DefaultTableModel)CatererNotifyJTable.getModel();
        
    //    model.setRowCount(0);
        
      //  for(WorkRequest request :account.getWorkQueue().getWorkRequestList()){
        //    Object[] row = new Object[5];
          //  row[0] = request;
        //    row[1] = request.getSender().getEmployee().getName();
          //  row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
          //  row[4] = request.getStatus();
            //row[3] = request.getLeftFoodQuantity();
           // row[5] = request.getLeftFoodType();
            //row[5] = request.getSender();
            
            
          //  model.addRow(row);
     //   }
   // }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        NGOJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        requestBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NGOJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(NGOJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 145));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 43, -1, -1));

        requestBtn.setBackground(new java.awt.Color(0, 102, 255));
        requestBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        requestBtn.setForeground(new java.awt.Color(255, 255, 255));
        requestBtn.setText("Left Food Request");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });
        add(requestBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, -1, -1));

        backBtn.setBackground(new java.awt.Color(0, 102, 255));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        jLabel1.setText("Notications to NGO:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
          CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ManageNGOProcessRequestJPanel", new ManageNGOProcessRequestJPanel(userProcessContainer, account, organization,enterprise,business));
        layout.next(userProcessContainer);
        
        populateRequestTable();
    }//GEN-LAST:event_requestBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateRequestTable();
       // populateCatererLeftFoodTable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable NGOJTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton requestBtn;
    // End of variables declaration//GEN-END:variables
}
