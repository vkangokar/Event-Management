/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CatererRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class CatererOrganization extends Organization{
     private CatererDirectory catererDirectory;

     public void setCatererDirectory(CatererDirectory catererDirectory) {
        this.catererDirectory = catererDirectory;
    }
    public CatererDirectory getCatererDirectory() {
        return catererDirectory;
    }


    public CatererOrganization() {
        super(Organization.Type.Caterer.getValue());
        catererDirectory = new CatererDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CatererRole());
        return roles;
    }
     
   
    
    
}
