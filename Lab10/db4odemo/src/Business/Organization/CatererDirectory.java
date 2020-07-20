/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author THISPC
 */
public class CatererDirectory {
      private ArrayList<Caterer> catererDirectory ;

    public ArrayList<Caterer> getCatererDirectory() {
        return catererDirectory;
    }

    public void setCatererDirectory(ArrayList<Caterer> catererDirectory) {
        this.catererDirectory = catererDirectory;
    }
    
    public CatererDirectory(){
        catererDirectory = new ArrayList<Caterer>();
    }
    
}
