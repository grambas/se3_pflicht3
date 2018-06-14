/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.security;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Singleton;


@Singleton
public class LoginManagerBean {
    
    @RolesAllowed({"User", "Admin"})
    public String loginAsUser() {
        return "Hello USER!";
    }
    
    @RolesAllowed("Admin")
    public String loginAsAdmin() {
        return "Logged in as ADMIN!";
    }
}
