/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CatererRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Caterer;
import Business.Organization.CatererDirectory;
import Business.Organization.CatererOrganization;
import Business.Organization.EventManagementOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.Caterer;
import Business.Organization.PartyHall;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THISPC
 */
public class ManageCaterersJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    private CatererOrganization catererOrganization;
    private Enterprise enterprise;
    private EcoSystem business;

    /**
     * Creates new form ManageCaterers
     */
    public ManageCaterersJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.catererOrganization = (CatererOrganization) organization;
        this.enterprise = enterprise;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) catererTbl.getModel();

        model.setRowCount(0);
//        if (catererOrganization != null) {
//            CatererDirectory cd = catererOrganization.getCatererDirectory();
//            if (cd != null) {
//                for (Caterer c : catererOrganization.getCatererDirectory().getCatererDirectory()) {
//                    Object[] row = new Object[3];
//                    row[0] = c.getCuisineType();
//                    row[1] = c.getName();
//                    row[2] = c.getPrice();
//
//                    model.addRow(row);
//
//                }
//            }
//        }
        for (Caterer c  : catererOrganization.getCatererDirectory().getCatererDirectory()){
            Object[] row = new Object[3];
            row[0] = c.getCuisineType();
            row[1] = c.getName();
            row[2] = c.getPrice();
            
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
        catererTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctBox = new javax.swing.JComboBox();
        nameTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        addCatererBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        catererTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CuisineType", "Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(catererTbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 91, -1, 139));

        jLabel1.setText("CuisineType");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 291, -1, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 335, -1, -1));

        jLabel3.setText("Price");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 379, -1, -1));

        ctBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Italain", "Indian", "Spanish", "Chinese" }));
        add(ctBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 288, 113, -1));
        add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 332, 113, -1));
        add(priceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 376, 113, -1));

        addCatererBtn.setBackground(new java.awt.Color(0, 102, 255));
        addCatererBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        addCatererBtn.setForeground(new java.awt.Color(255, 255, 255));
        addCatererBtn.setText("Add");
        addCatererBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCatererBtnActionPerformed(evt);
            }
        });
        add(addCatererBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addCatererBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCatererBtnActionPerformed

        if( nameTxt.getText().isEmpty() || priceTxt.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Fields Cannot be Empty");
        }

        else{
        try{
            Integer.parseInt(priceTxt.getText());
            
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Price should be numbers");
            return;
        }

        // TODO add your handling code here:
        Caterer ch = new Caterer();
        ch.setCuisineType(ctBox.getSelectedItem().toString());
        ch.setName(nameTxt.getText());
        ch.setPrice(Integer.parseInt(priceTxt.getText()));

        catererOrganization.getCatererDirectory().getCatererDirectory().add(ch);
        populateTable();
        
        JOptionPane.showMessageDialog(null, "Entry created successfully");
        nameTxt.setText("");
        priceTxt.setText("");
        }

    }//GEN-LAST:event_addCatererBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCatererBtn;
    private javax.swing.JTable catererTbl;
    private javax.swing.JComboBox ctBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField priceTxt;
    // End of variables declaration//GEN-END:variables
}
