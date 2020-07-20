/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

import Business.EcoSystem;
import Business.Enterprise.EMEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Caterer;
import Business.Organization.CatererOrganization;
import Business.Organization.EventManagementOrganization;
import Business.Organization.Organization;
import Business.Organization.PartyHall;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import userinterface.CatererRole.CatererRequestJPanel;

/**
 *
 * @author THISPC
 */
public class ManageCustomerProcessRequest extends javax.swing.JPanel {
    
//     JPanel userProcessContainer;
  LabTestWorkRequest request;
    private JPanel userProcessContainer;
    private UserAccount account;
    private EventManagementOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private WorkRequest request1;
    /**
     * Creates new form ManageCustomerProcessRequest
     */
    public ManageCustomerProcessRequest(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,WorkRequest request1 ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = (EventManagementOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
        this.request1= request1;
        
        populateTable();
       // populateCatererTable();
        //valueLabel.setText(sender.getName());
     
    }

        public void populateTable(){
               DefaultTableModel model = (DefaultTableModel) tblHall1.getModel();
        
        model.setRowCount(0);
        for(Network n : business.getNetworkList())
        {
            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
                if(e instanceof EMEnterprise){
                        for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
                            if(o instanceof EventManagementOrganization){
                                for(PartyHall p : ((EventManagementOrganization)o).getPartyHallDirectory().getPartyHallDirectory()){
                                    Object[] row = new Object[6];
                                    row[0] = p.getName();
                                    row[1] = p.getHallType();
                                    row[2] = p.getPrice();
                        
                                    model.addRow(row);
                                }
                            }
                        }
                }
            }
        }
    
        
            
          
        
    }
    
//    public void populateCatererTable(){
//             DefaultTableModel model = (DefaultTableModel) catererJTable.getModel();
//        
//        model.setRowCount(0);
//        for(Network n : business.getNetworkList())
//        {
//            for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
//                if(e instanceof EMEnterprise){
//                        for(Organization o : e.getOrganizationDirectory().getOrganizationList()){
//                            if(o instanceof CatererOrganization){
//                                for(Caterer c : ((CatererOrganization)o).getCatererDirectory().getCatererDirectory()){
//                                    Object[] row = new Object[6];
//                                    row[0] = c.getName();
//                                    row[1] = c.getCuisineType();
//                                    row[2] = c.getPrice();
//                        
//                                    model.addRow(row);
//                                }
//                            }
//                        }
//                }
//            }
//        }
//        
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        acceptTxt = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHall1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Accept");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));

        acceptTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptTxtActionPerformed(evt);
            }
        });
        add(acceptTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 139, -1));

        SubmitBtn.setText("SELECT");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        tblHall1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hall Type", "Name", "Price"
            }
        ));
        jScrollPane2.setViewportView(tblHall1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 340, 140));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Hall List");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("BOOKING PAGE FOR CUSTOMER");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer Name", "Hall Type", "Hall Name", "Hall Price"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 620, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // TODO add your handling code here:
 //       request.setTestResult(acceptTxt.getText());
  //      request.setStatus("Completed");
//                BookedDetails bookedDetails = new BookedDetails(userProcessContainer, account, organization,enterprise,business);
//        userProcessContainer.add("BookedDetails", bookedDetails);
//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        
        TableModel model = tblHall1.getModel();
        int[] indexs = tblHall1.getSelectedRows();
        Object [] row = new Object [10];
        DefaultTableModel model2 = (DefaultTableModel) jTable1.getModel();
        for(int i =0; i<indexs.length; i++)
        {
            row[0] = model;
            //.getValueAt(indexs[i],0);
           
            row[1] = model.getValueAt(indexs[i],0);
            row[2] = model.getValueAt(indexs[i],1);
           row[3] = model.getValueAt(indexs[i],2);
            model2.addRow(row);
            
         //Component[] componentArray2 = userProcessContainer.getComponents();
       // Component component = componentArray2[componentArray2.length - 1];
        //ManageCustomerRequestJPanel mc = (ManageCustomerRequestJPanel) component;
       // mc.populateTable();
       // CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       // userProcessContainer.add("ManageCustomerRequestJPanel", new ManageCustomerRequestJPanel(userProcessContainer, account, organization,enterprise,business));
       // layout.next(userProcessContainer); 
        
            
            
            populateTable();
            
         
            
                    }
    
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
         userProcessContainer.remove(this);
        Component[] componentArray2 = userProcessContainer.getComponents();
        Component component = componentArray2[componentArray2.length - 1];
        ManageCustomerRequestJPanel mc = (ManageCustomerRequestJPanel) component;
        mc.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void acceptTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField acceptTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblHall1;
    // End of variables declaration//GEN-END:variables
}
