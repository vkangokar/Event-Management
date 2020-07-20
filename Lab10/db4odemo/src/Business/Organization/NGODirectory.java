/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author ARCHIE SHAH
 */
public class NGODirectory {
          private ArrayList<NGO> ngoDirectory ;

    public ArrayList<NGO> getNgoDirectory() {
        return ngoDirectory;
    }

    public void setNgoDirectory(ArrayList<NGO> ngoDirectory) {
        this.ngoDirectory = ngoDirectory;
    }
    
    public NGODirectory(){
        ngoDirectory = new ArrayList<NGO>();
    }
    
}

