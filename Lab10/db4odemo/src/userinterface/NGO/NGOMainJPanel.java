/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGO;

/**
 *
 * @author ARCHIE SHAH
 */

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.NGO;
import Business.Organization.NGO;
import Business.Organization.NGOOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.NGO;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class NGOMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOMainJPanel
     */
        private JPanel userProcessContainer;
    private UserAccount account;
    private NGOOrganization NGOOrganization;
    private Enterprise enterprise;
    private EcoSystem business;
    
    public NGOMainJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
                this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.NGOOrganization = (NGOOrganization)organization;
        this.enterprise = enterprise;
        this.business = business;
    }

            public void populateTable(){
           DefaultTableModel model = (DefaultTableModel) ngoJTable.getModel();
        
        model.setRowCount(0);
        for (NGO n  : NGOOrganization.getNgoDirectory().getNgoDirectory()){
            Object[] row = new Object[6];
            row[0] = n.getType();
            row[1] = n.getName();
            row[2] = n.getNumOfPeople();
            
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngoJTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        nopTF = new javax.swing.JTextField();
        cbxType = new javax.swing.JComboBox();
        addNGOBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 237, -1, -1));

        jLabel1.setText("Name:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 186, -1, -1));

        ngoJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Type", "Number of People"
            }
        ));
        jScrollPane1.setViewportView(ngoJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 57, 375, 91));

        jLabel3.setText("Number of people:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 289, -1, -1));

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 183, 100, -1));
        add(nopTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 286, 100, -1));

        cbxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Orphanage", "Old Age Home" }));
        cbxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTypeActionPerformed(evt);
            }
        });
        add(cbxType, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 234, 100, -1));

        addNGOBtn.setBackground(new java.awt.Color(0, 102, 255));
        addNGOBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addNGOBtn.setForeground(new java.awt.Color(255, 255, 255));
        addNGOBtn.setText("Add");
        addNGOBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNGOBtnActionPerformed(evt);
            }
        });
        add(addNGOBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void cbxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTypeActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTypeActionPerformed

    private void addNGOBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNGOBtnActionPerformed
        // TODO add your handling code here:
        NGO ngo = new NGO();
        ngo.setType(cbxType.getSelectedItem().toString());
        ngo.setName(nameTF.getText());
        ngo.setNumOfPeople(Integer.parseInt(nopTF.getText()));

        NGOOrganization.getNgoDirectory().getNgoDirectory().add(ngo);
        populateTable();
    }//GEN-LAST:event_addNGOBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addNGOBtn;
    private javax.swing.JComboBox cbxType;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTable ngoJTable;
    private javax.swing.JTextField nopTF;
    // End of variables declaration//GEN-END:variables
}
