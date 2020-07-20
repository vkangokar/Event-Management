/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.NGORole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ARCHIE SHAH
 */
public class NGOOrganization extends Organization  {
    
       private NGODirectory ngoDirectory;

    public NGODirectory getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(NGODirectory ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }
    
        public NGOOrganization() {
        super(Organization.Type.NGO.getValue());
        ngoDirectory=new NGODirectory();
    }
        
            @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGORole());
        return roles;
    }
}
