/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Shephali Mahajan
 */
public class CustomerEnterprise extends Enterprise{
    public CustomerEnterprise(String name){
        super(name,EnterpriseType.Customer);
    }
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
