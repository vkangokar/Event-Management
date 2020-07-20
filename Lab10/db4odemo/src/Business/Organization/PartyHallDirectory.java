/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Shephali Mahajan
 */
public class PartyHallDirectory {
    private ArrayList<PartyHall> partyHallDirectory ;
    
    public PartyHallDirectory(){
        partyHallDirectory = new ArrayList<PartyHall>();
    }

    public ArrayList<PartyHall> getPartyHallDirectory() {
        return partyHallDirectory;
    }

    public void setPartyHallDirectory(ArrayList<PartyHall> partyHallDirectory) {
        this.partyHallDirectory = partyHallDirectory;
    }
    
    
    
}
