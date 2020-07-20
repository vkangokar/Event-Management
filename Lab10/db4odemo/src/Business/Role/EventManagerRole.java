/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EventManagementOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.EventManagerRole.EventManagerWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class EventManagerRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EventManagerWorkAreaJPanel(userProcessContainer, account, (EventManagementOrganization)organization, enterprise,business);
    }

//    @Override
//    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
//        return new DoctorWorkAreaJPanel(userProcessContainer, account, (EventManagementOrganization)organization, enterprise);
//    }
    
    
}
