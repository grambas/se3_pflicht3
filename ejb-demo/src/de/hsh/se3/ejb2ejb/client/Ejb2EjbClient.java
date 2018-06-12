/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.ejb2ejb.client;

import de.hsh.se3.ejb2ejb.entities.Called;
import de.hsh.se3.ejb2ejb.entities.Caller;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Pyterion
 */
public class Ejb2EjbClient {
    public static void main(String[] args) throws NamingException{
        Properties prop = new Properties();
        Context jndiContext = new InitialContext(prop);
        
        Caller caller = (Caller) jndiContext.lookup(Caller.class.getName());
        Called called = (Called) jndiContext.lookup(Called.class.getName());
        
        caller.setAttribute("testAttribute");
        caller.sendAttr2CalledBean();
        String recAttribute = called.getAttribute();
        
        System.out.println(recAttribute);
    }
}
