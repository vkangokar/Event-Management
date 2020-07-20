/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.CatererOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CatererRole.CatererRequestJPanel;
import javax.swing.JPanel;
import userinterface.CatererRole.CatererWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class CatererRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new CatererWorkAreaJPanel(userProcessContainer, account, (CatererOrganization)organization,enterprise,business);
    }
    
}
