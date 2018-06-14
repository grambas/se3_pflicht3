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
               
        System.out.println("Erstes StatelessBean Vorher: " + stateless.getNumber());
        stateless.increment();
        System.out.println("ErstesStatelessBean Nachher: " + stateless.getNumber());
        _Stateless stateless1 = (_Stateless) jndiContext.lookup(_Stateless.class.getName());
        System.out.println("Zweites StatelessBean: " + stateless1.getNumber());
        System.out.println();
        
        System.out.println("Erstes StatefulBean Vorher: " + stateful.getNumber());
        stateful.increment();
        System.out.println("Erstes StatefulBean Nachher: " + stateful.getNumber());
        _Stateful stateful1 = (_Stateful) jndiContext.lookup(_Stateful.class.getName());
        System.out.println("Zweites StatefulBean: " + stateful1.getNumber());
    }
    
    public static void main(String[] args) throws NamingException, Exception{
        new SessionClient().demonstrate();
    }


}
