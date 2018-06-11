/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.security.client;

import de.hsh.se3.security.Admin;
import de.hsh.se3.security.User;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;


public class SecurityClient {
    
    public void demonstrate() throws Exception {
        Properties prop = new Properties();
        Context jndiContext = new InitialContext(prop);
        
        Admin admin = (Admin) jndiContext.lookup(Admin.class.getName());
        User user = (User) jndiContext.lookup(User.class.getName());
        
        System.out.println("Logging in as User with Admin-Role...");
        System.out.println("Success: " + admin.loginAsUser());
        System.out.println();
        
        Thread.sleep(1000);
        
        System.out.println("Logging in as Admin with Admin-Role...");
        System.out.println("Success: " + admin.loginAsAdmin());
        System.out.println();
        
        Thread.sleep(1000);
        
        System.out.println("Logging in as User with User-Role...");
        System.out.println("Success: " + user.loginAsUser());
        System.out.println();
        
        Thread.sleep(1000);
        
        System.out.println("Logging in as Admin with User-Role...");
        try {
            System.out.println(user.loginAsAdmin());
        } catch(Exception ex) {
            System.out.println("Error: " + ex);
        }
        System.out.println();
    }
    
    public static void main(String[] args) throws Exception {
        SecurityClient sc = new SecurityClient();
        sc.demonstrate();
    }
}
