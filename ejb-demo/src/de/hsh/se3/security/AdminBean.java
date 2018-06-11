/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.security;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RunAs;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@RunAs("Admin")
@Remote(Admin.class)
public class AdminBean implements Admin {
    
    @EJB
    private LoginManagerBean loginManager;

    @Override
    public String loginAsUser() {
        return loginManager.loginAsUser();
    }

    @Override
    public String loginAsAdmin() {
        return loginManager.loginAsAdmin();
    }
}
