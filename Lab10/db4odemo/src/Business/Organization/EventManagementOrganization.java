/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EventManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class EventManagementOrganization extends Organization{
    
    private PartyHallDirectory partyHallDirectory;

    public EventManagementOrganization() {
        super(Organization.Type.EventManager.getValue());
        partyHallDirectory = new PartyHallDirectory();
        
    }

    public PartyHallDirectory getPartyHallDirectory() {
        return partyHallDirectory;
    }

    public void setPartyHallDirectory(PartyHallDirectory partyHallDirectory) {
        this.partyHallDirectory = partyHallDirectory;
    }
    
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EventManagerRole());
        return roles;
    }
     
}