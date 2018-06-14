/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsh.se3.session.client;

import de.hsh.se3.client.Client;
import de.hsh.se3.ejbLifecycle.entities._Singleton;
import de.hsh.se3.ejbLifecycle.entities._Stateful;
import de.hsh.se3.ejbLifecycle.entities._Stateless;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author acer
 */
public class SessionClient implements Client{
    
    @Override
    public void demonstrate() throws Exception {
        Properties prop = new Properties();
        Context jndiContext = new InitialContext(prop);
        
        _Stateful stateful = (_Stateful) jndiContext.lookup(_Stateful.class.getName());
        _Stateless stateless = (_Stateless) jndiContext.lookup(_Stateless.class.getName());
               
        System.out.println("Stateless Vorher: " + stateless.getNumber());
        stateless.increment();
        _Stateless stateless1 = (_Stateless) jndiContext.lookup(_Stateless.class.getName());
        System.out.println("Stateless Nachher: " + stateless1.getNumber());
        
        System.out.println("Stateful Vorher: " + stateful.getNumber());
        stateful.increment();
        _Stateful stateful1 = (_Stateful) jndiContext.lookup(_Stateful.class.getName());
        System.out.println("Stateful Nachher: " + stateful1.getNumber());    }
    
    public static void main(String[] args) throws NamingException, Exception{
        new SessionClient().demonstrate();
    }


}
